import java.util.List;
import java.util.ArrayList;

public class Destination
{
	private String name;
	private String address;
	private double distanceToPreviousDestination;
	private List<Pizza> pizzas;
	
	
	public Destination(String name, String address, int distanceToPreviousDestination, int numberOfPizzas)
	{
		this.name=name;
		this.address=address;
		this.distanceToPreviousDestination=distanceToPreviousDestination;
		this.pizzas=new ArrayList<>();
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public double getDistanceToPreviousDestination()
	{
		return this.distanceToPreviousDestination;
	}
	
	public void setDistanceToPreviousDestination(double distanceToPreviousDestination)
	{
		this.distanceToPreviousDestination=distanceToPreviousDestination;
	}
	
	public List<Pizza> getPizzas()
	{
		return this.pizzas;
	}
	
	public void setPizzas(List<Pizza> pizzas)
	{
		this.pizzas=pizzas;
	}
	
	public static int getTravelPriceInCents(int distanceToPreviousDestination) 
	{
		return (int) (distanceToPreviousDestination * 0.05);
	}
}