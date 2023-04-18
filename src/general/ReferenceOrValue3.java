package general;

public class ReferenceOrValue3 {
	
	public void updateDados(String nome, Integer valor, Integer valor2) 
	{
		System.out.printf(" Method-1:  "+
			    "Str (nomX= "+ nome +", "+ 
	            "hash= "+ System.identityHashCode(nome)/10000 +"),  "+
			    "Int (valorX= "+ valor +", "+
		        "hashX= "+ System.identityHashCode(valor)/10000+"), "+
	    		"int (valorY= "+ valor2 +", "+
	    		"hashY= "+ System.identityHashCode(valor2)/10000+")\n");
		
		nome = "CC";
		valor = valor + 5;
		valor2 = valor2 + 5;

		System.out.printf(" Method-2:  "+
			    "Str (nomX= "+ nome +", "+ 
	            "hash= "+ System.identityHashCode(nome)/10000 +"),  "+
			    "Int (valorX= "+ valor +", "+
		        "hashX= "+ System.identityHashCode(valor)/10000+"), "+
	    		"int (valorY= "+ valor2 +", "+
	    		"hashY= "+ System.identityHashCode(valor2)/10000+")\n");
	}
	
	public static void main (String [] args) throws Throwable {
		ReferenceOrValue3 objMain = new ReferenceOrValue3();
		
		String  nome = "AA", nome1  = "AA";
		Integer valor = 0, valor1 = 1;
		int valor2 = 2, valor3 = 3;
		
		System.out.printf("   Main-0:  "+
			    "Str (nome= "+ nome +", "+ 
	            "hash= "+ System.identityHashCode(nome)/10000 +"),  "+
			    "Int (valor0= "+ valor +", "+
		        "hash0= "+ System.identityHashCode(valor)/10000+"), "+
			    "int (valor2= "+ valor2 +", "+
        		"hash2= "+ System.identityHashCode(valor2)/10000+")\n");

		System.out.printf("   Main-0:  "+
			    "Str (nom1= "+ nome1 +", "+ 
	            "hash= "+ System.identityHashCode(nome1)/10000 +"),  "+
			    "Int (valor1= "+ valor1 +", "+
		        "hash1= "+ System.identityHashCode(valor1)/10000+"), "+
			    "int (valor3= "+ valor3 +", "+
        		"hash3= "+ System.identityHashCode(valor3)/10000+")\n");

		nome  = "BB";
		valor = 4;
		
		// Initialization at main.	
		System.out.printf("   Main-1:  "+
			    "Str (nome= "+ nome +", "+ 
	            "hash= "+ System.identityHashCode(nome)/10000 +"),  "+
			    "Int (valor0= "+ valor +", "+
		        "hash0= "+ System.identityHashCode(valor)/10000+"), "+
			    "int (valor2= "+ valor2 +", "+
        		"hash2= "+ System.identityHashCode(valor2)/10000+")\n");

		System.out.printf("   Main-1:  "+
			    "Str (nom1= "+ nome1 +", "+ 
	            "hash= "+ System.identityHashCode(nome1)/10000 +"),  "+
			    "Int (valor1= "+ valor1 +", "+
		        "hash1= "+ System.identityHashCode(valor1)/10000+"), "+
			    "int (valor3= "+ valor3 +", "+
        		"hash3= "+ System.identityHashCode(valor3)/10000+")\n");
		
	 // Update Values.	
		objMain.updateDados(nome,valor,valor2);
		objMain.updateDados(nome1,valor1,valor3);
		
	 // Final Values.	
		System.out.printf("   Main-2:  "+
			    "Str (nome= "+ nome +", "+ 
	            "hash= "+ System.identityHashCode(nome)/10000 +"),  "+
			    "Int (valor0= "+ valor +", "+
		        "hash0= "+ System.identityHashCode(valor)/10000+"), "+
			    "int (valor2= "+ valor2 +", "+
        		"hash2= "+ System.identityHashCode(valor2)/10000+")\n");

		System.out.printf("   Main-2:  "+
			    "Str (nom1= "+ nome1 +", "+ 
	            "hash= "+ System.identityHashCode(nome1)/10000 +"),  "+
			    "Int (valor1= "+ valor1 +", "+
		        "hash1= "+ System.identityHashCode(valor1)/10000+"), "+
			    "int (valor3= "+ valor3 +", "+
        		"hash3= "+ System.identityHashCode(valor3)/10000+")\n");
	}
}
