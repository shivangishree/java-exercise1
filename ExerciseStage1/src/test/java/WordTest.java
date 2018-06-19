import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WordTest {
	
	Word w = new Word();
	@Test
	public void testChkInvalidInput() {
		ArrayList<Character> actual = w.chk("abhi$");
		ArrayList<Character> expected = new ArrayList<Character>(){{
		    add('v');
		    add('c');
		    add('c');
		    add('v');
		    add('e');
		}};
		 assertTrue(actual.equals(expected));

	}
	@Test
	public void testChk() {
		ArrayList<Character> actual = w.chk("abhi");
		ArrayList<Character> expected = new ArrayList<Character>(){{
		    add('v');
		    add('c');
		    add('c');
		    add('v');
		}};
		 assertTrue(actual.equals(expected));

	}

}
