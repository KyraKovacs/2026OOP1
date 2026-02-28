public class LicensePlate
{
	private String number;
	
	public LicensePlate(String number)
	{
		this.number.number;
	}
	
	public String getNumber()
	{
		return this.number;
	}
	
	public void setNumber(String number)
	{
		this.number=number;
	}
	
	public static boolean isValid()
	{
		String plateWithoutHyphens=licensePlate.replace("-", "");

		if (plateWithoutHyphens.length()==6) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
}