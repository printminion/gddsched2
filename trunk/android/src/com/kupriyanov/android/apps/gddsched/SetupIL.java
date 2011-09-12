package com.kupriyanov.android.apps.gddsched;

import gdd11.app.R.xml;

import java.util.Locale;
import java.util.TimeZone;

import com.google.android.apps.iosched2.util.ParserUtils;

public class SetupIL implements ISetup {

	public static int BLOCKS_XML = xml.il_blocks;
	public static int ROOMS_XML = xml.il_rooms;

	public static final String WORKSHEETS_URL = "http://spreadsheets.google.com/feeds/worksheets/0An8ZzsaUDpaudEQyNUhGWVdaTDQ0OHVuZFVLLTc4YUE/public/basic";
	public static TimeZone CONFERENCE_TIME_ZONE = TimeZone.getTimeZone("Asia/Tel_Aviv");

	/*
	 * http://snipplr.com/view/23131/timezone-enum/
	 */
	public static final String TIME_ZONE = "+0200"; // RFC 822 - time zone
	public static final String TIME_ZONE_SPLITTED = "+02:00"; // RFC 822 - time

	public static final long CONFERENCE_START_MILLIS_DAY1 = ParserUtils.parseTime("2011-11-13T08:00:00.000+02:00");
	public static final long CONFERENCE_END_MILLIS_DAY1 = ParserUtils.parseTime("2011-11-13T17:00:00.000+02:00");

	/*
	 * http://www.herongyang.com/JDK/Locale-java-util-Local-Localization.html
	 */
	public static final Locale LOCALE = new Locale("iw", "IL");

	public static final String CONFERNCE_URL = "http://www.google.com/events/developerday/2011/sydney/";

	public static final String CONFERENCE_HASHTAG = "#gdd11 #gddil";

	public static final boolean FEATURE_VENDORS_ON = false;
	public static final boolean FEATURE_OFFICEHOURS_ON = false;
	public static final boolean FEATURE_MAP_ON = false;
	public static final boolean FEATURE_ANNOUNCEMENTS_ON = false;
	public static final String ANNOUNCEMENT_URL = "http://www.google.com/events/developerday/2011/tel-aviv/faq.html";

	public static final String EVENT_PREFIX = "il_";

}