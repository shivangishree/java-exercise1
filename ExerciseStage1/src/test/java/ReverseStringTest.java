import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReverseStringTest {

	ReverseString rs;
	@Before
	public void setUp() throws Exception {
		rs= new ReverseString();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testreverseString() {
		String actual = rs.reverseString("London");
		assertEquals("nodnoL", actual);		
	}

}
