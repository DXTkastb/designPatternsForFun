package structuraldesign.resource.flyweight;

public class Orange implements Fruit {
    public final FruitType fruitType;
    public final String color;

    public Orange(FruitType fruitType, String color) {
        this.fruitType = fruitType;
        this.color = color;
    }

    @Override
    public double calculateCalories(double weight) {
        return fruitType.calculateCalories(weight);
    }
}
