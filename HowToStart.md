# Introduction #
> This app is a clone of [iosched](http://code.google.com/p/iosched/) app. It is stripped down to one day event, uncommented stuff we can not provide like wave, map etc and moved all hardcoded stuff into Setup.java class. Added some fancy GDD Graphics (you will find it in [\_pre\_production](http://code.google.com/p/gddsched/source/browse/#svn/trunk/assets/mdpi/_pre_production) folder)


# Step by Step #
  * Check out the trunk and import the project in eclipse. Try to launch it in emulator or on your android phone.
  * Find [Setup.java](http://code.google.com/p/gddsched/source/browse/trunk/src/com/kupriyanov/android/apps/gddsched/de/Setup.java) and investigate it. You will find all infos about event you can edit.
  * You will see something like

> public static final String WORKSHEETS\_URL = "http://spreadsheets.google.com/feeds/worksheets/0Akgh73WhU1qHdHJmSUlSb0JIckowX1ZiQkhsYmdkdkE/public/basic";
It is url of atom feed of the Spreadsheets with sessions data hosted on Google Docs.
  * Go to url https://spreadsheets.google.com/ccc?key=0Akgh73WhU1qHdHJmSUlSb0JIckowX1ZiQkhsYmdkdkE&hl=en&authkey=CIaKgpcD
or
[Google Templates](https://docs.google.com/templates?q=gddsched&sort=hottest&view=author)
and clone this document for you

  * Share the document as rss Feed - you will get new ID for your document.
  * Change this id in Setup.java in WORKSHEETS\_URL variable.
  * Open previous RSS-Feed in chrome and save each Spreadsheet (sessions, speakers, vendors) three files. You will these files in [assets](http://code.google.com/p/gddsched/source/browse/trunk/#trunk/assets) folder
    * cache-sessions.xml
    * cache-speakers.xml
    * cache-vendors.xml

Now you have your own instance of app. It reads your Spreadsheet and syncs it with app.

  * By changing the content of your Spreadsheets and pushing reload in your app you will get fresh data und see changes.


# Static Files To Change #
You will found them in [res/xml/](http://code.google.com/p/gddsched/source/browse/trunk/#trunk/res/xml)

  * blocks.xml - define time of none dynamic stuff lunch/pause/keynote
  * rooms.xml - define your rooms
  * tracks.xml - define your tracks

# Hints #
  * Warning: Check out hints in Spreadsheets and colored columns.
  * [Enable Log](http://code.google.com/p/gddsched/source/browse/trunk/src/com/google/android/apps/iosched/provider/ScheduleProvider.java#68) and validate initial import in your database via logcat.
  * On Errors in initial database import - validate your database with some tools like [Android-DB-Editor](https://github.com/simudvarac/Android-DB-Editor)
  * Some content of iosched is still there like [map](http://code.google.com/p/gddsched/source/browse/#svn/trunk/map).
  * You may want to rename the package name to be able to publish on the Android Market. You can do in eclipse. Do not forget to change it in the [Manifest.xml](http://code.google.com/p/gddsched/source/browse/trunk/AndroidManifest.xml) and in [Setup.java](http://code.google.com/p/gddsched/source/browse/trunk/src/com/kupriyanov/android/apps/gddsched/de/Setup.java)

# Nice to have #
  * Possibility to change room names without making new apk

# Relevant projects #
  * [iosched](http://code.google.com/p/iosched/)
  * [devoxx-schedule-android](http://code.google.com/p/devoxx-schedule-android/)
  * [Droidcon London App 2010](http://www.appbrain.com/app/droidcon-london-app-2010/novoda.droidconuk2010)
  * ...