package structuraldesign.resource.visitor;

public class Square implements Shape{
    private final double length;

    public double getLength() {
        return length;
    }

    public Square(double l){
        this.length = l;
    }

    @Override
    public String getName() {
        return "SQUARE";
    }

    @Override
    public double getVisitor(Visitor visitor) {
        return visitor.getArea(this);
    }
}
