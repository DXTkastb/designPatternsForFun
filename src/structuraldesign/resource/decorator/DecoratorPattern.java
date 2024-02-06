package structuraldesign.resource.decorator;

public class DecoratorPattern {
    public static void main(String[] args) {
        RoboCarDecorator roboCarDecorator = new EnableNitroDecorator(new UseWinterTireDecorator(new Car()));
       // RoboCarDecorator roboCarDecorator = new EnableNitroDecorator((new Car()));
        roboCarDecorator.accelerateAndCheckSpeed(20);
    }
}
