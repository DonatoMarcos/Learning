package generics;

import java.util.ArrayList;
import java.util.List;

public class Generics1 {
	
	static List teste1;
	static List<Integer> teste2;
	
	public static void main (String [] args) {
		teste1 = new ArrayList();
		teste1.add(1);
		teste1.add("1");
		
		System.out.println(teste1.get(0).getClass()+" "+teste1.get(1).getClass() );

		teste2 = new ArrayList<Integer>();
		teste2.add(1);
//		teste2.add("1");
		
		System.out.println(teste2.get(0).getClass()+" "+teste2.get(1).getClass() );
}

}
