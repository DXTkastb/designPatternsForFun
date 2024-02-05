package structuraldesign.resource.composite;

public class CompositePattern {
    public static void main(String[] args) {
        Box bigBox = new Box("box_A",10);
        Box smallBox = new Box("box_B",5);
        Commodity mobile = new Item("iphone",1000);
        Commodity charger = new Item("iphone_charger",10);
        Commodity simPin = new Item("iphone_simPin",10);
        bigBox.addItemToBox(mobile).addItemToBox(smallBox);
        smallBox.addItemToBox(charger).addItemToBox(simPin);

        System.out.println("smallBox cost :"+ smallBox.getPrice());
        System.out.println("bigBox cost :"+ bigBox.getPrice());

    }
}
