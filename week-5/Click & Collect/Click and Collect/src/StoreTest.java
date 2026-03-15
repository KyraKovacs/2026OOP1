import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest
{

    @org.junit.jupiter.api.Test
    void removeOrderIfOlderThan14Days_age12days_noremoval()
    {
        Order order = new Order(1, LocalDate.now().minusDays(12), 2.50, 15.00, new ArrayList<>());

        int orderAge = order.getOrderTime();

        assertTrue(orderAge < 14);
    }

    @org.junit.jupiter.api.Test
    void getTotalValue_totalvalue25_shouldreturn25()
    {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Apple", 10.00));
        products.add(new Product("Bread", 12.50));

        Order order = new Order(1, LocalDate.now(), 2.50, 15.00, new ArrayList<>());
        order.setProducts(products);

        List<Order> orders = new ArrayList<>();
        orders.add(order);

        double totalValue = order.getTotalOrderPrice() + order.getORDER_SERVICE_CHARGE();

        assertEquals(25.0, totalValue);
    }

}