package structuraldesign.resource.flyweight;

public class FlyweightPattern {
    public static void main(String[] args) {
        Fruit orange = new Orange(new CitrusFruitType("citrus",40.0),"orange");
        Fruit grape = new Grape(new CitrusFruitType("berry",10.0),"green");
        System.out.println(orange.calculateCalories(100));
        System.out.println(grape.calculateCalories(100));;
    }
}
