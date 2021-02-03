package utilities;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class ScramblerTest {

	@Test
	public void inputExceptionHandlingTooShort() {
		String testString = "oo";
		assertThrows(IOException.class, () -> {Scrambler.scramble(testString);});
	}
	@Test
	public void inputExceptionHandlingTooLong() {
		String testString = "oooooooooooooooooooooo";
		assertThrows(IOException.class, () -> {Scrambler.scramble(testString);});
	}
	@Test
	public void arrayLengthStandardizeTest() {
		char[] testArray = {'i','o','p'};
		char[] testArray2 = Scrambler.lengthStandardize(testArray);
		char[] result = {'i','o','p','i','o','p','i','o','p','i'};
		
		assertArrayEquals(result, testArray2);
	}
}
