package structuraldesign.resource.strategy;

public class Latte implements Coffee{
    @Override
    public void printCoffeeType() {
        System.out.println("LATTE READY!");
    }
}
