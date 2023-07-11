
public class Apartment extends Residential {
	
	//variables
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	
	//constructors
	public Apartment() {//default
		super();
		numRentableUnits=0;
		avgUnitSize=0.0;
		parkingAvailable=false;
	}
	
	//preferred constructor
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits,
			double avgUnitSize,boolean parkingAvailable) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.numRentableUnits=numRentableUnits;
		this.avgUnitSize=avgUnitSize;
		this.parkingAvailable=parkingAvailable;
		
	}

	
	//methods
		public void draw()//draws object to screen
		{
			System.out.println("Drawing code for: "+this.getClass());
		}
		
		public String displayData()
		{
			String string;
			string = "Project name: "+projectName+"\nAddress: "+completeAddress+"\nSquare feet: "+totalSquareFeet
					+"\nOccupancy group: "+occupancyGroup+"\nSubgroup: "+subgroup + "\nNumber of bedrooms: "+numBedrooms
					+"\nNumber of bathrooms: "+numBathrooms+ "\nLaundry Room: "+ ((laundryRoom == true) ? "Y" : "N")+
					"\nNumber of rentable units: "+numRentableUnits+"\nAverage unit size: "+avgUnitSize+"\nParking available: "+
					 ((parkingAvailable == true) ? "Y" : "N");
			return string; 
		}
	
	
	//getters/setters
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

	
	//toString
	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + ((parkingAvailable == true) ? "Y" : "N") + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ", laundryRoom=" + ((laundryRoom == true) ? "Y" : "N") + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup
				+ ", totalSquareFeet=" + totalSquareFeet + "]";
	}
	
}
