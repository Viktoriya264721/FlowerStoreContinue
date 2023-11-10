package ucu.edu.apps.flowerstore;

import org.junit.jupiter.api.Test;

import ucu.edu.apps.flowerstore.payment.CreditCardPaymentStrategy;
import ucu.edu.apps.flowerstore.payment.PayPallPaymentStrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentTest {

    @Test
    public void testCreditCardPayment() {
        CreditCardPaymentStrategy payment = new CreditCardPaymentStrategy();
        String result = payment.pay(100.5);
        assertEquals("Thank you for your order!", result);
    }

    @Test
    public void testPayPallPayment() {
        PayPallPaymentStrategy payment = new PayPallPaymentStrategy();
        String result = payment.pay(150.75);
        assertEquals("You are COOL", result);
    }
}
