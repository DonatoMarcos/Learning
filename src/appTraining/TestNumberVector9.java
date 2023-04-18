package appTraining;

import java.util.Locale;
import java.util.Scanner;

public class TestNumberVector9 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		String textoSaida = "";
		Double soma = 0.0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Indicate number of elements in the group: ");
		Double[] numeros = new Double[sc.nextInt()];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Number: ");
			numeros[i] = sc.nextDouble();
		}

		for (Double numero: numeros) {
			textoSaida = textoSaida + String.format("%.2f", numero) + ", ";
		}

		for (Double numero: numeros) {
			soma += numero;
			numero = 0.0;
			numero = 1.0;
		}

		System.out.print("\nEntered numbers are: " + textoSaida.substring(0, textoSaida.length() - 2));
		System.out.print("\nSum is: "+soma);
		System.out.print("\nAverage is: "+soma/numeros.length);

		sc.close();
	}
}
