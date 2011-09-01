/*
 * Copyright 2011 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.apps.iosched2.util;

import java.lang.reflect.Field;

import com.google.android.apps.gddsched.R;
import com.kupriyanov.android.apps.gddsched.ISetup;
import com.kupriyanov.android.apps.gddsched.Setup;
import com.kupriyanov.android.apps.gddsched.SetupBR;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.util.Log;
import android.widget.Toast;

/**
 * A helper for showing EULAs and storing a {@link SharedPreferences} bit
 * indicating whether the user has accepted.
 */
public class SetupHelper {
	protected static final String TAG = "SetupHelper";

	public static boolean hasChoosedSetup(final Context context) {
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);

		final String event = sp.getString("setup_event_prefix", "");

		if (event.equals("") || Setup.EVENT_ID_SELECTED == null || Setup.EVENT_ID_SELECTED.equals("")) {
			return false;
		}

		if (event.equals(Setup.EVENT_ID_SELECTED)) {
			return true;
		}

		setAcceptedEvent(context, Setup.EVENT_ID.valueOf(event));

		return !sp.getString("setup_event_prefix", "").equals("");
	}

	public static void setAcceptedEvent(final Context context, final Setup.EVENT_ID item) {
		// new AsyncTask<Void, Void, Void>() {
		// @Override
		// protected Void doInBackground(Void... voids) {

		String sClassName = Setup.SETUP_PACKAGE_NAME + ".SetupBR";// android.app.NotificationManager";

		@SuppressWarnings("rawtypes")
		Class setupTarget;
		try {
			setupTarget = Class.forName(sClassName);

			// final Class<ISetup> setupTarget = class.getClasses();

			final Field[] fields = setupTarget.getDeclaredFields();

			for (int i = 0; i < setupTarget.getDeclaredFields().length; i++) {

				// try {

				Log.d(TAG, i + ":" + fields[i].getName() + " = " + fields[i].get(null));

				Setup.class.getDeclaredField(fields[i].getName()).set(null, fields[i].get(null));
				Log.v(TAG, "Set new value of " + fields[i].getName() + " = " + fields[i].get(null));

				// } catch (Exception e) {
				// // TODO: handle exception
				// Log.e(TAG,
				// "Failed " + i + " to set new value of " +
				// fields[i].getName() + ":" + e.toString());
				// }

			}

			AnalyticsUtils.getInstance(context).trackPageView("/Setup/" + Setup.EVENT_PREFIX);

			SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);

			Setup.EVENT_ID_SELECTED = item.toString();

			sp.edit().putString("setup_event_prefix", Setup.EVENT_ID_SELECTED).commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
//		return null;
		// }
		//
		// }.execute();
	}

	// /**
	// * Show End User License Agreement.
	// *
	// * @param accepted
	// * True IFF user has accepted license already, which means it can
	// * be dismissed. If the user hasn't accepted, then the EULA must
	// * be accepted or the program exits.
	// * @param activity
	// * Activity started from.
	// */
	// public static void showSetup(final Activity activity) {
	//
	// AnalyticsUtils.getInstance(activity).trackPageView("/Setup");
	//
	// AlertDialog.Builder builder = new
	// AlertDialog.Builder(activity).setTitle(R.string.setup_text).setIcon(
	// android.R.drawable.ic_dialog_info);
	//
	// // .setMessage(R.string.setup_text);
	// //
	//
	// builder.setItems(Setup.EVENTS_NAMES, new
	// DialogInterface.OnClickListener() {
	// public void onClick(DialogInterface dialog, int item) {
	// Toast.makeText(activity, Setup.EVENTS_NAMES[item],
	// Toast.LENGTH_SHORT).show();
	// setAcceptedEvent(activity, item);
	// dialog.dismiss();
	// }
	// });
	//
	// builder.show();
	// }
}
