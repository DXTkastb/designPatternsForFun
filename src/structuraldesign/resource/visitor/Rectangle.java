package structuraldesign.resource.visitor;

public class Rectangle implements Shape{
    private final double length;
    private final double width;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public Rectangle(double l, double w){
        this.length = l;
        this.width = w;
    }

    @Override
    public String getName() {
        return "RECTANGLE";
    }

    @Override
    public double getVisitor(Visitor visitor) {
        return visitor.getArea(this);
    }
}
