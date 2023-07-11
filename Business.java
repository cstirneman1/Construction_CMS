
public class Business extends Building{
	
	//class variable
	protected int numRentableUnits;

	
	//constructors
	public Business() {//default constructor
		super();
		numRentableUnits=0;
	}

	//preferred constructor
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numRentableUnits) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits=numRentableUnits;
	}

	
	//methods
	public void draw()//draws object to screen
	{
		System.out.println("Drawing code for: "+this.getClass());
	}
	
	public String displayData()//returns object info in a string
	{
		String string;
		string = "Project name: "+projectName+"\nAddress: "+completeAddress+"\nSquare feet: "+totalSquareFeet
				+"\nOccupancy group: "+occupancyGroup+"\nSubgroup: "+subgroup +"\nNumber of rentable units: "
				+numRentableUnits;
		return string;
	}
	
	
	//getters/setters
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	
	//toString
	@Override
	public String toString() {
		return "Business [numRentableUnits= " + numRentableUnits + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup
				+ ", totalSquareFeet=" + totalSquareFeet + "]";
	}
	
	
	
	
}
