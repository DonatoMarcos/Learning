package javaTraining;

public class Class2 {
	
	
	String teste2;
	Integer numero2;
	
	public static void main (String[] args) {
		
		Class1 classe1 = new Class1("teste",1);
		Class2 classe2 = new Class2();
		classe2.teste2 = classe1.getTeste1();
		classe2.numero2 = classe1.getNumero1();
		
	}

}
