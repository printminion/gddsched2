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

import com.google.android.apps.gddsched.R;
import com.google.android.apps.gddsched.service.SyncService;
//import com.google.android.apps.iosched2.util.AnalyticsUtils;
import com.google.android.apps.iosched2.ui.SetupFragment.onSetupSelectedListener;
import com.google.android.apps.iosched2.util.DetachableResultReceiver;
import com.google.android.apps.iosched2.util.EulaHelper;
import com.google.android.apps.iosched2.util.SetupHelper;
import com.kupriyanov.android.apps.gddsched.Setup;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Front-door {@link Activity} that displays high-level features the schedule
 * application offers to users. Depending on whether the device is a phone or an
 * Android 3.0+ tablet, different layouts will be used. For example, on a phone,
 * the primary content is a {@link DashboardFragment}, whereas on a tablet, both
 * a {@link DashboardFragment} and a {@link TagStreamFragment} are displayed.
 */
public class SetupActivity extends BaseActivity {
	private static final String TAG = "SetupActivity";
	private SetupFragment mSetupFragment;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_setup);
        
        FragmentManager fm = getSupportFragmentManager();

        mSetupFragment = (SetupFragment) fm.findFragmentById(R.id.fragment_setup_dashboard);
        
        
        mSetupFragment.onSetupSelected(getApplicationContext(), new onSetupSelectedListener() {
			
			@Override
			public void setupSelected(int setupId) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), "setupSelected:" + setupId, Toast.LENGTH_SHORT).show();
				setResult(RESULT_OK);
				finish();
			}
		});

    }

	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		super.onBackPressed();
	}

}
