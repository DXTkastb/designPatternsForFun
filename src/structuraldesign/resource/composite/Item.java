package structuraldesign.resource.composite;

public class Item  extends CommodityWrapper{
    private final int price;
    public Item(String name , int price) {
        super(name);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price + 5;
    }


}
