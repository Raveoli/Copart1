# Copart1

Team members:
Raveena R Hegde rxh160530
Vidya Sri Mani vxm163230

-------------------------------------------------------------------------------------------------------------------------------
Problem
Programming Assignment - License Keys (Simple) (10 points)
We are given a string S consisting of N characters and an integer K. The string represents software license key which we would like to format. The string is composed of alphanumeric characters and dashes. The dashes split the string into groups (i.e if there are M dashes, the string is split into M+1 groups). The dashes in the string are possibly misplaced.
We want each group of characters to be of the length K (except for possibly the first group which could be shorter). All lowercase letters must be converted to uppercase.

File : LicenseKeys.java
Command line input Input: string S and integer K, eg 2-4A0r7-4k 4
The Output: License in uppercase grouped at kth position, eg 24A0-R74K

-------------------------------------------------------------------------------------------------------------------------------
Problem
Convert String to Integer (Simple) (10 points)
Without using any Integer functions like parseInt/valueOf convert the String to Integer. e.g. String input = “1234” - > Integer output=1234.

File : StringToInteger.java
Command line input : number as String, eg. "1234" or "-1234"
Output : Integer of specified string number. eg., 1234
Idea : Considers the string array, takes the sign into account, reads each character and puts it in its 10s position

---------------------------------------------------------------------------------------------------------------------------------
Problem
Coding Exercises - Problem statements (JavaScript or ReactJS) (30 points)

ReactJS - UI or JavaScript Build components:

Phone Component: validation and auto format. a). As you enter numbers, the phone field should auto format. Format should look like (123) 456-7890. b). As you delete/backspace numbers from right to left, the format should auto adjust. After removing last 4 digits, the hyphen should go away and rest of the numbers format remain same: (123) 456 but should display error message:Invalid phone number, if user leaves field incomplete and goes to another field:

Address Component:

a). Build component to fetch full address as user enters street address, using Google API.

b). Address fields should be editable after populating address from google api.

Address:______ Street name 1: ______ Street Name 2:_____ City:_____ State:______ Zipcode:_____

File: index.html

Idea: Used javascript to autocomplete phone number and used Google API to autofill address fields

---------------------------------------------------------------------------------------------------------------------------------
Problem:
JS Library/framework* based - Nested ListView (Simple) (10 points)

The Problem:

JS based ListView - Must have multiple Nested list views - (eg) Countries, States, Cities.

Single JSON response vs Multiple JSON response - Showcase both.
Reuse components and reuse data from cache/store [*] - Use React or AngularJS or ember or backbone or one of the modern JS frameworks/libraries. Do not use JQuery or ExtJS

File: nestedView.html,app.js

Idea: Used angularjs
---------------------------------------------------------------------------------------------------------------------------------
Problem:
Coding Exercises - Problem statements (Node.js or Ruby)(30 points)

Solve using Ruby or Node.js:

Move attached CSV data into DB and fetch lat, Long coordinates for Location column using google map API.

a). Import data from CSV file to DB (VehicleDetails.csv File attached). b). Get Lat, Long coordinates for Location column in attached. CSV (you can use google map API) c). Create two columns in DB Lat, Long d). Add Lat, Long coordinates to Database for each Location in CSV.

Note: Make sure you don’t make same call to maps api for same location

Status: Not complete
File: routes/index.js, routes/app.js
Idea: Used nodejs, DB using mysql
