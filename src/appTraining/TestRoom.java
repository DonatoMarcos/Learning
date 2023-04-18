package appTraining;

import java.util.Locale;
import java.util.Scanner;

import entities.Guest;
import entities.Room;

public class TestRoom {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int auxAlugueis = 100;

		do{
			System.out.print("How many rooms will be rented?");
			auxAlugueis = sc.nextInt();
			if (auxAlugueis > 10) {
				System.out.println("Maximum = 10.");
			}
		} while (auxAlugueis > 10);
		
		Room[] quartos = new Room[10];
		int auxRoom;
		String auxName;
		String auxEmail;
		
		for (int i=0; i<auxAlugueis; i++) {
			System.out.println("\nRenting number["+(i+1)+"]: ");
			System.out.print("Room Number (0-9): ");
			auxRoom = sc.nextInt();
			sc.nextLine();
			if ((auxRoom > 10)
			 || (quartos[auxRoom] != null) 
			 && (quartos[auxRoom].isOccupied())) {
				System.out.println("Try an empty and valid room! ");
				i--;
			}
			else {
				System.out.print("Guest name: ");
				auxName = sc.nextLine();
				System.out.print("Guest e-mail: ");
/*				auxEmail = sc.next();
				Guest auxPessoa = new Guest(auxName,auxEmail);
				quartos[auxRoom] = new Room(auxPessoa, auxRoom);
*/
				quartos[auxRoom] = new Room(new Guest(auxName,sc.next()), auxRoom);
			}
		}
		
		for (Room quarto : quartos) {
			if (quarto != null) {
				System.out.print("\n"+quarto);
			}
		}
		
		sc.close();
	}

}
