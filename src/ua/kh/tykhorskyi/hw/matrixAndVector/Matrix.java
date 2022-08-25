package ua.kh.tykhorskyi.hw.matrixAndVector;

public class Matrix {
	private int[][] array;
	private int rowAmount;
	private int columnAmount;

	public int[][] getArray() {
		return array;
	}

	public Matrix() {
		array = new int[][] { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
	}

	public Matrix(int[][] array) {
		super();
		this.array = array;
	}

	public Matrix(int[][] array, int rowAmount, int columnAmount) {
		super();
		this.array = array;
		this.rowAmount = rowAmount;
		this.columnAmount = columnAmount;

	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				str.append(array[i][j]);
				str.append(", ");
			}
			str.append("\n");
		}

		return str.toString();
	}

	public void multimleByNumber(int number) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] *= number;
			}
		}

	}

	public void matrixAdd(Matrix matrix) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] += matrix.array[i][j];
			}
		}
	}

	public void matrixMultiplication(Matrix matrix) {
		rowAmount = array.length;
		matrix.columnAmount = matrix.array[0].length;
		matrix.rowAmount = matrix.array.length;
		int[][] result = new int[array.length][matrix.array[0].length];
		for (int i = 0; i < rowAmount; i++) {
			for (int j = 0; j < matrix.columnAmount; j++) {
				for (int k = 0; k < matrix.rowAmount; k++) {
					result[i][j] += array[i][k] * matrix.array[k][j];
				}
			}
		}
		this.array = result;
	}

	public void matrixTransponse() {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int temp = array[i][j];
				array[i][j] = array[j][i];
				array[j][i] = temp;
			}
		}
	}

	public void matrixToPrint() {
		System.out.println(this);
	}

}
