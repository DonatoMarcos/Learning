package entities;

public class Room {

	private Guest myGuest;
	private int roomNumber;
	private boolean occupied;

	public Room(Guest myGuest, int roomNumber) {
		this.myGuest = myGuest;
		this.roomNumber = roomNumber;
		occupied = true;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public Guest getMyGuest() {
		return myGuest;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

/*	public String toString() {
		
		if (isOccupied())
			return "Room Number ["
			+ getRoomNumber()
			+ "] is occupied. Guest name is: "
			+ this.getMyGuest().getName()
		    + " and Guest email is: " 
			+ this.getMyGuest().getEmail();
		else
			return "Room Number ["
			+ getRoomNumber()
			+ "] is empty.";
				
	}
*/
	public String toString() {
		
		if (isOccupied())
			return "Room Number ["
			+ getRoomNumber()
			+ "] is occupied. Guest data - "
			+ this.getMyGuest().toString();
		else
			return "Room Number ["
			+ getRoomNumber()
			+ "] is empty.";
				
	}
}
