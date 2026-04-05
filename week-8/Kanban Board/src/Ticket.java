public class Ticket
{
    private int MIN_PRIORITY = 1;
    private int MAX_PRIORITY = 5;
    private String description;
    private int yearsOfExperienceRequired;
    private int priority;
    private int estimatedTimeToCompletionInHours;
    private Employee employee;

    public Ticket(String description, int yearsOfExperienceRequired, int priority, int estimatedTimeToCompletionInHours)
    {
        this.description = description;
        this.yearsOfExperienceRequired = yearsOfExperienceRequired;
        this.priority = priority;
        this.estimatedTimeToCompletionInHours = estimatedTimeToCompletionInHours;
    }

    public int getMIN_PRIORITY()
    {
        return this.MIN_PRIORITY;
    }

    public void setMIN_PRIORITY(int MIN_PRIORITY)
    {
        this.MIN_PRIORITY = MIN_PRIORITY;
    }

    public int getMAX_PRIORITY()
    {
        return this.MAX_PRIORITY;
    }

    public void setMAX_PRIORITY(int MAX_PRIORITY)
    {
        this.MAX_PRIORITY = MAX_PRIORITY;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getYearsOfExperienceRequired()
    {
        return this.yearsOfExperienceRequired;
    }

    public void setYearsOfExperienceRequired(int yearsOfExperienceRequired)
    {
        this.yearsOfExperienceRequired = yearsOfExperienceRequired;
    }

    public int getPriority()
    {
        return this.priority;
    }

    public void setPriority(int priority)
    {
        this.priority = priority;
    }

    public int getEstimatedTimeToCompletionInHours()
    {
        return this.estimatedTimeToCompletionInHours;
    }

    public void setEstimatedTimeToCompletionInHours(int estimatedTimeToCompletionInHours)
    {
        this.estimatedTimeToCompletionInHours = estimatedTimeToCompletionInHours;
    }

    public Employee getEmployee()
    {
        return this.employee;
    }

    public void setEmployee(Employee employee)
    {
        this.employee = employee;
    }
}
