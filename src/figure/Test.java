package figure;



public class Test {


     static Object Circle;
     static Object Rectangle;

    public static void main(String[] args) {
        Figure [] figures = new Figure[] {
                new Rectangle("rectangle", 10, 20),
                new Circle("circle", 10),
                new Square("square", 5, 15),
                new Triangle ("triangle", 3, 2),
                new Rhombus("rombus",10,10),
                new Square.Hexagon ("hexagon",2,2),
                new Square.Hexagon.Тrapeze("trapeze", 2,3)};
        ShapeUils s = new ShapeUils();
        System.out.println(ShapeUils.isRectangleа (figures[0]));
        for (Figure figure : figures) {
           figure.info();
        }

    }


}
