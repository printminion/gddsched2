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

import com.google.android.apps.iosched2.ui.widget.BlockView;
import com.google.android.apps.iosched2.ui.widget.BlocksLayout;
import com.google.android.apps.iosched2.ui.widget.ObservableScrollView;
import com.google.android.apps.iosched2.ui.widget.Workspace;
import com.google.android.apps.iosched2.util.NotifyingAsyncQueryHandler;

import android.view.View;

/**
 * Shows a horizontally-pageable calendar of conference days. Horizontaly paging
 * is achieved using {@link Workspace}, and the primary UI classes for rendering
 * the calendar are
 * {@link com.google.android.apps.iosched2.ui.widget.TimeRulerView},
 * {@link BlocksLayout}, and {@link BlockView}.
 */
public class ScheduleFragment extends
		com.google.android.apps.iosched2.ui.ScheduleFragment implements
		NotifyingAsyncQueryHandler.AsyncQueryListener,
		ObservableScrollView.OnScrollListener, View.OnClickListener {

}
