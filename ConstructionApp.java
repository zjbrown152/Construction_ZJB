/*******
 * This is a Application class that shows how we can initialize the classes we created. It also shows how the data would be displayed. 
 * @author Zane Brown
 * @version 1.0 Programming Project 2
 *
 *********/
public class ConstructionApp {

	public static void main(String[] args) 
	{
		//Initializes Building, not as practical.
		Building b=new Building();
		b.draw();
		System.out.println(b.displayData());
		
		//Initializes Apartment
		Apartment a=new Apartment();
		a.draw();
		System.out.println(a.displayData());
		
		//Initializes Mall
		Mall m= new Mall();
		m.draw();
		System.out.println(m.displayData());
		
		//Initializes Residential even though its not as practical.
		Residential r=new Residential();
		r.draw();
		System.out.println(r.displayData());
		
		//Initializes Single Family Home
		SingleFamilyHome sfh= new SingleFamilyHome();
		sfh.draw();
		System.out.println(sfh.displayData());
		
		//Initializes Business
		Business bu= new Business();
		bu.draw();
		System.out.println(bu.displayData());

	}

}
