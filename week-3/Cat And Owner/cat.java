public class Cat
{
	private String name;
	private double happyLevel;

	public Cat(String name, double happyLevel)
	{
		this.name=name;
		this.happyLevel=happyLevel
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public double getHappyLevel()
	{
		return this.happyLevel;
	}
	
	public void setHappyLevel(double happyLevel)
	{
		this.happyLevel = happyLevel;
	}
	
	public void validateHappiness()
	{
		if (happyLevel < 0.0 || happyLevel > 5.0)
		{
			return this.happylevel;
		}
	}
	
	public static void pet(double value)
	{
		return this.happyLevel + 0.3;
	}
	
	public boolean isHappy()
	{
		if (happyLevel != null && this.happyLevel.size() >= 3.5;)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
}