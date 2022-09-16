package ua.kh.tykhorskyi.hw.mathUtil;

public class MathUtil {
	/**
	 * The method returns sum of digits of the number
	 * 
	 * @param number - input parameter
	 * @return sum of digits of the number
	 */
	public static int sumOfDigits(int number) {
		int sum = 0;
		for (int n = number; n != 0; n /= 10) {
			sum += n % 10;
		}
		return sum;
	}

	/**
	 * The method returns integer from fractional number
	 * 
	 * @param number is fractional number that have to be converted to integer
	 * @return integer
	 */
	public static double roundNumber(double number) {
		return (int) (number + 0.5);
	}

	/**
	 * The method which check if the input parameter is even
	 * 
	 * @param number - input parameter
	 * @return true/false
	 */
	public static boolean isEven(int number) {
		return (number % 2 == 0);
	}

	/**
	 * The method accepts two double parameters and shows which is close to number
	 * "10"
	 * 
	 * @param num1 - first input parameter
	 * @param num2 - second input parameter
	 * @return
	 */
	public static double closestTo10(double num1, double num2) {
		if (Math.abs(num1 - 10) > Math.abs(num2 - 10)) {
			return num2;
		} else {
			return num1;
		}
	}

	/**
	 * The method shows if number lies between two other numbers
	 * 
	 * @param number is number for checking
	 * @param min    - minimum value
	 * @param max    - maximum value
	 * @return
	 */
	public static boolean isInside(int number, int min, int max) {
		if (number >= min && number <= max) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Method generates random three-digit number
	 * 
	 * 
	 * @return three-digit int from 0 to 999
	 */
	public static int randomThreeDigitNumber() {
		return (int) (Math.random() * 999);
	}

	/**
	 * Method shows the biggest digit in three-digit number;
	 * 
	 * @param
	 * @return the biggest digit;
	 */

	public static int maxDigit(int number) {
		int sotni = number / 100;
		int desyatki = number % 100 / 10;
		int edinici = number % 10;
		if (sotni >= desyatki && sotni >= edinici) {
			return sotni;
		} else if (desyatki >= sotni && desyatki >= edinici) {
			return desyatki;
		} else {
			return edinici;
		}
	}

	/**
	 * Method calculates the factorial of integer f
	 * 
	 * 
	 * @param number - integer
	 * @return factorial of a number f
	 */
	public static int getFactorial(int number) {
		int factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	/**
	 * Method outputs to screen positive divisors of number
	 * 
	 * 
	 * @param number - number from which the method calculates positive divisors
	 */
	public static void printDividers(int number) {
		for (int b = 1; b <= number; b++) {
			if ((number % b) == 0) {
				System.out.println(b);
			}
		}
	}

	public static boolean isSimple(int number) {
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * in the sequence from 000001 to 999999 the method shows amount of numbers
	 * which have sum of the first three digits is equal to sum of second three
	 * digits.
	 * 
	 */
	public static int happyTicket() {
		int left, right, count = 0;
		for (int i = 000001; i <= 999_999; i++) {
			left = i / 1000;
			right = i % 1000;
			if (sumOfDigits(left) == sumOfDigits(right)) {
				count++;
			}
		}
		return count;
	}

	/**
	 * The method which sorts inputed array from minimum value to maximum value
	 * 
	 * @param array
	 * @return sorted array
	 */

	public static void sortArray(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int swap = array[j];
					array[j] = array[i];
					array[i] = swap;
				}
			}
		}
	}
}
