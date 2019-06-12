package figure;

public abstract class Figure {

    private String name;

    public Figure(String name) {
        this.name = name;
    }


    public abstract float getPerimeter();


    public abstract float getArea();

    public void info() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "name = " + name
                + ", perimeter = " + getPerimeter()
                + ", area = " + getArea();
    }
}
