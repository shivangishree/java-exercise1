import static org.junit.Assert.*;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GuessNumberTest {

	GuessNumber gn = new GuessNumber();
	@Test
	public void testguessNumberequal() {
		int guess = (int )(Math.random() * 50 + 1);		
		String actual = gn.guessNumber(guess,7);
		assertEquals("Number guessed matches the original number",actual);
	}
	/*@Test
	public void testguessNumberMore() {
		String actual = gn.guessNumber(13,4);
		assertNotEquals("Number guessed matches the original number",actual);
	}
	@Test
	public void testguessNumberLess() {
		String actual = gn.guessNumber(4,13);
		assertNotEquals("Number guessed matches the original number",actual);
	}
*/
}
