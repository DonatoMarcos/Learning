package javaTraining;

import java.util.Locale;

public class Printf {

	
	public static void main (String[] args) {
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:\n");
		System.out.printf("%s, which price is $%.2f\n", product1, price1);
		System.out.printf("%s, which price is $%.2f\n\n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s\n\n",age, code, gender);
		System.out.printf(Locale.US,"Measure with eight decimal places %.8f \n", measure);
		System.out.printf(Locale.US,"Measure rounded with 3 decimal places %.3f %n",measure);
		System.out.printf(new Locale("pt", "BR"), "Portuguese decimal point %.3f %n", measure);
		
		
	}
}
