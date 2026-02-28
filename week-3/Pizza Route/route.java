import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;

public class Route
{
	private DeliveryDriver deliveryDriver;
	private List<Destination> destinations;
	
	public Route(DeliveryDriver deliveryDriver)
	{
		this.deliveryDriver=deliveryDriver;
		this.destinations=new ArrayList<>();
	}
	
	public DeliveryDriver getDeliveryDriver()
	{
		return this.deliveryDriver;
	}
	
	public void setDeliveryDriver(DeliveryDriver deliveryDriver)
	{
		this.deliveryDriver = deliveryDriver;
	}
	
	public List<Destination> getDestinations()
	{
		return this.destinations;
	}
	
	public void setDestinations(List<Destination> destinations)
	{
		this.destinations = destinations;
	}
	
	public void addDestination(List<Destination> destinations) 
	{
        this.destinations.add(destination);
    }
	
	public static double getAmountOfPizzas(List<Pizza> pizzas)
	{
		return this.pizzas.size();
	}
	
	public static double getTotalDistance(List<Destination> destinations)
	{
		return.this.Integer.sum(distanceToPreviousDestination);
	}
	
	public static double getDistancePrice(List<Destination> destinations)
	{
		return.this.Integer.sum(travelPriceInCents);
	}
	
	public static int getTotalPriceInCents(List<Destination> destinations, List<Pizza> pizzas)
	{
		return (int) (distancePrice * priceInCents);
	}
	
	public static int getProfitInCents(SalaryCalculator salaryInCents)
	{
		return (int) (totalPriceInCents - salaryInCents);
	}
}