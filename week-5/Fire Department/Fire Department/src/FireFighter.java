import java.time.LocalDate;
import java.time.Period;

public class FireFighter
{
    private String name;
    private LocalDate dateEnteredService;

    public FireFighter(String name, LocalDate dateEnteredService)
    {
        this.name=name;
        this.dateEnteredService=dateEnteredService;
    }

    public String getName()
    {
        return this.name;
    }

    public LocalDate getDateEnteredService()
    {
        return this.dateEnteredService;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setDateEnteredService(LocalDate dateEnteredService)
    {
        this.dateEnteredService=dateEnteredService;
    }

    public int getYearsOfService()
    {
        LocalDate dateEnteredService = LocalDate.of(1990, 1, 20);
        LocalDate now = LocalDate.now();
        int years = Period.between(dateEnteredService, now).getYears();

        return years;
    }
}
