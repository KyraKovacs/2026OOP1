import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;

public class Membership
{
	private LocalDate dayOfRegistration;
	private Person owner;
	
	public Membership(LocalDate dayOfRegistration, List<Person> owner)
	{
		this.dayOfRegistration=dayOfRegistration;
		this.owner=owner;
	}
	public LocalDate getDayOfRegistration()
	{
		return this.dayOfRegistration;
	}
	
	public void setDayOfRegistration(LocalDate dayOfRegistration)
	{
		this.dayOfRegistration = dayOfRegistration;
	}
		public People getOwner()
	{
		return this.owner;
	}
	
	public void setOwner(Person owner)
	{
		this.owner = owner;
	}
	
	public static void Membership(String[] args) {
        LocalDate dayOfRegistration = LocalDate.of(2008, 8, 21);
		LocalDate now = LocalDate.now();
        int AmountOfYears = Period.between(dayOfRegistration, now).getYears();
    }
	
	public static double getAnnualRevenueCost(int cost) 
	{
		int age = this.age();


		if (age < 12) 
		{
			return 5.00;
		} 
		else if (11 < age && age < 18) 
		{
			return 7.50;
		} 
		else if (17 < age && age < 65) 
		{
			return 10.00;
		} 
		else
		{
			return 30.35;
		} 
	}
	
	public boolean isEligibleForDiscount()
	{
		if(AmountOfYears != null && AmountOfYears() >= 5;)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	public void getLoyaltyDiscount(double loyaltydiscount)
	{
		this.loyaltydiscount = 0.2;
	}
}