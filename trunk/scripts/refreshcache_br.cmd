@echo off

echo get data for data...

cd %~dp0

%~d0


SET KEY=0An8ZzsaUDpaudHRlMi1WRjl3TWFOOFZDeGxhS3Bndmc
SET EVENTPREFIX=br_

wget -O../android/assets/%EVENTPREFIX%cache-sessions.xml --no-check-certificate http://spreadsheets.google.com/feeds/list/%KEY%/od6/public/basic?prettyprint=true

wget -O../android/assets/%EVENTPREFIX%cache-speakers.xml --no-check-certificate http://spreadsheets.google.com/feeds/list/%KEY%/od7/public/basic?prettyprint=true

wget -O../android/assets/%EVENTPREFIX%cache-vedors.xml --no-check-certificate http://spreadsheets.google.com/feeds/list/%KEY%/od4/public/basic?prettyprint=true

rem pause