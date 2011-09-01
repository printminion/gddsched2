package com.kupriyanov.android.apps.gddsched;

import java.util.Locale;
import java.util.TimeZone;

import com.google.android.apps.iosched2.util.ParserUtils;

public class Setup implements ISetup {

	public static String EVENT_ID_SELECTED = null;

	public static CharSequence[] EVENTS_NAMES = { "Sao Paulo - Sep 16", "Buenos Aires - Sep 19-20", "Moscow - Oct 10",
			"Prague - Oct 18", "Tokyo - Nov 1", "Sydney - Nov 8", "Tel-Aviv - Nov 13", "Berlin - Nov 19" };

	public enum EVENT_ID {
		EVENT_SAO_PAULO, EVENT_BUENOS_AIRES, EVENT_MOSCOW, EVENT_PRAGUE, EVENT_TOKYO, EVENT_SYDNEY, EVENT_TEL_AVIV, EVENT_BERLIN
	}

	// http://spreadsheets.google.com/feeds/worksheets/0Akgh73WhU1qHdHJmSUlSb0JIckowX1ZiQkhsYmdkdkE/public/basic

	// public static String WORKSHEETS_URL =
	// "http://spreadsheets.google.com/feeds/worksheets/0Akgh73WhU1qHdHJmSUlSb0JIckowX1ZiQkhsYmdkdkE/public/basic";

	public static String WORKSHEETS_URL = "";// "http://spreadsheets.google.com/feeds/worksheets/0Akgh73WhU1qHdHJmSUlSb0JIckowX1ZiQkhsYmdkdkE/public/basic";

	public static TimeZone CONFERENCE_TIME_ZONE = TimeZone.getTimeZone("America/Sao_Paulo");
	// public static TimeZone CONFERENCE_TIME_ZONE =
	// TimeZone.getTimeZone("Europe/Prague");
	// public static TimeZone CONFERENCE_TIME_ZONE =
	// TimeZone.getTimeZone("Europe/Berlin");

	// http://snipplr.com/view/23131/timezone-enum/
	public static String TIME_ZONE = "-0300"; // RFC 822 - time zone
	public static String TIME_ZONE_SPLITTED = "-03:00"; // RFC 822 - time
														// zone

	public static long CONFERENCE_START_MILLIS_DAY1 = ParserUtils.parseTime("2011-09-16T08:00:00.000-03:00");
	public static long CONFERENCE_END_MILLIS_DAY1 = ParserUtils.parseTime("2011-09-16T23:00:00.000-03:00");

	public static long CONFERENCE_START_MILLIS_DAY2 = ParserUtils.parseTime("2011-10-19T08:00:00.000-03:00");
	public static long CONFERENCE_END_MILLIS_DAY2 = ParserUtils.parseTime("2011-10-19T23:00:00.000-03:00");

	public static Locale LOCALE = new Locale("pt", "BR");

	// public static Locale LOCALE = Locale.US;
	// public static Locale LOCALE = Locale.GERMANY;

	public static String EVENT_YEAR = "2011";
	// public static String DATETIME_FORMAT = "EEEE MMM d yyyy h:mma Z";
	public static String DATETIME_FORMAT = "dd.MM.yyyy HH:mm Z";
	// public static String CONFERNCE_URL =
	// "http://www.google.com/events/developerday/2011/";
	public static String CONFERNCE_URL = "http://www.google.com/events/developerday/2011/sao-paulo/";

	public static String CONFERENCE_HASHTAG = "#gdd11";

	public static boolean FEATURE_VENDORS_ON = false;
	public static boolean FEATURE_OFFICEHOURS_ON = false;
	public static boolean FEATURE_MAP_ON = false;
	public static boolean FEATURE_ANNOUNCEMENTS_ON = true;
	
	public static String ANNOUNCEMENT_URL = "http://www.google.com/intl/pt-BR/events/developerday/2011/sao-paulo/faq.html";

	public static int CONFERENCE_DAYS = 1;

	public static String EVENT_PREFIX = "";

	public static String CONTENT_AUTHORITY = "com.google.android.apps.gddsched";// com.kupriyanov.android.apps.gddsched";

	public static String ANALYTICS_CODE = "UACODEDUMMY"; // INSERT_YOUR_ANALYTICS_UA_CODE_HERE

}