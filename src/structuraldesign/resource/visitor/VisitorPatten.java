package structuraldesign.resource.visitor;

public class VisitorPatten {
    public static void main(String[] args) {
        Visitor visitor = new Visitor();
        VisitorImpl cube = new Cube(10);
        VisitorImpl square = new Square(5);
        VisitorImpl rect = new Rectangle(10,4);
        System.out.println(visitor.visit(cube));
        System.out.println(visitor.visit(square));
        System.out.println(visitor.visit(rect));
    }
}
