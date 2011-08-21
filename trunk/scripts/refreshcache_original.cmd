Set MyCurDir=%~dp0

cd %MyCurDir%

wget -Ocache-sessions.xml --no-check-certificate https://spreadsheets.google.com/feeds/list/tmaLiaNqIWYYtuuhmIyG0uQ/od6/public/basic?prettyprint=true


wget -Ocache-speakers.xml --no-check-certificate https://spreadsheets.google.com/feeds/list/tmaLiaNqIWYYtuuhmIyG0uQ/od7/public/basic?prettyprint=true

wget -Ocache-speakers.xml --no-check-certificate https://spreadsheets.google.com/feeds/list/tmaLiaNqIWYYtuuhmIyG0uQ/od4/public/basic?prettyprint=true

pause