package edu.eci.cvds.patterns.shapes;

public class ShapeFactory {
    public static Shape create(RegularShapeType type) {
        switch (type) {
            case Triangle:
                return new edu.eci.cvds.patterns.shapes.concrete.Triangle();
            case Quadrilateral:
                return new edu.eci.cvds.patterns.shapes.concrete.Quadrilateral();
            case Pentagon:
                return new edu.eci.cvds.patterns.shapes.concrete.Pentagon();
            case Hexagon:
                return new edu.eci.cvds.patterns.shapes.concrete.Hexagon();
            default:
                throw new IllegalArgumentException();
        }
    }
}
