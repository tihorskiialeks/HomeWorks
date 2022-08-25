package ua.kh.tykhorskyi.hw.matrixAndVector;

import java.util.Arrays;

public class Vector<T extends Object> {

	public static final int DEFAULT_LENGHT = 10;
	private T[] array;
	private int count;

	public int getCount() {
		return count;
	}

	public Vector() {
		this(DEFAULT_LENGHT);
	}

	public Vector(int length) {
		array = (T[]) new Object[length];
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			str.append(array[i]);
			str.append(", ");
		}
		return str.toString();
	}

	public void clear() {
		count = 0;
	}

	public T getElement(int j) {
		return array[j];
	}

	public void add(T j) {
		array[count] = j;
		count++;
		if (count == array.length) {
			T[] array1 = (T[]) new Object[array.length + DEFAULT_LENGHT];
			for (int i = 0; i < array.length; i++) {
				array1[i] = array[i];

			}
			this.array = array1;
		}
	}

	public void deleteElement(int j) {
		for (int i = j; i < count; i++) {
			array[i] = array[i + 1];
		}
		count--;
		if (count % 10 == 0) {
			T[] array1 = (T[]) new Object[array.length - DEFAULT_LENGHT];
			for (int i = 0; i < array1.length; i++) {
				array1[i] = array[i];
			}
			this.array = array1;
		}
	}

	public void vectorToScreen() {
		System.out.println(this);
	}
}
