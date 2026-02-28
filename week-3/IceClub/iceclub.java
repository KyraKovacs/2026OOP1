import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;

public class IceClub
{
	private List<Membership> memberships;
	
	public IceClub()
	{
		this.memberships=new ArrayList<>();
	}
	
	public List<Membership> getMemberships()
	{
		return this.memberships;
	}
	
	public void setMemberships(List<Membership> memberships)
	{
		this.memberships=memberships;
	}
	
	public static int getNumberOfMemberships(List<Membership> memberships)
	{
		return this.licenses.size();
	}
	
	public static Person findOldestMembershipHolder(String firstName, String lastName, LocalDate dateOfBirth)
	{
		if (dateOfBirth == null || dateOfBirth.isEmpty()) 
		{
        return null;
		}
		return dateOfBirth.stream()
		  .map(dateOfBirth::getDate)
		  .max(Date::compareTo)
		  .get();
	}
	
	public static Person findYoungestMembershipHolder(String firstName, String lastName, LocalDate dateOfBirth)
	{
		if (dateOfBirth == null || dateOfBirth.isEmpty()) 
		{
        return null;
		}
		return dateOfBirth.stream()
		  .map(dateOfBirth::getDate)
		  .min(Date::compareTo)
		  .get();
	}
	
	public static Membership findLongestRunningMembership()
	{
		if (dayOfRegistration == null || dayOfRegistration.isEmpty()) 
		{
        return null;
		}
		return dayOfRegistration.stream()
		  .map(dayOfRegistration::getDate)
		  .max(Date::compareTo)
		  .get();
	}
}