package zeroSumSubsequence;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ZeroSumSubsequenceTest {

	@Test
	public void test1() {
		assertEquals(2, ZeroSumSubsequence.getMaximumLength(Arrays.asList(2, -2)));
	}
	
	@Test
	public void test2() {
		assertEquals(3, ZeroSumSubsequence.getMaximumLength(Arrays.asList(3, 4, -2, -1)));
	}
	
	@Test
	public void test3() {
		assertEquals(4, ZeroSumSubsequence.getMaximumLength(Arrays.asList(-1, -1, 2, -1, -2, 4)));
	}

	@Test
	public void test4() {
		assertEquals(1, ZeroSumSubsequence.getMaximumLength(Arrays.asList(1, 2, 0)));
	}

	@Test
	public void test5() {
		assertEquals(0, ZeroSumSubsequence.getMaximumLength(Arrays.asList(1, 1, 2)));
	}
	
}
