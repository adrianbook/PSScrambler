package utilities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CruncherTest {
	

	@Test
	public void CrunchTest() {
		Cruncher cruncher = new Cruncher();
		String testString = cruncher.crunch("Hej");
		String result = "HejFuck off!";
		
		assertEquals(result, testString);
	}

}
