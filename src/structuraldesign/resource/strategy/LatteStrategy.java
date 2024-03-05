package structuraldesign.resource.strategy;

public class LatteStrategy implements CoffeeMakingStrategy{
    @Override
    public Coffee makeCoffee() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Roasting beans at 200C");
        System.out.println("Adding half cup milk.");
        System.out.println("Adding 1/4 cup of water");
        System.out.println("Mixing crushed beans with milk.");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        return new Latte();
    }
}
