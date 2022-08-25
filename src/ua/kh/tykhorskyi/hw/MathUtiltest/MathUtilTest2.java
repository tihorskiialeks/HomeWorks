package ua.kh.tykhorskyi.hw.MathUtiltest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ua.kh.tykhorskyi.hw.mathUtil.*;

class MathUtilTest2 {

	@Test
	void testSumOfDigits() {
		assertEquals(6, MathUtil.sumOfDigits(123));
		assertEquals(12, MathUtil.sumOfDigits(444));
		assertEquals(9, MathUtil.sumOfDigits(234));
		assertEquals(15, MathUtil.sumOfDigits(456));
		assertEquals(18,MathUtil.sumOfDigits(567));
		assertEquals(27,MathUtil.sumOfDigits(999));
		assertEquals(22,MathUtil.sumOfDigits(589));
		assertEquals(16,MathUtil.sumOfDigits(952));
		assertEquals(2,MathUtil.sumOfDigits(101));
		assertEquals(9,MathUtil.sumOfDigits(900));
		
	}

}
