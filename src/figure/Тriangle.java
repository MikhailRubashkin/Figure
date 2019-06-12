package figure;

class Triangle extends Figure{

    private float width;
    private float height;

    public Triangle(String name, float width, float height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public Triangle(String name) {
        super(name);
    }

    @Override
    public float getPerimeter() {
        return width * 2 + height;
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
