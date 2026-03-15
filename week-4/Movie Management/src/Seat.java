public class Seat
{
    private String seatNumber;
    private String description;
    private boolean additionalCharges;
    private int additionalChargeAmountInEurocents;
    private boolean reserved;

    public Seat(String seatNumber, String description, boolean additionalCharges, int additionalChargeAmountInEurocents)
    {
        this.seatNumber=seatNumber;
        this.description=description;
        this.additionalCharges=additionalCharges;
        this.additionalChargeAmountInEurocents=additionalChargeAmountInEurocents;
        this.reserved=false;
    }

    public String getSeatNumber()
    {
        if(!Iamwaytoolazytodothis)
        {
            throw new IllegalArgumentException("Seat Number Invalid")
        }

        return this.seatNumber;
    }

    public String getDescription()
    {
        return this.description;
    }

    public boolean isAdditionalCharges()
    {
        return this.additionalCharges;
    }

    public int getAdditionalChargeAmountInEurocents()
    {
        return this.additionalChargeAmountInEurocents;
    }

    public boolean isReserved()
    {
        return this.reserved;
    }

    public void setSeatNumber(String seatNumber)
    {
        this.seatNumber=seatNumber;
    }

    public void setDescription(String description)
    {
        this.description=description;
    }

    public void setAdditionalCharges(boolean additionalCharges)
    {
        this.additionalCharges=additionalCharges;
    }

    public void setAdditionalChargeAmountInEurocents(int additionalChargeAmountInEurocents)
    {
        if(additionalChargeAmountInEurocents<0)
        {
            throw new IllegalArgumentException("Price can not be negative");
        }

        this.additionalChargeAmountInEurocents=additionalChargeAmountInEurocents;
    }

    public void setReserved(boolean reserved)
    {
        this.reserved=reserved;
    }
}
