package ucu.edu.apps.flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ucu.edu.apps.flowerstore.delivery.DHLDeliveryStrategy;
import ucu.edu.apps.flowerstore.delivery.PostDeliveryStrategy;

import java.util.Collections;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeliveryTest {

    private DHLDeliveryStrategy dhlDeliveryStrategy;
    private PostDeliveryStrategy postDeliveryStrategy;

    @BeforeEach
    public void setup() {
        dhlDeliveryStrategy = new DHLDeliveryStrategy();
        postDeliveryStrategy = new PostDeliveryStrategy();
    }

    @Test
    public void testDHLDelivery() {
        String result = dhlDeliveryStrategy.deliver(Collections.emptyList());
        assertEquals("Delivering items by DHL", result);
    }

    @Test
    public void testPostDelivery() {
        String result = postDeliveryStrategy.deliver(Collections.emptyList());
        assertEquals("Delivering items by Post", result);
    }
}
