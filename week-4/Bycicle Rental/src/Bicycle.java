public class Bicycle
{
    private String brand;
    private String type;

    public Bicycle(String brand, String type)
    {
        this.brand=brand;
        this.type=type;
    }

    public String getBrand()
    {
        return this.brand;
    }

    public String getType()
    {
        return this.type;
    }

    public void setBrand(String brand)
    {
        this.brand=brand;
    }

    public void setType(String type)
    {
        this.type=type;
    }
}
