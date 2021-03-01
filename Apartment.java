/**
 * This class is the child class of the Residential class.
 * @author Zane Brown
 *
 */
public class Apartment extends Residential
{
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	public Apartment() 
	{
		super();
		this.numRentableUnits=0;
		this.avgUnitSize=0.0;
		this.parkingAvailable=false;
	}
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits=numRentableUnits;
		this.avgUnitSize=avgUnitSize;
		this.parkingAvailable=parkingAvailable;
		
	}
	
	
	public String displayData()
	{
		StringBuilder a=new StringBuilder();
		a.append("Project Name= "+projectName+"\n");
		a.append("Address= "+completeAddress+"\n");
		a.append("Square Feet= "+totalSquareFeet+"\n");
		a.append("Occupancy Group= "+occupancyGroup+"\n");
		a.append("Subgroup= "+subgroup+"\n");
		
		a.append("NumRentableUnits= "+numRentableUnits+"\n");
		a.append("avgUnitSize= "+avgUnitSize+"\n");
		a.append("Parking= "+parkingAvailable+"\n");
		a.append("Bedrooms= "+numBedrooms+"\n");
		a.append("Bathrooms= "+numBathrooms+"\n");
		a.append("Laundry Room= "+laundryRoom+"\n");
		
		return a.toString();
		
		
	}
	
	

	
	
	public int getNumRentableUnits() {
		return numRentableUnits;
	}
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}
	public double getAvgUnitSize() {
		return avgUnitSize;
	}
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}
	
	
	
	
	
	
	
	
	
	
	

}
