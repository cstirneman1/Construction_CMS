
public class Residential extends Building {
	
	//class variables
	protected int numBedrooms, numBathrooms;
	protected boolean laundryRoom;
	
	
	//Constructors
	public Residential() {//default constructor
		super();
		numBedrooms=0;
		numBathrooms=0;
		laundryRoom=false;
	}
	
	//preferred constructor
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup,int numBedrooms, int numBathrooms,boolean laundryRoom) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numBedrooms=numBedrooms;
		this.numBathrooms=numBathrooms;
		this.laundryRoom=laundryRoom;
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
				+"\nOccupancy group: "+occupancyGroup+"\nSubgroup: "+subgroup + "\nNumber of bedrooms: "+numBedrooms
				+"\nNumber of bathrooms: "+numBathrooms+ "\nLaundry Room: "+ ((laundryRoom == true) ? "Y" : "N");
		return string;
	}
	
	
	//getters/setters
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

	
	//toStriing
	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ ((laundryRoom == true) ? "Y" : "N")+ ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + ", totalSquareFeet="
				+ totalSquareFeet + "]";
	}
	
	

	
	
	


}
