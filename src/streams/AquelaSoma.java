package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AquelaSoma {

	
	int somaTradicional (int [] Numeros) {
		int soma = 0;
		for (Integer num : Numeros) {
			soma += num;
		}
		return soma;
	}
/*
	int somaModerna (List<Integer> Numeros) {
		int soma = 0;
		return Numeros.stream().map((numero) -> numero).reduce(soma, Integer::sum);
	}
*/
	
	int somaModerna (List<Integer> Numeros) {
		int soma = 0;
		System.out.println(Numeros.stream());
		System.out.println(Numeros.stream().map((Numero)-> Numero).toArray()[2]);
		return Numeros.stream().reduce(soma, Integer::sum);
	}
	
	public static void main (String [] args)
	{
		AquelaSoma teste = new AquelaSoma();
		
		int [] numeros = {0,1,3,6};
		System.out.println("A soma tradicional é: "+teste.somaTradicional(numeros));
		
		
		List<Integer> novosNumeros = new ArrayList();
		novosNumeros.add(0);
		novosNumeros.add(1);
		novosNumeros.add(-3);
		novosNumeros.add(6);
		
		System.out.println(novosNumeros);
		System.out.println("A soma moderna é: "+teste.somaModerna(novosNumeros));
	}
}
