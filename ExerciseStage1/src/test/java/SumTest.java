import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SumTest {

	private static Sum sum;
	@Before
	public void setUp() throws Exception {
		sum = new Sum();
	}

	@Test
	public void testSuccess() {
		assertEquals(4,sum.sumOfNumber("2 2"));
	}
	}
