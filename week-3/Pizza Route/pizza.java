import java.util.List;
import java.util.ArrayList;

public class Pizza
{
	private int DEFAULT_PIZZA_PRICE_IN_CENTS;
	
	public Pizza()
	{
		this.DEFAULT_PIZZA_PRICE_IN_CENTS=500;
	}
	
	public int getDEFAULT_PIZZA_PRICE_IN_CENTS()
	{
		return this.DEFAULT_PIZZA_PRICE_IN_CENTS;
	}
	
	public void setDEFAULT_PIZZA_PRICE_IN_CENTS(int DEFAULT_PIZZA_PRICE_IN_CENTS)
	{
		this.DEFAULT_PIZZA_PRICE_IN_CENTS=DEFAULT_PIZZA_PRICE_IN_CENTS;
	}
	
	public int getPriceInCents(int amountOfPizzas, int DEFAULT_PIZZA_PRICE_IN_CENTS)
	{
		return (int) (amountOfPizzas * DEFAULT_PIZZA_PRICE_IN_CENTS);
	}
}