package javaTraining;

import java.util.Locale;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// Entry (scanner) is affected by locale. Only one locale per method.
		Locale.setDefault(new Locale("pt", "BR")); // Now float with decimal separator as ,
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 4 values separated by spaces (or by enter)");
		String teste = sc.next();
		Integer numero = sc.nextInt();
		Double duplo = sc.nextDouble();
		char sexo = sc.next().charAt(0);
		// println is not affected by Locale. 
		System.out.println("You've typed: "+teste+" and "+numero+ " and "+duplo+ " and "+sexo+"\n");
		
		System.out.println("Enter 4 values separated by spaces (or by enter)");
		teste = sc.next();
		numero = sc.nextInt();
		duplo = sc.nextDouble();
		sexo = sc.next().charAt(0);
		// printf is affected by Locale. 
		System.out.printf("You've typed: %s and %d and %.1f and %s\n\n", teste,numero,duplo,sexo);

		System.out.println("Write anything that will be accepted upon enter");
		// this nextline will consume the phantom nextline from previous sc command
		sc.nextLine(); 
		String texto1 = sc.nextLine();
		String texto2 = sc.nextLine();
		System.out.println("You've typed this text: "+texto1+"  "+texto2);

		sc.close();
}

}
