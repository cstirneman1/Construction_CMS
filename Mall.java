
public class Mall extends Business {
	
	//class variables
	private int numRentedUnits, numParkingSpaces;
	private double medianUnitSize;
	
	
	//Constructors
	public Mall() {//default
		super();
		numRentedUnits=0;
		numParkingSpaces=0;
		medianUnitSize=0.0;
	}
	
	//preferred constructor
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numRentableUnits, int numRentedUnits, int numParkingSpaces, double medianUnitSize) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentableUnits);
		this.numRentedUnits=numRentedUnits;
		this.numParkingSpaces=numParkingSpaces;
		this.medianUnitSize=medianUnitSize;
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
				+"\nOccupancy group: "+occupancyGroup+"\nSubgroup: "+subgroup +"\nNumber of rented units: "+numRentedUnits
				+"\nNumber of parking spaces: "+numParkingSpaces+"\nMedian Unit size: "+medianUnitSize;
		return string;
	}

	
	//getters/setters
	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}

	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	
	//toString
	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", numParkingSpaces=" + numParkingSpaces + ", medianUnitSize="
				+ medianUnitSize + ", numRentableUnits=" + numRentableUnits + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", occupancyGroup=" + occupancyGroup + ", subgroup="
				+ subgroup + ", totalSquareFeet=" + totalSquareFeet + "]";
	}
		
	

}
