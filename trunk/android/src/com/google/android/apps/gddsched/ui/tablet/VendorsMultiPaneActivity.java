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

package com.google.android.apps.gddsched.ui.tablet;

/**
 * A multi-pane activity, consisting of a {@link TracksDropdownFragment}, a
 * {@link VendorsFragment}, and {@link VendorDetailFragment}. This activity is
 * very similar in function to {@link SessionsMultiPaneActivity}.
 * 
 * This activity requires API level 11 or greater because
 * {@link TracksDropdownFragment} requires API level 11.
 */
public class VendorsMultiPaneActivity extends
		com.google.android.apps.iosched2.ui.tablet.VendorsMultiPaneActivity {

}
