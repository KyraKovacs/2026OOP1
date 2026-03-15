import java.util.List;

public class Store
{
    private List<Order> orders;

    public Store(List<Order> orders)
    {
        this.orders=orders;
    }

    public List<Order> getOrders()
    {
        return this.orders;
    }

    public void setOrders(List<Order> orders)
    {
        this.orders=orders;
    }

    public Order removeOrderHasBeenPickedUp(int orderID, Customer customer)
    {
        for (Order order : orders)
        {
            if (order.getOrderID() == orderID && customer.getOrders().contains(order))
            {
                if (order.getCollected() == true)
                {
                    orders.remove(order);
                    return order;
                }
            }
        }

        return null;
    }

    public void removeOrderIfOlderThan14Days(Order order)
    {
        if (order.getOrderTime() > 14)
        {
            orders.remove(order);
        }
    }

    public double getTotalValue(List<Order> orders)
    {
        double sum = 0.0;

        for (Order order : orders) {
            sum += order.getTotalOrderPrice() + order.getORDER_SERVICE_CHARGE();
        }

        return sum;
    }

    public void removeOrderIsNotMinAmount(Order order)
    {
        if(order.isMinimumAmount()==false)
        {
            orders.remove(order);
        }
    }
}
