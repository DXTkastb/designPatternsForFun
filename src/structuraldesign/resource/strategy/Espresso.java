package structuraldesign.resource.strategy;

public class Espresso implements Coffee{
    @Override
    public void printCoffeeType() {
        System.out.println("ESPRESSO READY!");
    }
}
