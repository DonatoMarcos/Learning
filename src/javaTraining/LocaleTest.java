package javaTraining;

import java.util.Locale;

public class LocaleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi!!!");
		System.out.println("Uso do % na aritmetica - Resto divisão 5/3 = " + (5 % 3));

		System.out.println(Locale.getDefault());
		Locale.setDefault(new Locale("pt", "BR"));

		int numero1 = 1;
		int numero2 = 2;
		double numero3 = 4.5;

		System.out.printf("Numeros são: %d, %d, %.5f", numero1, numero2, numero3);
	}

}
