/*
 * This class is a child class for the Residential class.
 */
public class SingleFamilyHome extends Residential
{
	private boolean garage;
	

	
	public SingleFamilyHome()
	{
		super();
		this.garage=false;
		
		
	}
	
	
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		// TODO Auto-generated constructor stub
		this.garage=garage;
	}
	
	
	//Displays all information seen in the SFH class.
	public String displayData()
	{
		StringBuilder sfh= new StringBuilder();
		sfh.append("Project Name= "+projectName+"\n");
		sfh.append("Address= "+completeAddress+"\n");
		sfh.append("Square Feet= "+totalSquareFeet+"\n");
		sfh.append("Occupancy Group= "+occupancyGroup+"\n");
		sfh.append("Subgroup= "+subgroup+"\n");
		sfh.append("Garage= "+garage+"\n");
		return sfh.toString();
		
	}



	






	public boolean isGarage() {
		return garage;
	}



	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	
	
}





