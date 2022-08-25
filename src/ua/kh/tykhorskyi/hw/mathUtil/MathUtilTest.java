package ua.kh.tykhorskyi.hw.mathUtil;

import java.util.Scanner;

public class MathUtilTest {

	public static void main(String[] args) {
		int i = MathUtil.sumOfDigits(1234);
		System.out.println("Sum of digits = " + i);

		double n = MathUtil.roundNumber(35.95168);
		System.out.println("integer from fractorial number is " + n);

		boolean boll = MathUtil.isEven(6);
		System.out.println("Is inputed number even? " + boll);

		double b = MathUtil.closestTo10(11.85, 8.93);
		System.out.println("The closest number to 10 is " + b);

		boolean interval = MathUtil.isInside(10,2,11);
		System.out.println("Is inputed number in given range? " + interval);

		System.out.println("random three-digit number is " + MathUtil.randomThreeDigitNumber());

		int x = MathUtil.maxDigit(i);
		System.out.println("The biggest digit in this number is " + x);

		// Следующие методы в коментах, так как занимают много места в консоли
		// MathUtil.posledovatelnost(i);
		// MathUtil.posledovatelnost2(i);
		// MathUtil.posledovatelnost3(i);
		// MathUtil.posledovatelnost4(i);

		int fac = MathUtil.getFactorial(3);
		System.out.println("The factorial of inputed number is " + fac);

		boolean prostoe = MathUtil.isSimple(3);
		System.out.println("Is inputed number a prime? " + prostoe);

		System.out.println(MathUtil.happyTicket());
		
		Scanner scan = new Scanner(System.in);
		i = scan.nextInt();
		MathUtil.printDividers(i);

		
	}

}
