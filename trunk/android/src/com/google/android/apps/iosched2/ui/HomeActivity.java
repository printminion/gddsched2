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
import com.google.android.apps.iosched2.util.DetachableResultReceiver;
import com.google.android.apps.iosched2.util.EulaHelper;
import com.google.android.apps.iosched2.util.SetupHelper;
import com.kupriyanov.android.apps.gddsched.Setup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Front-door {@link Activity} that displays high-level features the schedule application offers to
 * users. Depending on whether the device is a phone or an Android 3.0+ tablet, different layouts
 * will be used. For example, on a phone, the primary content is a {@link DashboardFragment},
 * whereas on a tablet, both a {@link DashboardFragment} and a {@link TagStreamFragment} are
 * displayed.
 */
public class HomeActivity extends BaseActivity {
    private static final String TAG = "HomeActivity";

    private TagStreamFragment mTagStreamFragment;
    private SyncStatusUpdaterFragment mSyncStatusUpdaterFragment;

    public final int RESULT_SETUP = 1;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);
        getActivityHelper().setupActionBar(null, 0);

        initUI();
        
        
        if (Setup.FEATURE_MULTIEVENT_ON) {
	        if (!SetupHelper.hasChoosedSetup(this)) {
	        	
	        	startActivityForResult(new Intent(this, Setup.SetupActivityClass), RESULT_SETUP);
	        	
	        	//SetupHelper.showSetup(this);
	        	return;
	        }
        }
    }
    
    protected void initUI() {
        

        FragmentManager fm = getSupportFragmentManager();

        mTagStreamFragment = (TagStreamFragment) fm.findFragmentById(R.id.fragment_tag_stream);

        mSyncStatusUpdaterFragment = (SyncStatusUpdaterFragment) fm
                .findFragmentByTag(SyncStatusUpdaterFragment.TAG);
        if (mSyncStatusUpdaterFragment == null) {
            mSyncStatusUpdaterFragment = new SyncStatusUpdaterFragment();
            fm.beginTransaction().add(mSyncStatusUpdaterFragment,
                    SyncStatusUpdaterFragment.TAG).commit();

            if (!Setup.FEATURE_MULTIEVENT_ON) {
            	triggerRefresh();
            }
        }    	
    }
    
    @Override
    protected void onActivityResult(int arg0, int arg1, Intent arg2) {
    	
        if (Setup.FEATURE_EULA_ON) {
        	if (!EulaHelper.hasAcceptedEula(this)) {
                EulaHelper.showEula(false, this);
            }        
        }

        if (Setup.FEATURE_MULTIEVENT_ON) {
        	triggerRefresh();
        }
    	
    	super.onActivityResult(arg0, arg1, arg2);
    }


    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        getActivityHelper().setupHomeActivity();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.refresh_menu_items, menu);
        super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu_refresh) {
            triggerRefresh();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void triggerRefresh() {
        final Intent intent = new Intent(Intent.ACTION_SYNC, null, this, SyncService.class);
        intent.putExtra(SyncService.EXTRA_STATUS_RECEIVER, mSyncStatusUpdaterFragment.mReceiver);
        startService(intent);

        if (mTagStreamFragment != null) {
            mTagStreamFragment.refresh();
        }
    }

    private void updateRefreshStatus(boolean refreshing) {
        getActivityHelper().setRefreshActionButtonCompatState(refreshing);
    }

    /**
     * A non-UI fragment, retained across configuration changes, that updates its activity's UI
     * when sync status changes.
     */
    public static class SyncStatusUpdaterFragment extends Fragment
            implements DetachableResultReceiver.Receiver {
        public static final String TAG = SyncStatusUpdaterFragment.class.getName();

        private boolean mSyncing = false;
        private DetachableResultReceiver mReceiver;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setRetainInstance(true);
            mReceiver = new DetachableResultReceiver(new Handler());
            mReceiver.setReceiver(this);
        }

        /** {@inheritDoc} */
        public void onReceiveResult(int resultCode, Bundle resultData) {
            HomeActivity activity = (HomeActivity) getActivity();
            if (activity == null) {
                return;
            }

            switch (resultCode) {
                case SyncService.STATUS_RUNNING: {
                    mSyncing = true;
                    break;
                }
                case SyncService.STATUS_FINISHED: {
                    mSyncing = false;
                    break;
                }
                case SyncService.STATUS_ERROR: {
                    // Error happened down in SyncService, show as toast.
                    mSyncing = false;
                    final String errorText = getString(R.string.toast_sync_error, resultData
                            .getString(Intent.EXTRA_TEXT));
                    Toast.makeText(activity, errorText, Toast.LENGTH_LONG).show();
                    break;
                }
            }

            activity.updateRefreshStatus(mSyncing);
        }

        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            ((HomeActivity) getActivity()).updateRefreshStatus(mSyncing);
        }
    }
}
