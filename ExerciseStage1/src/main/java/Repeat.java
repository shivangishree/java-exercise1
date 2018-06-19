public class Repeat {

	public String repeat(String s,int n) {
		String returnStatement="";
		int l = s.length();
		if(l<n) {
			s="N is greater than length";
			System.out.println("N is greater than length");
			return s;
		}
		else {
			returnStatement = s;
			int startIndex = l-n;
			String substring= s.substring(startIndex);
			System.out.println(substring);
			for(int i =1;i<=n;i++) {
				returnStatement= returnStatement+ substring;
			}
			System.out.println(returnStatement);
			return returnStatement;
		}
	}
}
