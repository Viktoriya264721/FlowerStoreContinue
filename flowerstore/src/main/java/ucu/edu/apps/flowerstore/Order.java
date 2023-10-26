package ucu.edu.apps.flowerstore;
import ucu.edu.apps.flowerstore.delivery.Delivery;
import ucu.edu.apps.flowerstore.payment.Payment;
import java.util.LinkedList;

public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public Order() {
        items = new LinkedList<>();
    }

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void processOrder() {
        if (payment != null) {
            payment.pay(calculateTotalPrice());
        } else {
            System.out.println("(((");
        }

        if (delivery != null) {
            delivery.deliver(items);
        } else {
            System.out.println("=(");
        }
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }
}
