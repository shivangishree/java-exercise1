import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.Test;
public class IterationTest {

	Iteration i = new Iteration();;
	@Test
	public void testIterate() {
		String actual = i.iterate(2);
		assertEquals("122",actual);
	}

}
