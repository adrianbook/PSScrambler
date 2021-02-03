package utilities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CruncherTest {

	@Test
	public void testinputException() {
		Cruncher cruncher = new Cruncher();
		assertThrows(RuntimeException.class, () -> {
			cruncher.crunch("abcdef");
		});
	}

	@Test
	public void testAddSpecialSigns() {
		Cruncher cruncher = new Cruncher();
		var testString = cruncher.addSpecialSigns("hejhejhejh");
		assertEquals(testString, "h%jh!jh?jh");
	}

	@Test
	public void testAddNumbers() {
		Cruncher cruncher = new Cruncher();
		var testString = cruncher.addNumbers("hejhejhejh");

		assertEquals(testString, "5e98e611e314");
	}

	@Test
	public void testCrunch() {
		Cruncher cruncher = new Cruncher();
		var testString = cruncher.crunch("hejhejhejh");
		assertEquals(testString, "h%jh!jh?jh5%98!611?314");
	}
}
