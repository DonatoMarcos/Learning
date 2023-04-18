package appTraining;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

public class TestHeight {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Indicate number of people: ");
		Double lenghts[] = new Double[sc.nextInt()];
		Double soma = 0.0;
		
		for (int i=0; i<lenghts.length; i++) {
			System.out.print("\nEnter person("+(i+1)+") height in meters: ");
			lenghts[i] = sc.nextDouble();
			soma = soma + lenghts[i];
		}
		
		System.out.printf("\nAverage height of this group is: %.2f meters",(soma/lenghts.length));
		sc.close();

	}

}
