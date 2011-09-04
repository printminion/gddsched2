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

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.apps.gddsched.R;
import com.google.android.apps.iosched2.util.AnalyticsUtils;
import com.kupriyanov.android.apps.gddsched.Setup;

public class SetupFragment extends Fragment {

	private onSetupSelectedListener mListener;
	
	public interface onSetupSelectedListener {
		void setupSelected(Setup.EventId setupId);
	}
	
    public void fireTrackerEvent(String label) {
        AnalyticsUtils.getInstance(getActivity()).trackEvent(
                "Setup Screen Dashboard", "Click", label, 0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_setup_dashboard, container);

        
//        this.onActivityResult(requestCode, resultCode, data)
        
        // Attach event handlers
        root.findViewById(R.id.home_btn_sao_pulo).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                fireTrackerEvent("Setup/BR");
                mListener.setupSelected(Setup.EventId.BR);
            }
            
        });

        
        root.findViewById(R.id.home_btn_buenos_aires).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                fireTrackerEvent("Setup/AR");
                mListener.setupSelected(Setup.EventId.AR);
            }
            
        });
        
        root.findViewById(R.id.home_btn_moscow).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                fireTrackerEvent("Setup/RU");
                mListener.setupSelected(Setup.EventId.RU);
            }
            
        });
        
        root.findViewById(R.id.home_btn_prague).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                fireTrackerEvent("Setup/CZ");
                mListener.setupSelected(Setup.EventId.CZ);
            }
            
        });
        
        root.findViewById(R.id.home_btn_tokyo).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                fireTrackerEvent("Setup/JP");
                mListener.setupSelected(Setup.EventId.JP);
            }
            
        });
        
        root.findViewById(R.id.home_btn_sydney).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                fireTrackerEvent("Setup/AU");
                mListener.setupSelected(Setup.EventId.AU);
            }
            
        });
        
        root.findViewById(R.id.home_btn_tel_aviv).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                fireTrackerEvent("Setup/IL");
                mListener.setupSelected(Setup.EventId.LI);
            }
            
        });
        
        root.findViewById(R.id.home_btn_berlin).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                fireTrackerEvent("Setup/DE");
                mListener.setupSelected(Setup.EventId.DE);
            }
            
        });

//        root.findViewById(R.id.home_btn_sessions).setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                fireTrackerEvent("Sessions");
//                // Launch sessions list
//                if (UIUtils.isHoneycombTablet(getActivity())) {
//                    //startActivity(new Intent(getActivity(), SessionsMultiPaneActivity.class));
//                    startActivity(new Intent(getActivity(), Setup.SessionsMultiPaneActivityClass));
//                    
//                } else {
//                    final Intent intent = new Intent(Intent.ACTION_VIEW,
//                            ScheduleContract.Tracks.CONTENT_URI);
//                    intent.putExtra(Intent.EXTRA_TITLE, getString(R.string.title_session_tracks));
//                    intent.putExtra(TracksFragment.EXTRA_NEXT_TYPE,
//                            TracksFragment.NEXT_TYPE_SESSIONS);
//                    startActivity(intent);
//                }
//
//            }
//        });
//
//        root.findViewById(R.id.home_btn_starred).setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                fireTrackerEvent("Starred");
//                // Launch list of sessions and vendors the user has starred
//                //startActivity(new Intent(getActivity(), StarredActivity.class));
//                startActivity(new Intent(getActivity(), Setup.StarredActivityClass));
//                
//            }
//        });
//
//        if (!Setup.FEATURE_VENDORS_ON) {
//        	root.findViewById(R.id.home_btn_vendors).setVisibility(View.INVISIBLE);
//        }
//        
//        root.findViewById(R.id.home_btn_vendors).setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                fireTrackerEvent("Sandbox");
//                // Launch vendors list
//                if (UIUtils.isHoneycombTablet(getActivity())) {
//                    //startActivity(new Intent(getActivity(), VendorsMultiPaneActivity.class));
//                    startActivity(new Intent(getActivity(), Setup.VendorsMultiPaneActivityClass));
//                    
//                } else {
//                    final Intent intent = new Intent(Intent.ACTION_VIEW,
//                            ScheduleContract.Tracks.CONTENT_URI);
//                    intent.putExtra(Intent.EXTRA_TITLE, getString(R.string.title_vendor_tracks));
//                    intent.putExtra(TracksFragment.EXTRA_NEXT_TYPE,
//                            TracksFragment.NEXT_TYPE_VENDORS);
//                    startActivity(intent);
//                }
//            }
//        });
//
//        if (!Setup.FEATURE_MAP_ON) {
//        	root.findViewById(R.id.home_btn_map).setVisibility(View.INVISIBLE);
//        }
//        
//        root.findViewById(R.id.home_btn_map).setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                // Launch map of conference venue
//                fireTrackerEvent("Map");
//                startActivity(new Intent(getActivity(),
//                        UIUtils.getMapActivityClass(getActivity())));
//            }
//        });
//
//        if (!Setup.FEATURE_ANNOUNCEMENTS_ON) {
//        	root.findViewById(R.id.home_btn_announcements).setVisibility(View.INVISIBLE);
//        }
//        
//        root.findViewById(R.id.home_btn_announcements).setOnClickListener(
//                new View.OnClickListener() {
//                    public void onClick(View view) {
//                        // splicing in tag streamer
//                        fireTrackerEvent("Bulletin");
//                        //Intent intent = new Intent(getActivity(), BulletinActivity.class);
//                        Intent intent = new Intent(getActivity(), Setup.BulletinActivityClass);
//                        
//                        startActivity(intent);
//                    }
//                });

        return root;
    }
    
    public void onSetupSelected(Context mContext, onSetupSelectedListener mListener) {
    	this.mListener = mListener;
    }
    
    
    
}
