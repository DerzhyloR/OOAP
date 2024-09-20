package Lab1_1;

public class Main {
    public static void main(String [] args){
        Figure square= new Square(12);
        square.areaOfTheFigure();
        square.outputArea();
        Figure rectangle= new Rectangle(5,10);
        rectangle.areaOfTheFigure();
        rectangle.outputArea();
        Figure circle= new Circle(8);
        circle.areaOfTheFigure();
        circle.outputArea();
    }
}
