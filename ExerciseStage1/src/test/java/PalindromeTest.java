import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromeTest {
	@Test
	public void testPalindrome() {
		Palindrome foo = new Palindrome();
		boolean actual = foo.palindrome(44);
		boolean expected = true;
		assertEquals( expected,actual);		
	}
	
	@Test
	public void testEvenSum() {
		Palindrome foo = new Palindrome();
		int sumtest = foo.evenSum(25);
		long expected = 2;
		assertEquals(sumtest , expected);
	}
}
