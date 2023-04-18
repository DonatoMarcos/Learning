package appTraining;

import java.util.Locale;
import java.util.Scanner;

public class TestNumberVector6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double sum = 0.0;
		String lowAverageNumbers = "";

		System.out.print("Indicate number of elements in the group: ");
		Double[] vectorA = new Double[sc.nextInt()];
		sc.nextLine();

		System.out.println(" Enter vector elements: ");
		for (int i=0; i<vectorA.length; i++) {
			System.out.print("Number:");
			vectorA[i] = sc.nextDouble();
			sum +=vectorA[i];
		}
		sc.nextLine();

		for (double vector:vectorA) {
			if (vector<(sum/vectorA.length))
				lowAverageNumbers = lowAverageNumbers + String.format("%.1f", vector)+ ", ";
				
		}
		
		System.out.printf("\nAverage of Numbers is vector is: %.3f", sum/vectorA.length);
		System.out.printf("\nElements under average are: "+lowAverageNumbers.substring(0, lowAverageNumbers.length()-2));

		sc.close();
	}
}
