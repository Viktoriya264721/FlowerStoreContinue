package ucu.edu.apps.flowerstore.payment;

public class PayPallPaymentStrategy implements Payment{
    @Override
    public String pay(double price) {
        return "You are COOL";
    }
}
