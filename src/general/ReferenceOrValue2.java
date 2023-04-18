package general;

public class ReferenceOrValue2 {
	Integer dado1;
	Integer dado2;
	String nome;
	
	public void updateDados(ReferenceOrValue2 objMetodo, Integer dado3Metodo, Integer dado4Metodo, 
			                String sobrenome, int dado5metodo, int dado6metodo) 
	{
     // Initialization within the method.	
		objMetodo.nome = "Ringo";
		sobrenome = "X";
      //objMetrodo.dado1 = no change
		objMetodo.dado2 = 0;
        dado3Metodo = 0;
        dado4Metodo = 0;
        dado5metodo = 0;
        dado6metodo = 0;
		System.out.println("Dentro:  Obj.Nome= " + objMetodo.nome  + ", "+
									"Str.Surn= " + sobrenome       + ", "+
									"Obj.D1= " + objMetodo.dado1 + ", "+
                					"Obj.D2= " + objMetodo.dado2 + ", "+
                					"Int.D3= " + dado3Metodo     + ", "+
                					"Int.D4= " + dado4Metodo     + ", "+
									"int.D5= " + dado5metodo     + ", "+
									"int.D6= " + dado6metodo);
		System.out.println(System.identityHashCode(objMetodo));
	}
	
	public static void main (String [] args) throws Throwable {
		ReferenceOrValue2 objMain = new ReferenceOrValue2();
		
	 // Initialization at main.	
		objMain.nome = "John";
		String sobrenome = "Paul";
		objMain.dado1 = 1;
		objMain.dado2 = 2;
		Integer dado3 = 3;
		Integer dado4 = 4;
		int dado5 = 5;
		int dado6 = 6;
		
		objMain.updateDados(objMain,dado3,dado4,sobrenome,dado5,dado6);
		System.out.println("Fora:    Obj.Nome= " + objMain.nome  + ", "+ 
									"Str.Surn= " + sobrenome     + ", "+
									"Obj.D1= " + objMain.dado1 + ", "+
			    					"Obj.D2= " + objMain.dado2 + ", "+
								    "Int.D3= " + dado3         + ", "+
								    "Int.D4= " + dado4         + ", "+
	    							"int.D5= " + dado5         + ", "+
	    							"int.D6= " + dado6);
	}
}
