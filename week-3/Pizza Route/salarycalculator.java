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
	
	public int getSalaryInCents(DeliveryDriver deliveryDriver) 
	{
		int age = this.getSalaryInCents();


		if (15< age && age < 21) 
		{
			return 400;
		} 
		else if (19< age && age <22) 
		{
			return 475;
		} 
		else
		{
			return 525;
		} 
	}
}