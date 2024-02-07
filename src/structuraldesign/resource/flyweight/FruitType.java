package structuraldesign.resource.flyweight;

public abstract class FruitType implements Fruit {

    public final String fruitGenus;
    public final double sourScale;

    public FruitType(String fruitGenus, double sourScale){
        this.fruitGenus = fruitGenus;
        this.sourScale = sourScale;
    }

    public void printFruitTypeDetails(){
        System.out.println("Fruit Type  :"+fruitGenus+"\nFruit sourScale    :"+sourScale);
    }

    @Override
    public double calculateCalories(double weight) {
        printFruitTypeDetails();
        return weight - weight*sourScale/100;
    }

}
