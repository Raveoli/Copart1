# Copart1

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
