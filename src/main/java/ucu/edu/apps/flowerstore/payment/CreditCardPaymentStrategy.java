package ucu.edu.apps.flowerstore.payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public String pay(double price) {
        return "Thank you for your order!";
    }
}
