
public class GuessNumber {

	public String guessNumber(int guess,int target) {
		String s = "";
		System.out.println("Guessed Number is " +guess);
		while(guess!=target) {		    
			if(guess<target) {
				s= "Number guessed is less than original number";
			}
			else if(guess>target) {
				s= "Number guessed is more than original number";
			}
			guess = (int )(Math.random() * 50 + 1);
			System.out.println("Guessed Number is " +guess);
		}
		s= "Number guessed matches the original number";
		System.out.println(s);
		return s;
	}
}
