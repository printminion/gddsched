package com.kupriyanov.android.apps.gddsched.jp;

import java.util.Locale;
import java.util.TimeZone;

import com.google.android.apps.iosched.util.ParserUtils;

public class Setup {

	public static final String WORKSHEETS_URL = "http://spreadsheets.google.com/feeds/worksheets/0Akgh73WhU1qHdHA4SzBWQ2xhLXJrajNFSG1YWEdLTHc/public/basic";
	public static final String EXTRA_STATUS_RECEIVER = "com.kupriyanov.android.gddsched.jp.extra.STATUS_RECEIVER";
	public static final TimeZone CONFERENCE_TIME_ZONE = TimeZone.getTimeZone("Asia/Tokyo");

	public static final String TIME_ZONE = "+0900"; // RFC 822 - time zone

	public static final String DAY1_START = "2010-09-28T10:00:00.000+09:00";
	public static final String DAY1_END = "2010-09-28T16:45:00.000+09:00";
	
	public static final String DAY2_START = "";

	public static final long CONFERENCE_START_MILLIS = ParserUtils.parseTime(DAY1_START);
	public static final long CONFERENCE_END_MILLIS = ParserUtils.parseTime(DAY1_END);

	
	public static final Locale LOCALE = Locale.US;

	public static final String EVENT_YEAR = "2010";
	// public static final String DATETIME_FORMAT = "EEEE MMM d yyyy h:mma Z";
	public static final String DATETIME_FORMAT = "dd.MM.yyyy HH:mm Z";
	public static final String CONFERNCE_URL = "http://www.google.de/intl/en/events/developerday/2010/";
	public static final String CONTENT_AUTHORITY = "com.kupriyanov.android.apps.gddsched.jp";
	public static final String DATABASE_NAME = "schedule_jp.db";
	public static final boolean USE_WIFI_CHECK = false;


}