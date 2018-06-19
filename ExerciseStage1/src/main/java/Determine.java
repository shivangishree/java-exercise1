

import java.util.Scanner;

public class Determine {

	public static String det(String str) {
		if(isValidInput(str)=="Valid") {
			char ch = str.charAt(0);
			if(ch>=65 && ch<=90) {
				System.out.println("Capital letter");
				return "Capital letter";
			}
			else if(ch>=97 && ch<=122) {
				System.out.println("Small letter");
				return "Small letter";
			}
			else{
				System.out.println("Digit");
				return "Digit";
			}
		}
			else {
				System.out.println("Special Character");
				return "Digit";
			}
		}	
	

	public static String isValidInput(String str) {
		String b = (str.length()==1)?"Valid":"Invalid";
		return b;
	}

}
