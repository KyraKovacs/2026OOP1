import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Order
{
    private int orderID;
    private LocalDate orderDate;
    private double ORDER_SERVICE_CHARGE;
    private double ORDER_MIN_AMOUNT;
    private List<Product> products;
    private boolean collected;

    public Order(int orderID, LocalDate orderDate, double ORDER_SERVICE_CHARGE, double ORDER_MIN_AMOUNT, List<Product> products)
    {
        this.orderID=orderID;
        this.orderDate=orderDate;
        this.ORDER_SERVICE_CHARGE=2.50;
        this.ORDER_MIN_AMOUNT=15.00;
        this.products=new ArrayList<>();
        this.collected=false;
    }

    public int getOrderID()
    {
        return this.orderID;
    }

    public LocalDate getOrderDate()
    {
        return this.orderDate;
    }

    public double getORDER_SERVICE_CHARGE()
    {
        return this.ORDER_SERVICE_CHARGE;
    }

    public double getORDER_MIN_AMOUNT()
    {
        return this.ORDER_MIN_AMOUNT;
    }

    public List<Product> getProducts()
    {
        return this.products;
    }

    public boolean getCollected()
    {
        return this.collected;
    }

    public void setOrderID(int orderID)
    {
        this.orderID=orderID;
    }

    public void setOrderDate(LocalDate orderDate)
    {
        this.orderDate=orderDate;
    }

    public void setORDER_SERVICE_CHARGE(double ORDER_SERVICE_CHARGE)
    {
        this.ORDER_SERVICE_CHARGE=ORDER_SERVICE_CHARGE;
    }

    public void setORDER_MIN_AMOUNT(double ORDER_MIN_AMOUNT)
    {
        this.ORDER_MIN_AMOUNT=ORDER_MIN_AMOUNT;
    }

    public void setProducts(List<Product> products)
    {
        this.products=products;
    }

    public void setCollected(boolean collected)
    {
        this.collected=collected;
    }

    public double getTotalOrderPrice()
    {
        double sum = 0.0;

        for (Product product : this.products) {
            sum += product.getPrice();
        }

        return sum;
    }

    public boolean isMinimumAmount()
    {
        if(getTotalOrderPrice()<ORDER_MIN_AMOUNT)
        {
            return false;
        }

        else
        {
            return true;
        }
    }

    public int getOrderTime()
    {
        LocalDate orderDate = this.orderDate;
        LocalDate now = LocalDate.now();
        int days = Period.between(orderDate, now).getDays();

        return days;
    }
}
