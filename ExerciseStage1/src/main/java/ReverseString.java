public class ReverseString {
	public String reverseString(String str) {
		String s = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			s = ch+s;
		}
		System.out.println(s);
		return s;			
	}

}
