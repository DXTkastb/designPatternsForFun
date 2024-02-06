package structuraldesign.resource.decorator;

public class EnableNitroDecorator extends RoboCarDecorator{
    public EnableNitroDecorator(RoboCar roboCar) {
        super(roboCar);
    }

    @Override
    public void accelerateAndCheckSpeed(int speed) {
        speed *= 2;
        super.accelerateAndCheckSpeed(speed);
    }
}
