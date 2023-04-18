package javaTraining;

import java.util.Scanner;

public class BitWise {
	
	
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Escreva 2 números para fazer as operações logicas com eles:");
		Integer numero1 = sc.nextInt();
		Integer numero2 = sc.nextInt();
		sc.nextLine();
		String binary1 = Integer.toBinaryString(numero1);
		String binary2 = Integer.toBinaryString(numero2);
		
		System.out.printf("\nA operação AND entre %sb e %sb é %sb", binary1,binary2, Integer.toBinaryString(numero1 & numero2));
		System.out.printf("\nA operação  OR entre %sb e %sb é %sb", binary1,binary2, Integer.toBinaryString(numero1 | numero2));
		System.out.printf("\nA operação XOR entre %sb e %sb é %sb", binary1,binary2, Integer.toBinaryString(numero1 ^ numero2));
		
		
		sc.close();
	}

}
