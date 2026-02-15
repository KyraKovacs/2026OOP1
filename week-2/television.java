public class Television{
	
	private String brand;
	private String model;
	private int currentVolume;
	private int currentChannel;
	private String childLockPin;
	
	
	public Television(String brand, String model)
	{
		this.brand=brand;
		this.model=model;
		this.currentVolume=currentVolume;
		this currentChannel=currentChannel;
		this.childLockPin=childLockPin;
	}
	
	public String getBrand()
	{
		return this.brand;
	}
	
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	public String getModel()
	{
		return this.model;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public int getCurrentVolume()
	{
		return this.currentVolume;
	}
	
	public void setCurrentVolume(int currentVolume)
	{
		this.currentVolume = currentVolume;
	}
	
	public int getCurrentChannel()
	{
		return this.currentChannel;
	}
	
	public void setCurrentChannel(int currentChannel)
	{
		this.currentChannel = currentChannel;
	}
	
	public String getChildLockPin()
	{
		return this.childLockPin;
	}
	
	public void setChildLockPin(String childLockPin)
	{
		this.childLockPin = childLockPin;
	}
	
	
	public void channelUp()
	{
		this.currentChannel++;
	}
	
	public void channelDown()
	{
		this.currentChannel--;
	}
	
	public void volumeUp()
	{
		this.currentVolume++;
	}
	
	public void volumeDown()
	{
		this.currentVolume--;
	}
	
	public void setChannel(int channel) 
	{
        if (channel != null && !channel.isEmpty()) 
		{
			this.currentChannel = channel;
		}
    }
	
	public void setChildLock(String pinCode) 
	{
		if (pinCode != null && !pinCode.isEmpty()) 
		{
			this.childLockPin = pinCode;
		}
	}

	public void removeChildLock(String pinCode) 
	{
		if (childLockPin != null && childLockPin.equals(pinCode)) 
		{
			this.childLockPin = null;
		}
	}

	public boolean isChildLockActive() 
	{
		return childLockPin != null;
	}
}