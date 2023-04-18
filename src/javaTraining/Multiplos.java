package javaTraining;

import java.util.Scanner;

public class Multiplos {
	
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite 2 números: ");
		double numero1 = sc.nextDouble();
		double numero2 = sc.nextDouble();
		String answer = "";
		
		if (!((numero1 % numero2 == 0)||(numero2 % numero1 == 0)))
		{
			answer = "Não ";
		}

		System.out.printf("%sSão Múltiplos",answer);
		sc.close();
	}

}
