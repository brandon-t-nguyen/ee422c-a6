package assignment6.theater;

/**
 * This class represents a seat
 * that can be taken; not taken
 */
public class Seat
{
	protected int row;	//a = 0; aa = 26
	protected int seat;	//plain number
	protected HouseEnum house;	//see HouseEnum for details; holds the house
	protected boolean taken;	//flags if taken or not
	
	/**
	 * Constructor of a seat
	 * @param rowNumber		The row number of the seat: a=0, b=1, c=2,..., aa==26
	 * @param seatNumber	The seat number
	 * @param houseEnum		Enum representing the house
	 */
	public Seat(int rowNumber, int seatNumber, HouseEnum houseEnum){
		row = rowNumber;
		seat = seatNumber;
		house = houseEnum;
		taken = false;
	}
	
	//Accessors for taken: at some point 
	//these need to be synchronized
	public void setTaken(){
		taken = true;
	}
	public boolean isTaken(){
		return taken;
	}
	
	public String toString(){
		String output = "H"+house+", "+seat;
		//We need to figure out what the row
		if(row == 26){
			output += "AA";	//Add the row
		}
		else if (row != -1){
			output += Character.toString(((char)('A' + row)));	//Add the character
		}
		else{
			output += "BADROW";	//Bad row number
		}
		
		return output;
	}
}