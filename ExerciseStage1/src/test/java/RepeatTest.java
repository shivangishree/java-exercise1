import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RepeatTest {

	Repeat r = new Repeat();
	@Test
	public void testSuccess() {
		String actual = r.repeat("Shivangi", 4);
		assertEquals("Shivangiangiangiangiangi",actual);
	}
	@Test
	public void testNgreaterThanLength() {
		String actual = r.repeat("Shivangi", 8);
		assertEquals("N is greater than length",actual);
	}

}
