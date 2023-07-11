
public class SingleFamilyHome extends Residential{
	
	//variables
	private boolean garage;

	
	//constructors
	public SingleFamilyHome() {//default
		super();
		garage=false;
	}

	//preferred constructor
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.garage=garage;
	}
	
	
	//methods
	public void draw()//draws object to screen
	{
		System.out.println("Drawing code for: "+this.getClass());
	}
	
	public String displayData()//returns object in a string 
	{
		String string;
		string = "Project name: "+projectName+"\nAddress: "+completeAddress+"\nSquare feet: "+totalSquareFeet
				+"\nOccupancy group: "+occupancyGroup+"\nSubgroup: "+subgroup + "\nNumber of bedrooms: "+numBedrooms
				+"\nNumber of bathrooms: "+numBathrooms+ "\nLaundry Room: "+ ((laundryRoom == true) ? "Y" : "N"+
				"Garage: "+((garage == true) ? "Y" : "N"));
		return string;
	}

	
	//getters/setters
	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	
	//toString
	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + ((garage == true) ? "Y" : "N") + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + ((laundryRoom == true) ? "Y" : "N") + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup
				+ ", totalSquareFeet=" + totalSquareFeet + "]";
	}
	
}

