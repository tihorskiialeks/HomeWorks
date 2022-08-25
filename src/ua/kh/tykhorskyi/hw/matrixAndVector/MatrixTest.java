package ua.kh.tykhorskyi.hw.matrixAndVector;

import java.util.Arrays;

public class MatrixTest {

	public static void main(String[] args) {
		Matrix def = new Matrix();
		Matrix matrix1 = new Matrix(new int[][] { { 2, 2, 3 }, { 3, 3, 3 }, { 2, 2, 3 } });

		Matrix matrix2 = new Matrix(new int[][] { { 2, 2 }, { 3, 3 } });
		Matrix matrix3 = new Matrix(new int[][] { { 2, 2 }, { 3, 3 } });

		Matrix matrix4 = new Matrix(new int[][] { { 2, 2, }, { 3, 3, } });
		Matrix matrix5 = new Matrix(new int[][] { { 3, 3, }, { 3, 3, } });

		Matrix matrix6 = new Matrix(new int[][] { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } });
		Matrix matrix7 = new Matrix(new int[][] { { -4, -65, 56 }, { 78, -13, 32 } });

		def.matrixToPrint();
		matrix1.matrixToPrint();
		matrix1.multimleByNumber(3);
		matrix1.matrixToPrint();

		System.out.println("matrix2 = " + Arrays.deepToString(matrix2.getArray()));
		System.out.println("matrix3 = " + Arrays.deepToString(matrix3.getArray()));
		matrix2.matrixAdd(matrix3);
		System.out.println("sum  = " + Arrays.deepToString(matrix2.getArray()));
		matrix4.matrixMultiplication(matrix5);
		System.out.println("product  = " + Arrays.deepToString(matrix4.getArray()));

		System.out.println("matrix 6 = ");
		matrix6.matrixToPrint();
		matrix6.matrixTransponse();
		System.out.println("transposed matrix 6 = ");
		matrix6.matrixToPrint();
		matrix2.matrixToPrint();
		matrix6.matrixToPrint();

		matrix7.matrixToPrint();
		matrix7.matrixTransponse();
		matrix7.matrixToPrint();
	}
}