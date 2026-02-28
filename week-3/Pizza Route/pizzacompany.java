import java.util.Comparator;
import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

public class PizzaCompany
{
	private String name;
	private List<Route> routes;
	
	public PizzaCompany(String name)
	{
		this.name=name;
		this.routes=new ArrayList<>();
	}
	
	public String getName()
	{
		return.this.name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public List<Route> getRoutes()
	{
		return.this.routes;
	}
	
	public void setRoutes(List<Route> routes)
	{
		this.routes=routes;
	}
	
	public void addRoute(List<Route> routes) 
	{
        this.routes.add(route);
    }
	
	public static int getTotalProfitInCents(List<Route> routes)
	{
		return.this.Integer.sum(totalPriceInCents);
	}
	
	public static Optional<Route> getShortestRoute() 
	{
		return routes.stream()
            .min(Comparator.comparingInt(Route::getTotalDistance));
	}
	
	public static Optional<Route> getShortestRoute() 
	{
		return routes.stream()
			.max(Comparator.comparingInt(Route::getTotalDistance));
	}
	
	public static Optional<Pizza> getRouteWithMostPizzas() 
	{
		return pizzas.stream()
			.max(Comparator.comparingInt(Pizza::getAmountOfPizzas));
	}
}