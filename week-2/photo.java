public class Photo
{
	private int lengthInPixels;
	private int widthInPixels;
	private int dpi;
	private String description;
	private List<String> personsOnPicture;
	
	public Photo(int lengthInPixels, int widthInPixels, int dpi, String description)
	{
		this.lengthInPixels=lengthInPixels;
		this.widthInPixels=widthInPixels;
		this.dpi=dpi;
		this.description=description;
		this.personsOnPicture=personsOnPicture;
	}
	
	public int getLengthInPixels()
	{
		return this.lengthInPixels;
	}
	
	public void setLengthInPixels(int lengthInPixels)
	{
		this.lengthInPixels = lengthInPixels;
	}
	
	public int getWidthInPixels()
	{
		return this.widthInPixels;
	}
	
	public void setWidthInPixels(int widthInPixels)
	{
		this.widthInPixels = widthInPixels;
	}
	
	public int getDpi()
	{
		return this.dpi;
	}
	
	public void setDpi(int dpi)
	{
		this.dpi = dpi;
	}
	
	public int getDescription()
	{
		return this.description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public int getPersonsOnPicture()
	{
		return this.personsOnPicture;
	}
	
	public void setPersonsOnPicture(List<String> personsOnPicture)
	{
		this.personsOnPicture = personsOnPicture;
	}
	
	
	public boolean canBePrinted()
	{
		if
		{
			dpi>=150;
			lengthInPixels>=585;
			widthInPixels>=878;
		}
		
	}
	
	public boolean isGroupPicture()
	{
		return personsOnPicture != null && personsOnPicture.size() >= 2;
	}
}