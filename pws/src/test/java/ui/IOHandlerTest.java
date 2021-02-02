package ui;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IOHandlerTest {

	@Test
	void addTest() {
		IOHandler handler = new IOHandler();
		int result = 5;
		assertEquals(result, handler.add(2));
	}

}
