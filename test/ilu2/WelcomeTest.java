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
	

	@Test
	void test_ITER_2() {
		assertEquals("Hello, my friend", Welcome.welcome(""));
		assertEquals("Hello, my friend", Welcome.welcome(null));
		assertEquals("Hello, my friend", Welcome.welcome("   "));
	}
	
	@Test
	void test_ITER_3() {
		assertEquals("HELLO, JULIEN !", Welcome.welcome("JULIEN"));
		assertEquals("HELLO, BOB !", Welcome.welcome("BOB"));
	}
	
	@Test
	void test_ITER_4() {
		assertEquals("Hello, Amy, Bob", Welcome.welcome("amy,bob"));
		assertEquals("Hello, Adrien, Boudrier", Welcome.welcome("Adrien,boudrier"));
	}
}
