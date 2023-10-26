package ucu.edu.apps.flowerstore;


public abstract class Item {
    public abstract double getPrice();
}

class FlowerBucket extends Item {
    private double price = 19.0;

    @Override
    public double getPrice() {
        return price;
    }
}

abstract class ItemDecorator extends Item {
    protected Item item;

    public ItemDecorator(Item item) {
        this.item = item;
    }

    @Override
    public abstract double getPrice();
}

class RibbonDecorator extends ItemDecorator {
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 7.0;
    }
}

class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 9.0;
    }
}
