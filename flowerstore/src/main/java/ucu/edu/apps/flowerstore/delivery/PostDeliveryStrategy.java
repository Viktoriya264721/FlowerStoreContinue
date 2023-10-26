package ucu.edu.apps.flowerstore.delivery;

import java.util.List;

import ucu.edu.apps.flowerstore.Item;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public String deliver(List<Item> items) {
        return "Delivering items by Post";
    } 
}
