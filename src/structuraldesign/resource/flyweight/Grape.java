package structuraldesign.resource.flyweight;

public class Grape implements Fruit{
    public final FruitType fruitType;
    public final String color;

    public Grape(FruitType fruitType, String color) {
        this.fruitType = fruitType;
        this.color = color;
    }

    @Override
    public double calculateCalories(double weight) {
        return fruitType.calculateCalories(weight);
    }
}
