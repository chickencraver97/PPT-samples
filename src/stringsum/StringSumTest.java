package stringsum;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringSumTest {

	@Test
	public void test1() {
		assertEquals(104, StringSum.getStringSum("zz"));
	}

	@Test
	public void test2() {
		assertEquals(25, StringSum.getStringSum("y"));
	}

	@Test
	public void test3() {
		assertEquals(25, StringSum.getStringSum("y-"));
	}

	@Test
	public void test4() {
		assertEquals(47, StringSum.getStringSum("aaabbc!"));
	}

	@Test
	public void test5() {
		assertEquals(11187, StringSum.getStringSum("TheQuickBrownFoxJumpsOverTheLazyDog"));
	}

	@Test
	public void test6() {
		assertEquals(6201, StringSum.getStringSum("zyxwvutsrqponmlkjihgfedcba"));
	}

}
