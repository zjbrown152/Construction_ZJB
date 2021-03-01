/**************
 * This class is the child class of Building and the parent class of Apartment as well as the SingleFamilyHome class.
 * @author Zane Brown
 *
 */
public class Residential extends Building
{
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	public Residential() 
	{
		super();
		this.numBedrooms=0;
		this.numBathrooms=0;
		this.laundryRoom=false;
		
	}

	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numBedrooms=numBedrooms;
		this.numBathrooms=numBathrooms;
		this.laundryRoom=laundryRoom;
	}
	
	

	

	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	
	

	


	
	
	

}
