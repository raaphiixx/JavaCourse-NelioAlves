package exerciceClass152.entites;

import examples.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;

    private Client client;
    public List<OrderItem> orders = new ArrayList<>();

    DateTimeFormatter orderDate = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Order() {
    }

    public Order(OrderStatus status, Client client) {
        this.moment = LocalDateTime.now();
        this.status = status;
        this.client = client;
    }

    public String getMoment() {
        return moment.format(orderDate);
    }


    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getOrders() {
        return orders;
    }

    public void addItem(OrderItem order) {
        orders.add(order);
    }
    public void removeItem(OrderItem order) {
        orders.add(order);
    }

    public Double total() {
        double sum = 0;
        for (OrderItem oI: orders) {
            sum += oI.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ").append(getMoment()).append("\n");
        sb.append("Order Status: ").append(this.status).append("\n");
        sb.append("Client: ").append(client.getName());
        sb.append(" (").append(client.getBirthDate()).append(") - ");
        sb.append(client.getEmail()).append("\n");
        sb.append("Order Items: ").append("\n");
        for (OrderItem item: orders) {
            sb.append(item.getProduct());
            sb.append(", Quantity: ").append(item.getQuantity());
            sb.append(", SubTotal: ").append(item.subTotal()).append("\n");
        }
        sb.append("Total Price: $").append(total());
        return sb.toString();
    }
}
