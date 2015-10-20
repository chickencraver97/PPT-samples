package zipzap;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZipZapTest {

	@Test
	public void test_1_and_4() {
		Triple t = ZipZap.countZZZs(1, 4);
		if (t == null) fail();
		assertTrue(t.a.equals(1) && t.b.equals(0) && t.c.equals(0));
	}
	
	@Test
	public void test_2_and_6() {
		Triple t = ZipZap.countZZZs(2, 6);
		if (t == null) fail();
		assertTrue(t.a.equals(2) && t.b.equals(1) && t.c.equals(0));
	}
	
	@Test
	public void test_150_and_165() {
		Triple t = ZipZap.countZZZs(150, 165);
		if (t == null) fail();
		assertTrue(t.a.equals(4) && t.b.equals(2) && t.c.equals(2));
	}
	
	@Test
	public void test_474747_and_747474() {
		Triple t = ZipZap.countZZZs(474747, 747474);
		if (t == null) fail();
		assertTrue(t.a.equals(72728) && t.b.equals(36363) && t.c.equals(18182));
	}
	

}
