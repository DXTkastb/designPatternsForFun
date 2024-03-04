package structuraldesign.resource.visitor;

public class Cube implements Solid{
    private final double side;
    public Cube(double s){this.side = s;}
    @Override
    public String getName() {
        return "CUBE";
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getVisitor(Visitor visitor) {
        return visitor.getVolume(this);
    }
}
