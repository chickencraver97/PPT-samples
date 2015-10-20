package expression;

import static org.junit.Assert.*;

import org.junit.Test;

public class FPExpressionTest {

	@Test
	public void testValidExpression1() {
		FPExpression fpe = FPExpression.getFPExpression("(abc)(def)");
		assertEquals("(abc)(def)", fpe.toString());
	}

	@Test
	public void testValidExpression2() {
		FPExpression fpe = FPExpression.getFPExpression("(abc(de)f(ghi))");
		assertEquals("(abc(de)f(ghi))", fpe.toString());
	}

	@Test
	public void testValidExpression3() {
		// this tests for different types of parentheses
		FPExpression fpe = FPExpression.getFPExpression("(abc{de}f(ghi))");
		assertEquals("(abc{de}f(ghi))", fpe.toString());
	}

	@Test
	public void testValidExpression4() {
		assertTrue(FPExpression.isFPExpression("[abcdef]"));
	}

	@Test
	public void testValidExpression5() {
		assertTrue(FPExpression.isFPExpression("hi j k"));
	}

	@Test
	public void testInvalidExpression1() {
		assertTrue(!FPExpression.isFPExpression("(((abc(de)f(ghi))"));
	}

	@Test
	public void testInvalidExpression2() {
		try {
			FPExpression fpe = FPExpression
					.getFPExpression("(((abc(de)f(ghi))");
			fail("There should have been an exception!");
		} catch (IllegalArgumentException e) {
			// we should get an exception so the assert should be fine
			assertTrue(true);
		}
	}

	@Test
	public void testInvalidExpression3() {
		// an empty string is not a valid expression
		assertTrue(!FPExpression.isFPExpression(""));
	}
}
