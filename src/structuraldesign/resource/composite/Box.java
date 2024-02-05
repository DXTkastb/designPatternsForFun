package structuraldesign.resource.composite;

import java.util.ArrayList;
import java.util.List;

public class Box extends CommodityWrapper{

    private final List<Commodity> list = new ArrayList<>();
    private final int price;

    public Box(String name,int p){
        super(name);
        price = p;
    }

    @Override
    public int getPrice() {
        return price + getSubPrices();
    }

    private int getSubPrices() {
        int result = 0;
        for(Commodity commodity : list) result += commodity.getPrice();
        return result;
    }
    // This method might be used several times, so better return object, in order ot chain multiple adds
    public Box addItemToBox(Commodity commodityWrapper){
        list.add(commodityWrapper);
        return this;
    }

}
