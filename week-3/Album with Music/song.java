public class Song
{
	private String title;
	private int playTimeInSeconds;
	private int timesPlayed;
	
	public Song(String title, int playTimeInSeconds)
	{
		this.title=title;
		this.playTimeInSeconds=playTimeInSeconds;
		this.timesPlayed=timesPlayed;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public void setTitle(String title)
	{
		this.title=title;
	}
	
	public int getPlayTimeInSeconds()
	{
		return this.playTimeInSeconds;
	}
	
	public void setPlayTimeInSeconds(int playTimeInSeconds)
	{
		this.playTimeInSeconds=playTimeInSeconds;
	}
	
	public int getTimesPlayed()
	{
		return this.timesPlayed;
	}
	
	public void setTimesPlayed(int timesPlayed)
	{
		this.timesPlayed=timesPlayed;
	}
}