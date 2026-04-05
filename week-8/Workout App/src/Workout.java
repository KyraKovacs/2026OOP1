import java.util.List;

public class Workout
{
    private int MIN_DIFFICULTY = 0;
    private int MAX_DIFFICULTY = 5;
    private String name;
    private double difficulty;
    private List<Activity> activities;

    public Workout(String name, double difficulty)
    {
        this.name = name;
        this.difficulty = difficulty;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getDifficulty()
    {
        return this.difficulty;
    }

    public void setDifficulty(double difficulty)
    {
        this.difficulty = difficulty;
    }

    public List<Activity> getActivities()
    {
        return this.activities;
    }

    public void setActivities(List<Activity> activities)
    {
        this.activities = activities;
    }

    public int getMIN_DIFFICULTY()
    {
        return this.MIN_DIFFICULTY;
    }

    public void setMIN_DIFFICULTY(int MIN_DIFFICULTY)
    {
        this.MIN_DIFFICULTY = MIN_DIFFICULTY;
    }

    public int getMAX_DIFFICULTY()
    {
        return this.MAX_DIFFICULTY;
    }

    public void setMAX_DIFFICULTY(int MAX_DIFFICULTY)
    {
        this.MAX_DIFFICULTY = MAX_DIFFICULTY;
    }

    public int getTotalDuration()
    {
        int total = 0;

        for (Activity activity : activities) {
            total += activity.getEndTime();
        }

        return total;
    }

    public void addActivity(Activity activity)
    {
        this.activities.add(activity);
    }

    public String getWorkoutDescription()
    {
        return this.name;
    }
}
