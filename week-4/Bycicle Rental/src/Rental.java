import java.time.Duration;
import java.time.LocalTime;
import java.util.stream.IntStream;

public class Rental
{
    private LocalTime startTime;
    private LocalTime endTime;
    private int kilometersCycled;
    private double PRICE_PER_KILOMETER;
    private double PRICE_PER_HOUR;
    private Customer customer;
    private Bicycle bicycle;

    public Rental(LocalTime startTime, LocalTime endTime)
    {
        this.startTime=startTime;
        this.endTime=endTime;
        this.kilometersCycled=kilometersCycled;
        this.PRICE_PER_KILOMETER=0.20;
        this.PRICE_PER_HOUR=2.00;
        this.customer=customer;
        this.bicycle = bicycle;
    }

    public LocalTime getStartTime()
    {
        return this.startTime;
    }

    public LocalTime getEndTime()
    {
        return this.endTime;
    }

    public int getKilometersCycled()
    {
        return this.kilometersCycled;
    }

    public double getPRICE_PER_KILOMETER()
    {
        return this.PRICE_PER_KILOMETER;
    }

    public double getPRICE_PER_HOUR()
    {
        return this.PRICE_PER_HOUR;
    }

    public Customer getCustomer()
    {
        return this.customer;
    }

    public Bicycle getBycicle()
    {
        return this.bicycle;
    }

    public void setStartTime(LocalTime startTime)
    {
        this.startTime=startTime;
    }

    public void setEndTime(LocalTime endTime)
    {
        this.endTime=endTime;
    }

    public void setKilometersCycled(int kilometersCycled)
    {
        this.kilometersCycled=kilometersCycled;
    }

    public void setPRICE_PER_KILOMETER(double PRICE_PER_KILOMETER)
    {
        this.PRICE_PER_KILOMETER=PRICE_PER_KILOMETER;
    }

    public void setPRICE_PER_HOUR(double PRICE_PER_HOUR)
    {
        this.PRICE_PER_HOUR=PRICE_PER_HOUR;
    }

    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }

    public void setBycicle(Bicycle bicycle)
    {
        this.bicycle = bicycle;
    }

    public boolean if30MinFree()
    {
        if(kilometersCycled<50)
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    public static Duration getRentalTime(LocalTime startTime, LocalTime endTime) {
        return Duration.between(startTime, endTime);
    }

   public double getProfitPerKilometer()
   {
       return (double) (PRICE_PER_KILOMETER * kilometersCycled);
   }

   public double getProfitPerHour(Duration getRentalTime)
   {
       Duration rentalTime = getRentalTime(startTime, endTime);
       long minutes = rentalTime.toMinutes();

       if(if30MinFree() == true)
       {
           return (double) (((minutes-30)/60)*PRICE_PER_HOUR);
       }

       else
       {
           return (double) ((minutes/60)*PRICE_PER_HOUR);
       }
   }


    public double getTotalProfit(double getProfitPerHour, double getProfitPerKilometer)
    {
       return (double) (getProfitPerHour+getProfitPerKilometer);
    }
}
