import java.util.ArrayList;
import java.util.List;

public class Emergency
{
    private int priority;
    private boolean completed;
    private FireTruck fireTruck;
    private int fireFightersNeeded;

    public Emergency(int priority, boolean completed, FireTruck fireTruck, int fireFightersNeeded)
    {
        this.priority=priority;
        this.completed=false;
        this.fireTruck=fireTruck;
        this.fireFightersNeeded=fireFightersNeeded;

    }

    public int getPriority()
    {
        return this.priority;
    }

    public boolean isCompleted()
    {
        return this.completed;
    }

    public FireTruck getFireTruck()
    {
        return this.fireTruck;
    }

    public int getFireFightersNeeded()
    {
        return this.fireFightersNeeded;
    }

    public void setPriority(int priority)
    {
        this.priority=priority;
    }

    public void setCompleted(boolean completed)
    {
        this.completed=completed;
    }

    public void setFireTruck(FireTruck fireTruck)
    {
        this.fireTruck=fireTruck;
    }

    public void setFireFightersNeeded(int fireFightersNeeded)
    {
        this.fireFightersNeeded=fireFightersNeeded;
    }

    public int getWaterNeeded()
    {
        if(priority==6)
        {
            return 500;
        }

        else if(priority==5)
        {
            return 1000;
        }

        else if(priority < 5 && priority > 1)
        {
            return 5000;
        }

        else
        {
            return 10000;
        }
    }

    public void setAsCompleted()
    {
        this.completed=true;
    }

    public void getTruckNeededForEmergency(FireTruck fireTruck, List<FireFighter> firefighters)
    {
        if (fireTruck.getAssignedFireFighters().size() < this.fireFightersNeeded)
        {
            throw new IllegalArgumentException("Are we cooked chat?");
        }
        else
        {
            List<FireFighter> assigned=new ArrayList<>(firefighters.subList(0, this.fireFightersNeeded));
            for (FireFighter fireFighter : assigned)
            {
                fireTruck.addFireFighter(fireFighter);
            }
        }

        if (fireTruck.getCurrentWaterLevel() >= this.getWaterNeeded())
        {
            System.out.println("Truck has been assigned");
        }
        else
        {
            System.out.println("We are also cooked");
        }
    }
}
