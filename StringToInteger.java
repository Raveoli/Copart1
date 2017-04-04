package copartCodingChallenge;
/*
 * Convert String to Integer
	Without using any Integer functions like parseInt/valueOf 
	convert the String to Integer. e.g. String input = “1234” - > Integer output=1234.
	
	Vidya Sri Mani
	vxm163230@utdallas.edu
 */

public class StringToInteger {
	public static void main(String args[]){
		
		String str = args[0];//number entered as a string
		int afterConversion=0;
		afterConversion = convertToInt(str);
		System.out.println(afterConversion);	
		
	}

	
	static public int convertToInt(String str){
		boolean isNegative = false;
		int count = 0;
		int numberAsInt=0;
		//str is the number as string
		//the number can be either a positive number or a negative number
		/*
		 * Considering the string, the first character or the character at position 0, 
		 * will tell if the number is negative
		 */
		if(str.charAt(0)=='-'){ //if negative
            isNegative = true;
            count = 1; //start reading from position 1, as 0th position has sign
        }
		for(int i=count;i<str.length();i++){
			numberAsInt *= 10;//multiplies each number to its tens position
			numberAsInt += (str.charAt(i)-'0');//removes the character value to 0 to get int value
			//System.out.println(str.charAt(i));
		}
			
		if( isNegative ){
			numberAsInt = -numberAsInt;
		}
				
        return numberAsInt;
    } 
		
	
}

