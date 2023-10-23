package entities;
import entities.enums.OrderStatus;
import java.time.LocalDate;
import java.util.List;

public class Order {
    private LocalDate moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> items;

    public void addItem (OrderItem item) {
        items.add(item);
    }

    public void removeItem (OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }
}
