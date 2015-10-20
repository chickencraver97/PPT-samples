package fibonacci;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class FibonacciTest {

	@Test
	public void testNullInput() {
		List<Integer> outList = Fibonacci.getFibonacciNumbers_sorted(null);
		assertEquals(outList.size(), 0);
	}
	
	@Test
	public void testEmpty() {
		Integer[] inArray = {7, 10, 20};
		List<Integer> outList = Fibonacci.getFibonacciNumbers_sorted(inArray);
		assertEquals(outList.size(), 0);
	}

	@Test
	public void testSingleton() {
		Integer[] inArray = {55};
		List<Integer> correctAnswers = Arrays.asList(inArray);
		List<Integer> outList = Fibonacci.getFibonacciNumbers_sorted(inArray);
		assertEquals(correctAnswers,outList);
	}
	
	@Test
	public void testMix_noDups() {
		Integer[] inArray = {7, 8, 55, 13, 20, 19, 21, 1};
		Integer[] correctArray = {1, 8, 13, 21, 55};
		List<Integer> correctAnswers = Arrays.asList(correctArray);
		List<Integer> outList = Fibonacci.getFibonacciNumbers_sorted(inArray);
		assertEquals(correctAnswers,outList);
	}
	
	@Test
	public void testMix_withDups() {
		Integer[] inArray = {7, 8, 55, 13, 13, 20, 19, 21, 1, 21};
		Integer[] correctArray = {1, 8, 13, 21, 55};
		List<Integer> correctAnswers = Arrays.asList(correctArray);
		List<Integer> outList = Fibonacci.getFibonacciNumbers_sorted(inArray);
		assertEquals(correctAnswers,outList);
	}
}
