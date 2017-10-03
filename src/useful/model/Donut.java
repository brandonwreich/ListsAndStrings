package useful.model;

public class Donut
{
	//Declares the variable, but are all set to 0 or null
	
	private boolean hasSprinkles;
	private boolean isGlazed;
	private String shape;
	private String flavor;
	private int holeCount;
	
	public Donut()
	{
		this.flavor = "plain";
		this.shape = "round";
		this.hasSprinkles = false;
		this.isGlazed = false;
	}
	
	public Donut(String flavor)
	{
		this();
		this.flavor = flavor;
//		this.shape = shape;
//		this.hasSprinkles = hasSprinkles;
//		this.isGlazed = isGlazed;
//		this.holeCount = holeCount;
	}
	
	public String toString()
	{
		String description = "This donut is a " + flavor + " donut";
		
		return description;
	}
}
