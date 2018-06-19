import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DetermineTest {

	Determine d = new Determine();
	@Test
	public void testdet() {
		String actual = Determine.det("A");
		assertEquals("Capital letter", actual);
	}
	@Test
	public void testdetsm() {
		String actual = Determine.det("a");
		assertEquals("Small letter", actual);
	}
	@Test
	public void testdetdg() {
		String actual = Determine.det("1");
		assertEquals("Digit", actual);
	}
	@Test
	public void testIsValidInput() {
		String actual = Determine.isValidInput("Aa");
		assertEquals("Invalid", actual);		
	}

}
