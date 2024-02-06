package structuraldesign.resource.decorator;

public class UseWinterTireDecorator extends RoboCarDecorator{
    public UseWinterTireDecorator(RoboCar roboCar) {
        super(roboCar);
    }

    @Override
    public void accelerateAndCheckSpeed(int speed) {
        speed = Math.max(0,speed-15);
        super.accelerateAndCheckSpeed(speed);
    }
}
