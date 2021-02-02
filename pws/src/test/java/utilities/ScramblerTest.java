package utilities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScramblerTest {

	@Test
	public void ScrambleTest() {
		Scrambler scrambler = new Scrambler();
		
		String testString = scrambler.scramble("ojdå");
		String result = "dåoj";
		
		assertEquals(result, testString);
	}

}
