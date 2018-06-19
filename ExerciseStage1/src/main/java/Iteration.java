import java.util.Scanner;

public class Iteration {
	
	public String iterate(int a) {
		String s="";
		for(int i =0;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				s=s+ i;
			}
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /* Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a number");
		  int x = sc.nextInt();
          (new iteration()).iterate(x);*/
	}

}
