package general;

public class ReferenceOrValue4 {
	Integer dado1;
	Integer dado2;
	String nome;
	
	public void updateDados(ReferenceOrValue4 objMetodo, 
			                String sobrenome) 
	{
		
		System.out.println("Valores Method-1: " +
			   "Obj.Nome= " + objMetodo.nome  + ", "+ 
			   "Str.Surn= " + sobrenome);
		
		System.out.println("Hashcodes Method-1: "+
	            "Obj.Nome= " + System.identityHashCode(objMetodo.nome)  + ", "+
				"Str.Surn= " + System.identityHashCode(sobrenome));
		
		objMetodo.nome = "John_v2";
		sobrenome = "Paul_v2";

		System.out.println("Valores Method-2: " +
				   "Obj.Nome= " + objMetodo.nome  + ", "+ 
				   "Str.Surn= " + sobrenome);
			
			System.out.println("Hashcodes Method-2: "+
		            "Obj.Nome= " + System.identityHashCode(objMetodo.nome)  + ", "+
					"Str.Surn= " + System.identityHashCode(sobrenome));
			
	}
	
	public static void main (String [] args) throws Throwable {
		ReferenceOrValue4 objMain = new ReferenceOrValue4();
		
	 // Initialization at main.	
		objMain.nome = "John_v1";
		String sobrenome = "Paul_v1";
		
		System.out.println("Valores Main-1: " +
			   "Obj.Nome= " + objMain.nome  + ", "+ 
			   "Str.Surn= " + sobrenome);
		
		System.out.println("Hashcodes Main-1: "+
	            "Obj.Nome= " + System.identityHashCode(objMain.nome)  + ", "+
				"Str.Surn= " + System.identityHashCode(sobrenome));
		
	 // Update Values.	
		objMain.updateDados(objMain,sobrenome);
		
	 // Final Values.	
		System.out.println("Valores Main-2: " +
				   "Obj.Nome= " + objMain.nome  + ", "+ 
				   "Str.Surn= " + sobrenome);
			
		System.out.println("Hashcodes Main-2: "+
		            "Obj.Nome= " + System.identityHashCode(objMain.nome)  + ", "+
					"Str.Surn= " + System.identityHashCode(sobrenome));
			
	}
}
