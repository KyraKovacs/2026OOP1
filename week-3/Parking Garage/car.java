public class Car
{
	private LicensePlate licensePlate;
	private String make;
	private String color;
	
	public Car(LicensePlate licensePlate, String make, String color)
	{
		this.licensePlate=licensePlate;
		this.make=make;
		this.color=color;
	}
	
	public LicensePlate getLicensePlate()
	{
		return this.licensePlate;
	}
	
	public void setLicensePlate(LicensePlate licensePlate)
	{
		this.licensePlate=licensePlate;
	}
	
	public String getMake()
	{
		return this.make;
	}
	
	public void setMake(String make)
	{
		this.make=make;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
}