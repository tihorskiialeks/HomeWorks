package ua.kh.tykhorskyi.hw.MathUtiltest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import ua.kh.tykhorskyi.hw.mathUtil.*;

class MathUtilTest5 {

	@Test
	void testSortArray() {
		int[] array1 = { 4, 1, 6, 2 };
		MathUtil.sortArray(array1);
		int[] expectedArray1 = { 1, 2, 4, 6 };
		Assertions.assertArrayEquals(array1, expectedArray1);

		int[] array2 = { 4, 1, 6, 2, -1, 0 };
		MathUtil.sortArray(array2);
		int[] expectedArray2 = { -1, 0, 1, 2, 4, 6 };
		Assertions.assertArrayEquals(array2, expectedArray2);

		int[] array3 = { -800, -500, 0, 800, 400 };
		MathUtil.sortArray(array3);
		int[] expectedArray3 = { -800, -500, 0, 400, 800 };
		Assertions.assertArrayEquals(array3, expectedArray3);

		int[] array4 = { 0, 0, -5, -5, 4, 4 };
		MathUtil.sortArray(array4);
		int[] expectedArray4 = { -5, -5, 0, 0, 4, 4 };
		Assertions.assertArrayEquals(array4, expectedArray4);

		int[] array5 = { 9, 9, 10, -6, 14, 14 };
		MathUtil.sortArray(array5);
		int[] expectedArray5 = { -6, 9, 9, 10, 14, 14 };
		Assertions.assertArrayEquals(array5, expectedArray5);

		int[] array6 = {};
		MathUtil.sortArray(array6);
		int[] expectedArray6 = {};
		Assertions.assertArrayEquals(array6, expectedArray6);

		int[] array7 = { 0, 0, 0, 0, 0, 0 };
		MathUtil.sortArray(array7);
		int[] expectedArray7 = { 0, 0, 0, 0, 0, 0 };
		Assertions.assertArrayEquals(array7, expectedArray7);

		int[] array8 = { -1, -1, -1, -1 };
		MathUtil.sortArray(array8);
		int[] expectedArray8 = { -1, -1, -1, -1 };
		Assertions.assertArrayEquals(array8, expectedArray8);
	}

}
