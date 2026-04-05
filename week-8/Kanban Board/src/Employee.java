import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;

public class Employee
{
    private String name;
    private LocalDate startedWorkingAt;

    public Employee(String name, LocalDate startedWorkingAt)
    {
        this.name = name;
        this.startedWorkingAt = startedWorkingAt;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        if(name.isEmpty())
        {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        this.name = name;
    }

    public LocalDate getStartedWorkingAt()
    {
        return this.startedWorkingAt;
    }

    public void setStartedWorkingAt(LocalDate startedWorkingAt)
    {
        if(startedWorkingAt.isAfter(ChronoLocalDate.from(LocalDateTime.now())))
        {
            throw new IllegalArgumentException("Workdate invalid");
        }

        this.startedWorkingAt = startedWorkingAt;
    }

    public int getWorkingYears()
    {
        return (int) (ChronoUnit.YEARS.between(this.startedWorkingAt, LocalDateTime.now()));
    }
}
