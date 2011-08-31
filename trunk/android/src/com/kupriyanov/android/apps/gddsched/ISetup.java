package com.kupriyanov.android.apps.gddsched;

import java.util.Locale;
import java.util.TimeZone;

import com.google.android.apps.iosched2.util.ParserUtils;

public interface ISetup {

	public static String WORKSHEETS_URL = "";// "http://spreadsheets.google.com/feeds/worksheets/0Akgh73WhU1qHdHJmSUlSb0JIckowX1ZiQkhsYmdkdkE/public/basic";

	public static TimeZone CONFERENCE_TIME_ZONE = TimeZone.getTimeZone("America/Sao_Paulo");

	// http://snipplr.com/view/23131/timezone-enum/
	public static String TIME_ZONE = "-0300"; // RFC 822 - time zone
	public static String TIME_ZONE_SPLITTED = "-03:00"; // RFC 822 - time
														// zone

	public static long CONFERENCE_START_MILLIS_DAY1 = ParserUtils.parseTime("2011-09-16T08:00:00.000-03:00");
	public static long CONFERENCE_END_MILLIS_DAY1 = ParserUtils.parseTime("2011-09-16T23:00:00.000-03:00");

	public static long CONFERENCE_START_MILLIS_DAY2 = ParserUtils.parseTime("2011-10-19T08:00:00.000-03:00");
	public static long CONFERENCE_END_MILLIS_DAY2 = ParserUtils.parseTime("2011-10-19T23:00:00.000-03:00");

	public static Locale LOCALE = new Locale("pt", "BR");

	// public static final Locale LOCALE = Locale.US;
	// public static final Locale LOCALE = Locale.GERMANY;

	public static String EVENT_YEAR = "2011";
	// public static final String DATETIME_FORMAT = "EEEE MMM d yyyy h:mma Z";
	public static final String DATETIME_FORMAT = "dd.MM.yyyy HH:mm Z";
	// public static final String CONFERNCE_URL =
	// "http://www.google.com/events/developerday/2011/";
	public static String CONFERNCE_URL = "http://www.google.com/events/developerday/2011/sao-paulo/";

	public static String CONFERENCE_HASHTAG = "#gdd11";

	public static boolean FEATURE_VENDORS_ON = false;
	public static boolean FEATURE_OFFICEHOURS_ON = false;
	public static boolean FEATURE_MAP_ON = false;
	public static boolean FEATURE_EULA_ON = false;
	public static boolean FEATURE_ANNOUNCEMENTS_ON = false;
	public static boolean FEATURE_MULTIEVENT_ON = true;

	
	public static String ANNOUNCEMENT_URL = "http://www.google.com/intl/pt-BR/events/developerday/2011/sao-paulo/faq.html";

	public static int CONFERENCE_DAYS = 1;

	public static String EVENT_PREFIX = ""; // br-
	public static String EVENT_PACKAGE_NAME = "gddsched";

	public static String CONTENT_AUTHORITY = "com.google.android.apps." + EVENT_PACKAGE_NAME;// com.kupriyanov.android.apps.gddsched";

	public static String EXTRA_TRACK = CONTENT_AUTHORITY + ".extra.TRACK";
	public static String EXTRA_STATUS_RECEIVER = CONTENT_AUTHORITY + ".extra.STATUS_RECEIVER";// "com.google.android.iosched.extra.STATUS_RECEIVER"
	public static String EXTRA_NEXT_TYPE = CONTENT_AUTHORITY + ".extra.NEXT_TYPE";
	public static String EXTRA_TIME_START = CONTENT_AUTHORITY + ".extra.TIME_START";
	public static String EXTRA_TIME_END = CONTENT_AUTHORITY + ".extra.TIME_END";
	public static String EXTRA_ROOM = CONTENT_AUTHORITY + ".extra.ROOM";
	public static String EXTRA_SCHEDULE_TIME_STRING = CONTENT_AUTHORITY + ".extra.SCHEDULE_TIME_STRING";
	public static String EXTRA_QUERY = CONTENT_AUTHORITY + ".extra.QUERY";

	/*
	 * Define Activities listed in Manifest + called vie Intents
	 */
	public static final Class<?> HomeActivityClass = com.google.android.apps.gddsched.ui.HomeActivity.class;
	public static final Class<?> BulletinActivityClass = com.google.android.apps.gddsched.ui.BulletinActivity.class;
	public static final Class<?> TagStreamActivityClass = com.google.android.apps.gddsched.ui.TagStreamActivity.class;
	public static final Class<?> StarredActivityClass = com.google.android.apps.gddsched.ui.StarredActivity.class;
	public static final Class<?> SearchActivityClass = com.google.android.apps.gddsched.ui.SearchActivity.class;
	public static final Class<?> ScheduleActivityClass = com.google.android.apps.gddsched.ui.phone.ScheduleActivity.class;
	public static final Class<?> TracksActivityClass = com.google.android.apps.gddsched.ui.phone.TracksActivity.class;
	public static final Class<?> SessionsActivityClass = com.google.android.apps.gddsched.ui.phone.SessionsActivity.class;
	public static final Class<?> SessionDetailActivityClass = com.google.android.apps.gddsched.ui.phone.SessionDetailActivity.class;
	public static final Class<?> VendorsActivityClass = com.google.android.apps.gddsched.ui.phone.VendorsActivity.class;
	public static final Class<?> VendorDetailActivityClass = com.google.android.apps.gddsched.ui.phone.VendorDetailActivity.class;
	public static final Class<?> MapActivityClass = com.google.android.apps.gddsched.ui.phone.MapActivity.class;
	public static final Class<?> SessionsMultiPaneActivityClass = com.google.android.apps.gddsched.ui.tablet.SessionsMultiPaneActivity.class;
	public static final Class<?> VendorsMultiPaneActivityClass = com.google.android.apps.gddsched.ui.tablet.VendorsMultiPaneActivity.class;
	public static final Class<?> ScheduleMultiPaneActivityClass = com.google.android.apps.gddsched.ui.tablet.ScheduleMultiPaneActivity.class;
	public static final Class<?> MapMultiPaneActivityClass = com.google.android.apps.gddsched.ui.tablet.MapMultiPaneActivity.class;
	public static final Class<?> NowPlayingMultiPaneActivityClass = com.google.android.apps.gddsched.ui.tablet.NowPlayingMultiPaneActivity.class;

	public static final Class<?> SessionsFragmentClass = com.google.android.apps.gddsched.ui.SessionsFragment.class;
	public static final Class<?> SessionDetailFragmentClass = com.google.android.apps.gddsched.ui.SessionDetailFragment.class;

	public static final Class<?> VendorsFragmentClass = com.google.android.apps.gddsched.ui.VendorsFragment.class;
	public static final Class<?> VendorDetailFragmentClass = com.google.android.apps.gddsched.ui.VendorDetailFragment.class;
	
	public static final Class<?> SetupActivityClass = com.google.android.apps.gddsched.ui.SetupActivity.class;
	
	
	

	// public static final Class<?> SyncStatusUpdaterFragmentClass =
	// com.google.android.apps.gddsched.ui.SyncStatusUpdaterFragment.class;

	public static final String CONTENT_TYPE_BLOCK = "vnd.android.cursor.dir/vnd." + EVENT_PACKAGE_NAME + ".block";
	public static final String CONTENT_ITEM_TYPE_BLOCK = "vnd.android.cursor.item/vnd." + EVENT_PACKAGE_NAME + ".block";

	public static final String CONTENT_TYPE_TRACK = "vnd.android.cursor.dir/vnd." + EVENT_PACKAGE_NAME + ".track";
	public static final String CONTENT_ITEM_TYPE_TRACK = "vnd.android.cursor.item/vnd." + EVENT_PACKAGE_NAME + ".track";

	public static final String CONTENT_TYPE_ROOM = "vnd.android.cursor.dir/vnd." + EVENT_PACKAGE_NAME + ".room";
	public static final String CONTENT_ITEM_TYPE_ROOM = "vnd.android.cursor.item/vnd." + EVENT_PACKAGE_NAME + ".room";

	public static final String CONTENT_TYPE_SESSION = "vnd.android.cursor.dir/vnd." + EVENT_PACKAGE_NAME + ".session";
	public static final String CONTENT_ITEM_TYPE_SESSION = "vnd.android.cursor.item/vnd." + EVENT_PACKAGE_NAME
			+ ".session";

	public static final String CONTENT_TYPE_SPEAKER = "vnd.android.cursor.dir/vnd." + EVENT_PACKAGE_NAME + ".speaker";
	public static final String CONTENT_ITEM_TYPE_SPEAKER = "vnd.android.cursor.item/vnd." + EVENT_PACKAGE_NAME
			+ ".speaker";

	public static final String CONTENT_TYPE_VENDOR = "vnd.android.cursor.dir/vnd." + EVENT_PACKAGE_NAME + ".vendor";
	public static final String CONTENT_ITEM_TYPE_VENDOR = "vnd.android.cursor.item/vnd." + EVENT_PACKAGE_NAME
			+ ".vendor";

	public static String ANALYTICS_CODE = "UACODE"; // INSERT_YOUR_ANALYTICS_UA_CODE_HERE

}