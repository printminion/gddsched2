package com.kupriyanov.android.apps.gddsched;

import gdd11.app.R.xml;

import java.util.Locale;
import java.util.TimeZone;

import com.google.android.apps.iosched2.util.ParserUtils;

public class SetupAU implements ISetup {

	public static int BLOCKS_XML = xml.au_blocks;
	public static int ROOMS_XML = xml.au_rooms;

	public static final String WORKSHEETS_URL = "http://spreadsheets.google.com/feeds/worksheets/0An8ZzsaUDpaudGIyN1ZCRmVZeWZ0bjVpRFBlRTZVc0E/public/basic";
	public static TimeZone CONFERENCE_TIME_ZONE = TimeZone.getTimeZone("Australia/Sydney");

	/*
	 * http://snipplr.com/view/23131/timezone-enum/
	 */
	public static final String TIME_ZONE = "+1000"; // RFC 822 - time zone
	public static final String TIME_ZONE_SPLITTED = "+10:00"; // RFC 822 - time

	public static final long CONFERENCE_START_MILLIS_DAY1 = ParserUtils.parseTime("2011-11-08T08:00:00.000+10:00");
	public static final long CONFERENCE_END_MILLIS_DAY1 = ParserUtils.parseTime("2011-11-08T23:00:00.000+10:00");

	/*
	 * http://www.herongyang.com/JDK/Locale-java-util-Local-Localization.html
	 */
	public static final Locale LOCALE = new Locale("en", "AU");

	public static final String CONFERNCE_URL = "http://www.google.com/events/developerday/2011/sydney/";

	public static final String CONFERENCE_HASHTAG = "#gdd11 #gddau";

	public static final boolean FEATURE_VENDORS_ON = false;
	public static final boolean FEATURE_OFFICEHOURS_ON = false;
	public static final boolean FEATURE_MAP_ON = false;
	public static final boolean FEATURE_ANNOUNCEMENTS_ON = false;
	public static final String ANNOUNCEMENT_URL = "http://www.google.com/events/developerday/2011/sydney/faq.html";

	public static final String EVENT_PREFIX = "au_";

}