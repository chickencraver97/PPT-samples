package factorization;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class FactorizationTest {

	@Test
	public void test1() {
		String factorizationString = Factorization.getPrimeFactorization(1);
		assertEquals(factorizationString, "1");
	}

	@Test
	public void test8() {
		String factorizationString = Factorization.getPrimeFactorization(8);
		assertEquals(factorizationString, "2^3");
	}

	@Test
	public void test12() {
		String factorizationString = Factorization.getPrimeFactorization(12);
		assertEquals(factorizationString, "2^2 * 3");
	}

	@Test
	public void test7() {
		String factorizationString = Factorization.getPrimeFactorization(7);
		assertEquals(factorizationString, "7");
	}

	@Test
	public void test210() {
		String factorizationString = Factorization.getPrimeFactorization(210);
		assertEquals(factorizationString, "2 * 3 * 5 * 7");
	}
	
	@Test
	public void test1764() {
		String factorizationString = Factorization.getPrimeFactorization(1764);
		assertEquals(factorizationString, "2^2 * 3^2 * 7^2");
	}
}
