import java.time.LocalDate;
import java.time.Period;

public class DeliveryDriver
{
	private String name;
	private LocalDate dateOfBirth;
	
	public DeliveryDriver(String name; LocalDate dateOfBirth)
	{
		this.name=name;
		this.dateOfBirth=dateOfBirth;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public LocalDate getDateOfBirth()
	{
		return this.dateOfBirth;
	}
	
	public void setDateOfBirth(LocalDate dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}
	
	public static void DeliveryDriver(String[] args) {
        LocalDate dateOfBirth = LocalDate.of(2008, 8, 21);
		LocalDate now = LocalDate.now();
        int age = Period.between(dateOfBirth, now).getYears();
    }
	
	
}