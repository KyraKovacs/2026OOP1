public class Seat
{
    private int seatNumber;
    private String description;
    private boolean additionalCharges;
    private int additionalChargeAmountInEurocents;
    private boolean reserved;

    public Seat(int seatNumber, String description)
    {
        this.seatNumber=seatNumber;
        this.description=description;
        this.additionalCharges=additionalCharges;
        this.additionalChargeAmountInEurocents=additionalChargeAmountInEurocents;
        this.reserved=reserved;
    }

    public int getSeatNumber()
    {
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

    public void setSeatNumber(int seatNumber)
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
        this.additionalChargeAmountInEurocents=additionalChargeAmountInEurocents;
    }

    public void setReserved(boolean reserved)
    {
        this.reserved=reserved;
    }
}
