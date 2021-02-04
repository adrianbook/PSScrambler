package ui;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IoControlTest {
	private boolean result;

	IoControl ioControl = new IoControl();

	@Test
	public void testQuitApplication() {
		ioControl.setUserPassword("q");
		if (ioControl.inputQuit() == 0) {
			result = true;
		} else {
			result = false;
		}
		assertTrue(result);
	}

	@Test
	public void testUserPasswordLength() {
		ioControl.setUserPassword("qwe");
		if (ioControl.checkLength() != -1) {
			result = false;
		} else {
			result = true;
		}
		assertTrue(result);
	}

	@Test
	public void testForbiddenCharacters() {
		String forbiddenChars = " !\"#$%&'()*+,-./:;<=>?@[\\]^`{|}~";
		for (char c : forbiddenChars.toCharArray()) {
			String s = Character.toString(c);
			ioControl.setUserPassword(s);
			if (ioControl.checkChars() != 0) {
				result = true;
				assertTrue(result);
			} else {
				result = false;
				assertTrue(result);
			}
		}
	}
}
