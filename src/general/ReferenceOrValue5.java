package general;

public class ReferenceOrValue5 {
	Integer dado1;
	Integer dado2;
	String nome;
	
	public static void main (String [] args) {
		String a = "teste";
		String b = a;
		a = "teste1";
		System.out.println(b);
		
		
		ReferenceOrValue5 ref1 = new ReferenceOrValue5();
		ref1.dado1 = 1;
		ref1.dado2 = 2;
		
		ReferenceOrValue5 ref2 = ref1;
		
		ref1.dado1 = 3;
		ref1.dado2 = 4;
		System.out.println(ref2.dado1+ " "+ref2.dado2);
		
	}
}
