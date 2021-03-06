package com.kupriyanov.android.apps.gddsched;

import gdd11.app.R.xml;

import java.util.Locale;
import java.util.TimeZone;

import com.google.android.apps.iosched2.util.ParserUtils;

public interface ISetup {

	public static int BLOCKS_XML = xml.blocks;
	public static int ROOMS_XML = xml.rooms;

	public static String EVENT_ID_SELECTED = null;

	public static String BLOCK_TITLE_BREAKOUT_SESSIONS = "Breakout sessions";

	
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

	public static String EVENT_PREFIX = ""; // e.g "br-"
	public static String EVENT_PACKAGE_NAME = "gdd11.app";

	public static String SETUP_PACKAGE_NAME = "com.kupriyanov.android.apps.gddsched";

	public static String CONTENT_AUTHORITY = "gdd11.app";// com.kupriyanov.android.apps.gddsched";

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
	public static final Class<?> HomeActivityClass = gdd11.app.ui.HomeActivity.class;
	public static final Class<?> BulletinActivityClass = gdd11.app.ui.BulletinActivity.class;
	public static final Class<?> TagStreamActivityClass = gdd11.app.ui.TagStreamActivity.class;
	public static final Class<?> StarredActivityClass = gdd11.app.ui.StarredActivity.class;
	public static final Class<?> SearchActivityClass = gdd11.app.ui.SearchActivity.class;
	public static final Class<?> ScheduleActivityClass = gdd11.app.ui.phone.ScheduleActivity.class;
	public static final Class<?> TracksActivityClass = gdd11.app.ui.phone.TracksActivity.class;
	public static final Class<?> SessionsActivityClass = gdd11.app.ui.phone.SessionsActivity.class;
	public static final Class<?> SessionDetailActivityClass = gdd11.app.ui.phone.SessionDetailActivity.class;
	public static final Class<?> VendorsActivityClass = gdd11.app.ui.phone.VendorsActivity.class;
	public static final Class<?> VendorDetailActivityClass = gdd11.app.ui.phone.VendorDetailActivity.class;
	public static final Class<?> MapActivityClass = gdd11.app.ui.phone.MapActivity.class;
	public static final Class<?> SessionsMultiPaneActivityClass = gdd11.app.ui.tablet.SessionsMultiPaneActivity.class;
	public static final Class<?> VendorsMultiPaneActivityClass = gdd11.app.ui.tablet.VendorsMultiPaneActivity.class;
	public static final Class<?> ScheduleMultiPaneActivityClass = gdd11.app.ui.tablet.ScheduleMultiPaneActivity.class;
	public static final Class<?> MapMultiPaneActivityClass = gdd11.app.ui.tablet.MapMultiPaneActivity.class;
	public static final Class<?> NowPlayingMultiPaneActivityClass = gdd11.app.ui.tablet.NowPlayingMultiPaneActivity.class;

	public static final Class<?> SessionsFragmentClass = gdd11.app.ui.SessionsFragment.class;
	public static final Class<?> SessionDetailFragmentClass = gdd11.app.ui.SessionDetailFragment.class;

	public static final Class<?> VendorsFragmentClass = gdd11.app.ui.VendorsFragment.class;
	public static final Class<?> VendorDetailFragmentClass = gdd11.app.ui.VendorDetailFragment.class;

	public static final Class<?> SetupActivityClass = gdd11.app.ui.SetupActivity.class;

	// public static final Class<?> SyncStatusUpdaterFragmentClass =
	// gdd11.ui.SyncStatusUpdaterFragment.class;

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

	/*
	 * TODO: INSERT_YOUR_ANALYTICS_UA_CODE_HERE
	 */
	public static String ANALYTICS_CODE = "UACODE"; 

}