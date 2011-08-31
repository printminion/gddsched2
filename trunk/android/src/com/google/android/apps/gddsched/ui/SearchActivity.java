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

package com.google.android.apps.gddsched.ui;

/**
 * An activity that shows session and sandbox search results. This activity can
 * be either single or multi-pane, depending on the device configuration. We
 * want the multi-pane support that {@link BaseMultiPaneActivity} offers, so we
 * inherit from it instead of {@link BaseSinglePaneActivity}.
 */
public class SearchActivity extends
		com.google.android.apps.iosched2.ui.SearchActivity {

}
