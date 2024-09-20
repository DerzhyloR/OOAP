package Lab1_1;

public class Circle extends Figure{
    private double radius;
    private double area;

    public Circle(double radius){
        this.radius=radius;
        this.area=0;
    }

    @Override
    public void areaOfTheFigure(){
        this.area=Math.PI*Math.pow(radius,2);
    }

    @Override
    public void outputArea(){
        System.out.println("Площа круга: "+this.area+"\n");
    }
}
