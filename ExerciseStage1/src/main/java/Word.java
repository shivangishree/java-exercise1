import java.util.ArrayList;
import java.util.Scanner;

public class Word {
	
	public ArrayList<Character> chk(String a) {
		ArrayList<Character> ar = new ArrayList<Character>();		
		for(int i =0;i< a.length();i++){
			char ch = a.charAt(i);
			if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
					System.out.println(ch+" is vowel");
					ar.add('v');
				}
				else {
					System.out.println(ch+" is consonant");
					ar.add('c');
				}				
			}
			else {
				System.out.println("Not a proper input");
				ar.add('e');		
			}
		}
		return ar;	
	}	
	
}
