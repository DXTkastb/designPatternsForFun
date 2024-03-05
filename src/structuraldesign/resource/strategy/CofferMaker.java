package structuraldesign.resource.strategy;

public class CofferMaker {
    public Coffee getCoffee(CoffeeMakingStrategy coffeeMakingStrategy) {
        return coffeeMakingStrategy.makeCoffee();
    }
}
