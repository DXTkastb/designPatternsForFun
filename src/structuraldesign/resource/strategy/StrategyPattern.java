package structuraldesign.resource.strategy;

public class StrategyPattern {
    public static void main(String[] args) {
        CofferMaker cofferMaker = new CofferMaker();
        CoffeeMakingStrategy latteSt = new LatteStrategy();
        CoffeeMakingStrategy espressoSt = new EspressoStrategy();
        Coffee latte = cofferMaker.getCoffee(latteSt);
        Coffee espresso = cofferMaker.getCoffee(espressoSt);
        latte.printCoffeeType();
        espresso.printCoffeeType();
    }
}
