package general;

public class ReferenceOrValue {
	
	public void changeInteger (Integer teste1) {
		teste1 = teste1 + 1;
		System.out.println(teste1);
		System.out.println(
				 teste1.getClass().getName() + '@' + Integer.toHexString(teste1.hashCode())
				 
);
		
	}
	
	public static void main (String [] args) {
		
		Integer teste = 12;
		System.out.println(teste);
		System.out.println(teste.getClass().getName() + '@' + Integer.toHexString(teste.hashCode()));
		
		ReferenceOrValue myClass = new ReferenceOrValue();
		myClass.changeInteger(teste);
		System.out.println(teste);
		System.out.println(teste.getClass().getName() + '@' + Integer.toHexString(teste.hashCode()));
			
		}
	}

