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

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import com.kupriyanov.android.apps.gddsched.Setup;

/**
 * A helper for showing EULAs and storing a {@link SharedPreferences} bit
 * indicating whether the user has accepted.
 */
public class SetupHelper {
	protected static final String TAG = "SetupHelper";

	public static void loadCurrentSetup(final Context context) {
		Log.d(TAG, "loadCurrentSetup...");

		hasChosenSetup(context);
	}

	public static boolean hasChosenSetup(final Context context) {
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);

		final String event = sp.getString("setup_event_prefix", "");

		/*
		 * use RU2 event id instead of RU
		 */
		if (event.equals("") || event.equals("RU")) {
			return false;
		}

		if (event.equals(Setup.EVENT_ID_SELECTED)) {

			/*
			 * try to 
			 */
			if (Setup.CONFERENCE_START_MILLIS_DAY1 != 0) {
				return true;
			}

			Log.w(TAG, "missed start time for the chosen event:" + event);

		}

		setAcceptedEvent(context, Setup.EventId.valueOf(event));

		return !sp.getString("setup_event_prefix", "").equals("");

	}

	public static void setAcceptedEvent(final Context context, final Setup.EventId item) {
		// new AsyncTask<Void, Void, Void>() {
		// @Override
		// protected Void doInBackground(Void... voids) {

		String sClassName = Setup.SETUP_PACKAGE_NAME + ".Setup" + item;// android.app.NotificationManager";

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
		// return null;
		// }
		//
		// }.execute();
	}

}
