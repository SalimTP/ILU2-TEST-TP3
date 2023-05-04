package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void test_ITER_1() {
		assertEquals("Hello, Bob", Welcome.welcome("bob"));
		assertEquals("Hello, Java", Welcome.welcome("java"));
		assertEquals("Hello, Anthoine", Welcome.welcome("Anthoine"));
	}
	

}
