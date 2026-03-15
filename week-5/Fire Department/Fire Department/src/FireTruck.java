import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class FireTruck
{
    private int maximumWaterCapacity;
    private int currentWaterLevel;
    private List<FireFighter> assignedFireFighters;

    public FireTruck(int maximumWaterCapacity, int currentWaterLevel, List<FireFighter> assignedFireFighters)
    {
        this.maximumWaterCapacity=maximumWaterCapacity;
        this.currentWaterLevel=currentWaterLevel;
        this.assignedFireFighters=new ArrayList<>();
    }

    public int getMaximumWaterCapacity()
    {
        return this.maximumWaterCapacity;
    }

    public int getCurrentWaterLevel()
    {
        return this.currentWaterLevel;
    }

    public List<FireFighter> getAssignedFireFighters()
    {
        return this.assignedFireFighters;
    }

    public void setMaximumWaterCapacity(int maximumWaterCapacity)
    {
        this.maximumWaterCapacity=maximumWaterCapacity;
    }

    public void setCurrentWaterLevel(int currentWaterLevel)
    {
        this.currentWaterLevel=currentWaterLevel;
    }

    public void setAssignedFireFighters(List<FireFighter> assignedFireFighters)
    {
        this.assignedFireFighters=assignedFireFighters;
    }

    public void addFireFighter(FireFighter fireFighter)
    {
        assignedFireFighters.add(fireFighter);
    }

    public void removeFireFighter(FireFighter fireFighter)
    {
        assignedFireFighters.remove(fireFighter);
    }
}
