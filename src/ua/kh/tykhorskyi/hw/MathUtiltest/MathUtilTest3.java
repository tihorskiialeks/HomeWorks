package ua.kh.tykhorskyi.hw.MathUtiltest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import ua.kh.tykhorskyi.hw.mathUtil.*;

class MathUtilTest3 {

	@Test
	void testRoundsNumbers() {
		assertEquals(12, MathUtil.roundNumber(11.7));
		assertEquals(15, MathUtil.roundNumber(14.6));
		assertEquals(10, MathUtil.roundNumber(9.8));
		assertEquals(9, MathUtil.roundNumber(8.5));
		assertEquals(3, MathUtil.roundNumber(2.5));
		assertEquals(12, MathUtil.roundNumber(12.1));
		assertEquals(13, MathUtil.roundNumber(13.2));
		assertEquals(11, MathUtil.roundNumber(11.3));
		assertEquals(10, MathUtil.roundNumber(10.4));
		assertEquals(25, MathUtil.roundNumber(25.4));
	}

	@Test
	void testClosestTo10() {
		assertEquals(12, MathUtil.closestTo10(12, 8));
		assertEquals(15, MathUtil.closestTo10(15, 3));
		assertEquals(8, MathUtil.closestTo10(22, 8));
		assertEquals(11, MathUtil.closestTo10(11, 8));
		assertEquals(8, MathUtil.closestTo10(-12, 8));
		assertEquals(-15, MathUtil.closestTo10(-15, 333));
		assertEquals(0, MathUtil.closestTo10(0, -45));
		assertEquals(-12, MathUtil.closestTo10(-12, -48));
		assertEquals(100, MathUtil.closestTo10(100, -100));
		assertEquals(123, MathUtil.closestTo10(123, 1008));
	}

	@Test
	void testMaxDigit() {
		assertEquals(5, MathUtil.maxDigit(153));
		assertEquals(9, MathUtil.maxDigit(991));
		assertEquals(4, MathUtil.maxDigit(421));
		assertEquals(7, MathUtil.maxDigit(762));
		assertEquals(8, MathUtil.maxDigit(834));
		assertEquals(5, MathUtil.maxDigit(555));
		assertEquals(7, MathUtil.maxDigit(712));
		assertEquals(6, MathUtil.maxDigit(163));
		assertEquals(5, MathUtil.maxDigit(125));
		assertEquals(1, MathUtil.maxDigit(100));
	}

	@Test
	void testgetgetFactorial() {
		assertEquals(1, MathUtil.getFactorial(1));
		assertEquals(2, MathUtil.getFactorial(2));
		assertEquals(6, MathUtil.getFactorial(3));
		assertEquals(24, MathUtil.getFactorial(4));
		assertEquals(120, MathUtil.getFactorial(5));
		assertEquals(720, MathUtil.getFactorial(6));
		assertEquals(5040, MathUtil.getFactorial(7));
		assertEquals(40320, MathUtil.getFactorial(8));
		assertEquals(362880, MathUtil.getFactorial(9));
		assertEquals(3_628_800, MathUtil.getFactorial(10));

	}

}
