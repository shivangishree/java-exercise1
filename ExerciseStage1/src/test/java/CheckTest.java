import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheckTest {
    
	Check check;
	@Before
	public void setUp() throws Exception {
		check = new Check();
	}
	
	@Test
	public void testChkTom() {
		String actual = check.chk(22);
		assertEquals("tom", actual);
	}
	@Test
    public void testChkJerry() {
		String actual = check.chk(21);
		assertEquals("jerry", actual);
		
	}
	@Test
    public void testChkNotInRange() {
		String actual = check.chk(4);
		assertEquals("Not in range", actual);
	}
	
}
