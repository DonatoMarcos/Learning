package javaTraining;

import java.util.Scanner;

public class TestFunction {

	public static Double max (Double number1, Double number2, Double number3) {
	if ((number1 > number2) & (number1 > number3)) {
		return number1;
	} else if (number2 > number3) {
		return number2;
	} else {
		return number3;
	}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 3 numbers");
		Double number1 = sc.nextDouble();
		Double number2 = sc.nextDouble();
		Double number3 = sc.nextDouble();

		System.out.printf("Number %.0f is higher\n", max(number1, number2, number3));

		sc.close();

	}

}
