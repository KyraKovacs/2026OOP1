public class Activity
{
    private String description;
    private int timeInSeconds;
    private int startTime;

    public Activity(String description, int timeInSeconds, int startTime)
    {
        this.description = description;
        this.timeInSeconds = timeInSeconds;
        this.startTime = startTime;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        if(description.isEmpty())
        {
            throw new IllegalArgumentException("Description cannot be empty");
        }

        this.description = description;
    }

    public int getTimeInSeconds()
    {
        return this.timeInSeconds;
    }

    public void setTimeInSeconds(int timeInSeconds)
    {
        if(timeInSeconds <= 0)
        {
            throw new IllegalArgumentException("Time cannot be 0 or negative");
        }

        this.timeInSeconds = timeInSeconds;
    }

    public int getStartTime()
    {
        return this.startTime;
    }

    public void setStartTime(int startTime)
    {
        if(startTime <= 0)
        {
            throw new IllegalArgumentException("Start time cannot be negative or 0");
        }

        this.startTime = startTime;
    }

    public int getEndTime()
    {
        return (int) (this.getStartTime() + this.getTimeInSeconds());
    }
}
