import java.util.ArrayList;
import java.util.Scanner;

public class Sum {
	
	public int sumOfNumber(String str) {
		  ArrayList<String> arr = new ArrayList<String>();
		  String[] splitStr = str.split(" ");
		  int sum = 0;
		  for(int i = 0;i<splitStr.length;i++) {
			  int num = Integer.parseInt(splitStr[i]);
			  sum = sum+num;
		  }
		  return sum; 
	   }	
	}
