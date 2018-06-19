public class Palindrome {
	
	public boolean palindrome(int a) {
		/*Scanner sc = new Scanner(System.in);		
        System.out.println("Enter number");        
        long a = sc.nextLong();
        sc.close();*/
        long b=a, s=0;
        while(a>0){
        	long r = a%10;
        	a =a/10;
        	s=s*10 + r;
        }
        
        if(s==b) {
        	System.out.println(b + " is palindrome" + " sum of even numbers is" + evenSum(b));
        	return true;
        }
        else {
        	System.out.println(b + " is not palindrome");
        	return false;
        }
	}

	public static int evenSum(long a) {
		int sum = 0;
		while(a>0) {
			long r = a%10;
			a= a/10;
			if(r%2==0) {
				sum+=r;
			}
		}
		return sum;
	}

}
