package structuraldesign.resource.decorator;

public class Car implements  RoboCar{
    @Override
    public void accelerateAndCheckSpeed(int speed) {
        System.out.println("speed of car is :" + speed);
    }
}
