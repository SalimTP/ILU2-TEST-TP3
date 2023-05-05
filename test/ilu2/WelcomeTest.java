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
		assertEquals("Hello, Amy and Bob", Welcome.welcome("amy,bob"));
		assertEquals("Hello, Adrien and Boudrier", Welcome.welcome("Adrien,boudrier"));
	}
	
	@Test
	void test_ITER_5() {
		assertEquals("Hello, Amy, Bob and John", Welcome.welcome("Amy,bob, john"));
		assertEquals("Hello, Adrien, Boudrier and Alex", Welcome.welcome("Adrien, boudrier, Alex"));
	}
	
	@Test
	void test_ITER_6() {
		assertEquals("Hello, Amy and Jerry. AND HELLO, BOB !", Welcome.welcome("Amy, BOB, Jerry"));
		assertEquals("Hello, Adrien and Boudrier. AND HELLO, ALEX !", Welcome.welcome("Adrien, boudrier, ALEX"));
		assertEquals("Hello, Adrien, Boudrier, Clara and Arley. AND HELLO, ALEX, RONE AND MARCEL !", Welcome.welcome("Adrien, boudrier, ALEX, RONE, Clara, Arley, MARCEL"));
	}
	
	@Test
	void test_ITER_7() {
		assertEquals("Hello, Bob, Amy and Jerry", Welcome.welcome("bob, amy, jerry"));
		assertEquals("Hello, Bob and Jerry. AND HELLO, AMY AND JACK !", Welcome.welcome("bob, AMY, jerry, JACK"));
	}
	
	@Test
	void test_ITER_8() {
		assertEquals("Hello, Bob and Amy", Welcome.welcome("bob , amy "));
		assertEquals("Hello, Bob and Amy. AND HELLO, JACK AND JERRY !", Welcome.welcome("bob , amy,    JACK,  JERRY   "));
	}
}
