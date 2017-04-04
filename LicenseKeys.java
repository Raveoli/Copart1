//package copartCodingChallenge;
/*
 * The Problem:

We are given a string S consisting of N characters and an integer K. The string represents software license key which we would like to format. The string is composed of alphanumeric characters and dashes. The dashes split the string into groups (i.e if there are M dashes, the string is split into M+1 groups). The dashes in the string are possibly misplaced.

We want each group of characters to be of the length K (except for possibly the first group which could be shorter). All lowercase letters must be converted to uppercase.

The Input: Enter string S and integer K or pass them as args

The Output: Formatted license key according to the rules

Sample Input: S=2-4A0r7-4k K=4

Sample Output: 24A0-R74K
 */

public class LicenseKeys {
	public static void main(String args[]){
		String str = args[0];//represents the software license key
		int k=Integer.parseInt(args[1]);//grouping length constant
		
		String key = str.replaceAll("[-]","");//removes all '-'
		key = key.toUpperCase();//converts to uppercase
		if(k<key.length()){//when the number of characters in each group is greater that the total number of characters
			
			int remainder = 0; //when the key cannot be equally divided into groups with kth character
			remainder= key.length()%k;
			if(remainder!=0){
				//add '-' at every kth position and recursively call the remaining string, after the first group 
				key =  (key.substring(0, remainder)+"-"+ insertDashes(key.substring(remainder,key.length()),k));
			}
			else{
				key = insertDashes(key,k);//inserts - at k th position
			}
		}
		
		
		System.out.println(key);
		
	}
	static String insertDashes(String key,int k){
		
		
		if(key.length()<=k){	//base case when the number of characters after the - is less than k,i.e last few characters
			return key;	
		}
		else{
			
				return (key.substring(0, k)+"-" + insertDashes(key.substring(k,key.length()),k));		
		}
		
	}

}
