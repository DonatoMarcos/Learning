package javaTraining;

import java.util.Scanner;

public class TesteFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print(" Entre numero de repeticoes: ");
		int repeticoes = sc.nextInt();
		int i=0;
		for (System.out.println("\nInicialização poder ter nada a ver com o loop :)"); i<repeticoes; i++) {
			System.out.print("\nteste"+i);
		}

		i=0;
		for (System.out.println("\nInicialização poder ter nada a ver com o loop :)"); i<repeticoes; ++i) {
			System.out.print("\nteste"+i);
		}
		
		i=5;
		for (;i>0;) {
			System.out.print("\nValor de i: "+i);
			--i;
		}
}

}
