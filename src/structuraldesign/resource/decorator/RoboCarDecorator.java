package structuraldesign.resource.decorator;
public abstract class RoboCarDecorator implements RoboCar{
    private final RoboCar car;
    public RoboCarDecorator(RoboCar roboCar){
        this.car = roboCar;
    }

    @Override
    public void accelerateAndCheckSpeed(int speed) {
        car.accelerateAndCheckSpeed(speed);
    }
}
