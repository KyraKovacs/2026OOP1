import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Customer
{
    private String name;
    private LocalDate dateOfBirth;
    private List<Rental> rentals;

    public Customer(String name, LocalDate dateOfBirth)
    {
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.rentals=new ArrayList<>();
    }

    public String getName()
    {
        return this.name;
    }

    public LocalDate getDateOfBirth()
    {
        return this.dateOfBirth;
    }
    public List<Rental> getRentals()
    {
        return this.rentals;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setDateOfBirth(LocalDate dateOfBirth)
    {
        this.dateOfBirth=dateOfBirth;
    }

    public void setRentals(List<Rental> rentals)
    {
        this.rentals=rentals;
    }

    public boolean ifAbove16()
    {
        int age = Period.between(this.dateOfBirth, LocalDate.now()).getYears();
        if(16<age)
        {
            return true;
        }

        else
        {
            return false;
        }
    }

    public double getTotalAmountPaid()
    {
        return rentals.stream()
                .mapToDouble(Rental::getTotalProfit)
                .sum();
    }
}
