package figure;

public class Rhombus extends Figure {
    private float width;
    private float height;

    public Rhombus(String name, float width, float height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public float getPerimeter() {
        return width * 2 + height * 2;
    }

    @Override
    public float getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return super.toString()+ ", width=" + width +
                ", height=" + height;
    }
}
