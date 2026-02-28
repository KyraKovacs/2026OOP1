import java.time.LocalDate;
import java.time.Period;

public class Person
{
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;

	public Person(String firstName, String lastName, LocalDate dateOfBirth)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.dateOfBirth=dateOfBirth;
	}

	public String getFirstName()
	{
		return this.firstName;
	}
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public LocalDate getDateOfBirth()
	{
		return this.dateOfBirth;
	}
	
	public void setDateOfBirth(LocalDate dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}
	
	public static void Person(String[] args) {
        LocalDate dateOfBirth = LocalDate.of(1995, 3, 10);
		LocalDate now = LocalDate.now();
        int age = Period.between(dateOfBirth, now).getYears();
    }
	
	
}