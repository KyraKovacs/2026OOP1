public class Owner{
	
	private Cat cat;
	
	public class Owner(Cat cat)
	{
		this.cat = cat;
	}
	
	public Cat getCat ()
	{
		return this.cat;
	}
	
	public void setCat (Cat cat)
	{
		this.cat = cat;
	}
	
	public boolean isCatHappy()
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
	
	public static String shoutToCat()
	{
		return "Come here, " + cat.getName();
	}
}