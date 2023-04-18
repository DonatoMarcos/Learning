package javaTraining;

import java.util.Scanner;

public class TabelaIR {

	
	public static Double calculoIR (Double salario) {
		
		double faixa1 = (3000-2000) * 0.08;
		double faixa2 = (4500-3000) * 0.18;
				
		if (salario <= 2000)
		   return (double) 0;
		
		else if (salario <= 3000)
			return ((salario - 2000)*0.08);
		
		else if (salario <= 4500)
			return ((salario - 3000)*0.18 + faixa1);
		
		else 
			return ((salario - 4500)*0.28 + faixa1 + faixa2);
	}

	public static void main (String [] args ) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter salário: ");
		System.out.printf("Imposto a pagar será: %.2f",TabelaIR.calculoIR(sc.nextDouble()));
		sc.close();
		
		
	}
}
