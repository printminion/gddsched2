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

package com.google.android.apps.iosched2.ui;

import gdd11.app.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.apps.iosched2.util.AnalyticsUtils;
import com.google.android.apps.iosched2.util.SetupHelper;
import com.kupriyanov.android.apps.gddsched.Setup;

public class SetupFragment extends Fragment {

	private onSetupSelectedListener mListener;

	public interface onSetupSelectedListener {
		void setupSelected(Setup.EventId setupId);
	}

	public void fireTrackerEvent(String label) {
		AnalyticsUtils.getInstance(getActivity()).trackEvent("Setup Screen Dashboard", "Click", label, 0);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View root = inflater.inflate(R.layout.fragment_setup_dashboard, container);

		// this.onActivityResult(requestCode, resultCode, data)

		// Attach event handlers
		root.findViewById(R.id.home_btn_sao_pulo).setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				validateSetting("Setup/BR", Setup.EventId.BR, R.string.btn_sao_paulo);
			}

		});

		root.findViewById(R.id.home_btn_buenos_aires).setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				validateSetting("Setup/AR", Setup.EventId.AR, R.string.btn_buenos_aires);
			}

		});

		root.findViewById(R.id.home_btn_moscow).setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				validateSetting("Setup/RU", Setup.EventId.RU, R.string.btn_moscow);
			}

		});

		root.findViewById(R.id.home_btn_prague).setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				validateSetting("Setup/CZ", Setup.EventId.CZ, R.string.btn_prague);
			}

		});

		root.findViewById(R.id.home_btn_tokyo).setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				validateSetting("Setup/JP", Setup.EventId.JP, R.string.btn_tokyo);
			}

		});

		root.findViewById(R.id.home_btn_sydney).setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				validateSetting("Setup/AU", Setup.EventId.AU, R.string.btn_sydney);
			}

		});

		root.findViewById(R.id.home_btn_tel_aviv).setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				validateSetting("Setup/IL", Setup.EventId.IL, R.string.btn_tel_aviv);
			}

		});

		root.findViewById(R.id.home_btn_berlin).setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				validateSetting("Setup/DE", Setup.EventId.DE, R.string.btn_berlin);
			}

		});

		return root;
	}

	public void onSetupSelected(Context mContext, onSetupSelectedListener mListener) {
		this.mListener = mListener;
	}

	protected void validateSetting(final String trackerEvent, final Setup.EventId eventId, final int cityId) {

		AlertDialog.Builder eventConfirmation = new AlertDialog.Builder(getActivity())
				.setTitle(R.string.setup_confirm_title)
				.setIcon(android.R.drawable.ic_dialog_info)
				.setMessage(getString(R.string.setup_confirm_text, getText(cityId)));

		eventConfirmation.setPositiveButton(R.string.setup_accept,
				new android.content.DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						fireTrackerEvent(trackerEvent);
						mListener.setupSelected(eventId);
						dialog.dismiss();
					}
				}).setNegativeButton(R.string.setup_decline, new android.content.DialogInterface.OnClickListener() {
			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
			}
		});

		eventConfirmation.show();
	}

}
