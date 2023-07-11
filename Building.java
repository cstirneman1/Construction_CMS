
public class Building {
	
	//variables
	protected String projectName,completeAddress,occupancyGroup,subgroup;
	protected double totalSquareFeet;
	
	
	//constructors
	public Building()//default constructor
	{
		projectName="";
		completeAddress="";
		occupancyGroup="";
		subgroup="";
		totalSquareFeet=0.0;
	}
	
	public Building(String projectName,String completeAddress,double totalSquareFeet,String occupancyGroup,String subgroup)//preferred constructor
	{
		this.projectName=projectName;
		this.completeAddress=completeAddress;
		this.occupancyGroup=occupancyGroup;
		this.subgroup=subgroup;
		this.totalSquareFeet=totalSquareFeet;
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
				+"\nOccupancy group: "+occupancyGroup+"\nSubgroup: "+subgroup;
		return string;
	}
	
	
	//getters&setters
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	public String getSubgroup() {
		return subgroup;
	}

	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", occupancyGroup="
				+ occupancyGroup + ", subgroup=" + subgroup + ", totalSquareFeet=" + totalSquareFeet + "]";
	}
	
}


