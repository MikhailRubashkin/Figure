package figure;

//Создать иерархию классов, описывающих геометрические фигуры на плоскости.

import static java.lang.Math.pow;

public class Circle extends Figure {

    private float radius;

    public Circle(String name, float radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public float getPerimeter() {
        return (float) (3.14 * pow(radius, 2));
    }

    @Override
    public float getArea() {
        return (float) (2 * 3.14 * pow(radius, 2));
    }

    @Override
    public String toString() {
        return super.toString() + ", radius=" + radius;
    }
}
