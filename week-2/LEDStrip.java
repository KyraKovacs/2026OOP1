public class LEDStrip{
	
	private int red;
	private int green;
	private int blue;
	private int dimmer;
	
	public LEDStrip(int red, int green, int blue, int dimmer)
	{
		this.red=red;
		this.green=green;
		this.blue=blue;
		this.dimmer=dimmer;
	}
	
	public int getRed()
	{
		return this.red;
	}
	
	public void setRed(int red)
	{
		this.red = red;
	}
	
	public int getGreen()
	{
		return this.green;
	}
	
	public void setGreen(int green)
	{
		this.green = green;
	}
	
	public int getBlue()
	{
		return this.blue;
	}
	
	public void setBlue(int blue)
	{
		this.blue = blue;
	}
	
	public int getDimmer()
	{
		return this.dimmer;
	}
	
	public void setDimmer(int dimmer)
	{
		this.dimmer = dimmer;
	}

    public boolean setColor(String color) 
	{
		if (color == null) 
		{
			return false;
		}
	
		switch (color()) 
		{
			case "red":
				red = 255; green = 0; blue = 0;
				break;
			case "green":
				red = 0; green = 255; blue = 0;
				break;
			case "blue":
				red = 0; green = 0; blue = 255;
				break;
			case "purple":
				red = 255; green = 0; blue = 255;
				break;
			case "orange":
				red = 255; green = 165; blue = 0;
				break;
			case "sun":
				red = 201; green = 141; blue = 38;
				break;
			default:
				return false;
		}
		
		return true;
	}
	
	public String getColor() 
	{
		if (red == 255 && green == 0 && blue == 0) return "Red";
		if (red == 0 && green == 255 && blue == 0) return "Green";
		if (red == 0 && green == 0 && blue == 255) return "Blue";
		if (red == 255 && green == 0 && blue == 255) return "Purple";
		if (red == 255 && green == 165 && blue == 0) return "Orange";
		if (red == 201 && green == 141 && blue == 38) return "Sun";

		return "Unknown";
	}
	
	public void setDimmer(int percentage) 
	{
		if (percentage < 0) {
			dimmer = 0;
		} 
		else if (percentage > 100) 
		{
			dimmer = 100;
		} 
		else 
		{
			dimmer = percentage;
		}
	}
}