
public class Application {

	public static void main(String[] args) {
		
		// Testing Building class
		System.out.println("========Building class=======");

		Building b1 = new Building("Gaines Building", "123 Main Street Louisville, KY 40201",2540, "Residential", "R1");
		Building b2 = new Building();
		System.out.println(b2);
		System.out.println();
		System.out.println(b1);
		System.out.println();

		//test methods
		System.out.println(b1.displayData());
		System.out.println();
		System.out.println(b1.toString());
		System.out.println();
		
		//test getters/setters
		b1.setProjectName("New Project");
		System.out.println(b1.getProjectName());
		
		b1.setCompleteAddress("456 Apple way Miami, Florida");
		System.out.println(b1.getCompleteAddress());
		
		b1.setTotalSquareFeet(5000);
		System.out.println(b1.getTotalSquareFeet());
		
		b1.setOccupancyGroup("Mall");
		System.out.println(b1.getOccupancyGroup());
		
		b1.setSubgroup("R2");
		System.out.println(b1.getSubgroup());
		System.out.println("===============================");
		System.out.println();


		
		//Testing Business Class
		System.out.println("=========Business Class========");

		Business bus1 = new Business();
		System.out.println(bus1);
		System.out.println();
		Business bus2=new Business ("Gaines Business", "123 Main Street Louisville, KY 40201",2540, "Business", "B",20);
		System.out.println(bus2);
		System.out.println();

		//test methods
		System.out.println(bus2.displayData());
		System.out.println();
		System.out.println(bus2.toString());
		System.out.println();

		//test getters/setters
		bus2.setNumRentableUnits(10);
		System.out.println(bus2.getNumRentableUnits());
		System.out.println("===============================");
		System.out.println();
		
		
		//Testing Residential class
		System.out.println("=======Residential Class======");

		Residential r1=new Residential();
		System.out.println(r1);
		System.out.println();
		Residential r2 =new Residential("Gaines Residence", "123 Main Street Louisville, KY 40201",2540, "Residential", "R1",5,3,true);
		System.out.println(r2);
		System.out.println();

		//test methods
		System.out.println(r2.displayData());
		System.out.println();
		System.out.println(r2.toString());
		System.out.println();
		
		//test getters/setters
		r2.setNumBedrooms(3);
		System.out.println(r2.getNumBedrooms());
		
		r2.setNumBathrooms(1);
		System.out.println(r2.getNumBathrooms());
		
		r2.setLaundryRoom(false);
		System.out.println(r2.isLaundryRoom());
		System.out.println("===============================");
		System.out.println();
		
		
		//Test Mall Class
		System.out.println("=======Mall Class=======");
		
		Mall m1= new Mall();
		System.out.println(m1);
		System.out.println();
		Mall m2 = new Mall("Gaines Mall", "123 Main Street Louisville, KY 40201",2540, "Business", "B",20,10,50,1500.0);
		System.out.println(m2);
		System.out.println();

		//test methods
		System.out.println(m2.displayData());
		System.out.println();
		System.out.println(m2.toString());
		System.out.println();

		//test getters/setters
		m2.setNumRentedUnits(17);
		System.out.println(m2.getNumRentedUnits());
		
		m2.setNumParkingSpaces(30);
		System.out.println(m2.getNumParkingSpaces());
		
		m2.setMedianUnitSize(1000);
		System.out.println(m2.getMedianUnitSize());
		System.out.println("===============================");


		//test apartment class
		System.out.println("=======Apartment Class=======");
		
		Apartment a1 = new Apartment();
		System.out.println(a1);
		System.out.println();
		Apartment a2 = new Apartment("Gaines Apartments", "123 Main Street Louisville, KY 40201",2540, "Residential", "R1",50,20,true,20,900.0,true);
		System.out.println(a2);
		System.out.println();

		//test methods
		System.out.println(a2.displayData());
		System.out.println();
		System.out.println(a2.toString());
		System.out.println();

		//test getters /setters
		a2.setNumRentableUnits(25);
		System.out.println(a2.getNumRentableUnits());
		
		a2.setAvgUnitSize(1000.0);
		System.out.println(a2.getAvgUnitSize());
		
		a2.setParkingAvailable(false);
		System.out.println(a2.isParkingAvailable());
		System.out.println("==========================");
		System.out.println();

		
		//test Single Family Home
		System.out.println("======Single Family Home======");
		
		SingleFamilyHome sf1= new SingleFamilyHome();
		System.out.println(sf1);
		System.out.println();
		SingleFamilyHome sf2= new SingleFamilyHome("Gaines House", "123 Main Street Louisville, KY 40201",2540, "Residential", "R1",5,3,true,false);
		System.out.println(sf2);
		System.out.println();

		//test methods
		System.out.println(sf2.displayData());
		System.out.println();
		System.out.println(sf2.toString());
		System.out.println();

		//test getters/setters
		sf2.setGarage(true);
		System.out.println(sf2.isGarage());
		System.out.println("======================");
			
	}

}
