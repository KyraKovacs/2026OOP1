import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FireDepartment
{
    private List<FireFighter> firefighters;
    private List<Emergency> emergencies;
    private List<FireTruck> firetrucks;

    public FireDepartment(List<FireFighter> firefighters, List<Emergency> emergencies, List<FireTruck> firetrucks)
    {
        this.firefighters=new ArrayList<>();
        this.emergencies=new ArrayList<>();
        this.firetrucks=new ArrayList<>();
    }

    public List<FireFighter> getFirefighters()
    {
        return this.firefighters;
    }

    public List<Emergency> getEmergencies()
    {
        return this.emergencies;
    }

    public List<FireTruck> getFiretrucks()
    {
        return this.firetrucks;
    }

    public void setFirefighters(List<FireFighter> firefighters)
    {
        this.firefighters=firefighters;
    }

    public void setEmergencies(List<Emergency> emergencies)
    {
        this.emergencies=emergencies;
    }

    public void setFiretrucks(List<FireTruck> firetrucks)
    {
        this.firetrucks=firetrucks;
    }

    public List<FireFighter> getPriority1FireFighters(List<FireFighter> firefighters)
    {
        List<FireFighter> priority1 = new ArrayList<>();

        for (FireFighter fireFighter : firefighters)
        {
            if(fireFighter.getYearsOfService() > 10)
            {
                priority1.add(fireFighter);
            }
        }

        return priority1;
    }

    public void returnFireTrucksAndFighters()
    {

    }
}
