public class Movie
{
    private String title;
    private int priceInEurocents;

    public Movie(String title, int priceInEurocents)
    {
        this.title=title;
        this.priceInEurocents=priceInEurocents;
    }

    public String getTitle()
    {
        return this.title;
    }

    public int getPriceInEurocents()
    {
        return this.priceInEurocents;
    }

    public void setTitle(String title)
    {
        this.title=title;
    }

    public void setPriceInEurocents(int priceInEurocents)
    {
        this.priceInEurocents=priceInEurocents;
    }

}
