public class SalaryCalculator
{
	private DeliveryDriver deliveryDriver;
	
	public SalaryCalculator()
	{
		this.deliveryDriver=deliveryDriver;
	}
	
	public DeliveryDriver getDeliveryDriver()
	{
		return.this.deliveryDriver;
	}
	
	public void setDeliveryDriver(DeliveryDriver deliveryDriver)
	{
		this.deliveryDriver=deliveryDriver;
	}
	
	public int String getSalaryInCents(DeliveryDriver deliveryDriver) 
	{
		int age = this.getSalaryInCents();


		if (15< age && age < 21) 
		{
			return 4;
		} 
		else if (19< age && age <22) 
		{
			return 4.75;
		} 
		else
		{
			return 5.25;
		} 
	}
}