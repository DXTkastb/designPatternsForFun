package structuraldesign.resource.visitor;

public class Visitor {
    // driving method!
    public double visit(VisitorImpl vs) {
        return vs.getVisitor(this);
    }

    public double getArea(Rectangle rect){
        return rect.getLength() * rect.getWidth();
    }
    public double getArea(Square sqr){
        return sqr.getLength() * sqr.getLength();
    }

    public double getVolume(Cube cube) {
        return Math.pow(cube.getSide(),3);
    }

//    public double getVolume(Sphere spr){
//        return (4*22*spr.r*spr.r*spr.r)/21;
//    }

}
