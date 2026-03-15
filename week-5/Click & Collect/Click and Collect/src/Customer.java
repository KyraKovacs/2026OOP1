import java.util.ArrayList;
import java.util.List;

public class Customer
{
    private String name;
    private String address;
    private String zipCode;
    private String city;
    private List<Order> orders;

    public Customer(String name, String address, String zipCode, String city, List<Order> orders)
    {
        this.name=name;
        this.address=address;
        this.zipCode=zipCode;
        this.city=city;
        this.orders=new ArrayList<>();
    }

    public String getName()
    {
        return this.name;
    }

    public String getAddress()
    {
        return this.address;
    }

    public String getZipCode()
    {
        return this.zipCode;
    }

    public String getCity()
    {
        return this.city;
    }

    public List<Order> getOrders()
    {
        return this.orders;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public void setAddress(String address)
    {
        this.address=address;
    }

    public void setZipCode(String zipCode)
    {
        this.zipCode=zipCode;
    }

    public void setCity(String city)
    {
        this.city=city;
    }

    public void setOrders(List<Order> orders)
    {
        this.orders=orders;
    }

    public void addOrder(Order order)
    {
        orders.add(order);
    }

    public void removeOrder(Order order)
    {
        orders.remove(order);
    }

    public void collectOrder(Order order)
    {
        order.setCollected(true);
    }
}
