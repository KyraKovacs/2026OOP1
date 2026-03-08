import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class NSGroup
{
    private List<Rental> rentals;

    public NSGroup()
    {
        this.rentals=new ArrayList<>();
    }

    public List<Rental> getRentals()
    {
        return this.rentals;
    }

    public void setRentals(List<Rental> rentals)
    {
        this.rentals=rentals;
    }

    public Customer getTopCustomer()
    {
        return rentals.stream()
                .map(Rental::getCustomer)
                .distinct()
                .max(Comparator.comparingDouble(Customer::getTotalAmountPaid))
                .orElse(null);
    }

    public double getTotalRevenue()
    {
        return rentals.stream()
                .mapToDouble(Rental::getTotalProfit)
                .sum();
    }
}
