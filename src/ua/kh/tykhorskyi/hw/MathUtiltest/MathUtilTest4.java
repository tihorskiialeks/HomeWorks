package ua.kh.tykhorskyi.hw.MathUtiltest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ua.kh.tykhorskyi.hw.mathUtil.*;

class MathUtilTest4 {

	@Test
	void testIsInside() {
		assertFalse(MathUtil.isInside(12, 2, 6));
		assertFalse(MathUtil.isInside(10, 3, 5));
		assertFalse(MathUtil.isInside(15, 2, 14));
		assertFalse(MathUtil.isInside(1, 2, 6));
		assertFalse(MathUtil.isInside(3, 6, 20));

		assertTrue(MathUtil.isInside(5, 2, 6));
		assertTrue(MathUtil.isInside(4, 2, 6));
		assertTrue(MathUtil.isInside(12, 1, 20));
		assertTrue(MathUtil.isInside(15, 1, 20));
		assertTrue(MathUtil.isInside(19, 1, 20));
	}

	@Test
	void testIsEven() {
		assertFalse(MathUtil.isEven(15));
		assertFalse(MathUtil.isEven(21));
		assertFalse(MathUtil.isEven(33));
		assertFalse(MathUtil.isEven(81));
		assertFalse(MathUtil.isEven(53));

		assertTrue(MathUtil.isEven(24));
		assertTrue(MathUtil.isEven(16));
		assertTrue(MathUtil.isEven(20));
		assertTrue(MathUtil.isEven(40));
		assertTrue(MathUtil.isEven(100));
	}
	@Test
	void testIsSimple() {
		assertFalse(MathUtil.isSimple(16));
		assertFalse(MathUtil.isSimple(28));
		assertFalse(MathUtil.isSimple(40));
		assertFalse(MathUtil.isSimple(30));
		assertFalse(MathUtil.isSimple(70));

		assertTrue(MathUtil.isSimple(3));
		assertTrue(MathUtil.isSimple(17));
		assertTrue(MathUtil.isSimple(19));
		assertTrue(MathUtil.isSimple(7));
		assertTrue(MathUtil.isSimple(97));
	}

}
