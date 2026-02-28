public class Book
{
	private String title;
	private String author;
	private boolean hardcover;
	private double price;
	private int numberOfPages;
	private int timesRead;
	private double AVERAGE_READING_TIME;
	
	public Book (String title, String author, boolean hardcover, double price, int numberOfPages)
	{
		this.title = title;
		this.author = author;
		this.hardcover = hardcover;
		this.price = price;
		this.numberOfPages = numberOfPages;
		this.timesRead = 0;
		this.AVERAGE_READING_TIME = 0.8;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getAuthor()
	{
		return this.author;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public boolean getHardcover()
	{
		return this.hardcover;
	}
	
	public void setHardcover(boolean hardcover)
	{
		this.hardcover = hardcover;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public int getNumberOfPages()
	{
		return this.numberOfPages;
	}
	
	public void setNumberOfPages(int numberOfPages)
	{
		this.numberOfPages = numberOfPages;
	}
	
	public int getTimesRead()
	{
		return this.timesRead;
	}
	
	public void setTimesRead(int timesRead)
	{
		this.timesRead = timesRead;
	}
	
	public double getAVERAGE_READING_TIME()
	{
		return this.AVERAGE_READING_TIME;
	}
	
	public void setAVERAGE_READING_TIME(double AVERAGE_READING_TIME)
	{
		this.AVERAGE_READING_TIME = AVERAGE_READING_TIME;
	}
	
	public void read()
	{
		this.timesRead++;
	}
	
	public static int getReadTimeInMinutes(int numberOfPages, double AVERAGE_READING_TIME) 
	{
		return (int) (numberOfPages / AVERAGE_READING_TIME);
	}
	
	public static String getReadTimeMessage(int readTimeInMinutes) 
	{
		int minutes = this.getReadTimeInMinutes();


		if (minutes < 61) 
		{
			return "You can read this.";
		} 
		else if (60 < minutes && minutes < 240) 
		{
			return "Are you sure you want to read this now?";
		} 
		else
		{
			return "You should not start reading this right now.";
		} 
	}
}