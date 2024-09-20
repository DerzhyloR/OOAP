package Lab1_1;

public class Rectangle extends Figure {
    private double length;
    private double width;
    private double area;

    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
        this.area=0;
    }

    @Override
    public void areaOfTheFigure(){
        this.area=this.length*this.width;
    }

    @Override
    public void outputArea(){
        System.out.println("Площа прямокутника = "+this.area+"\n");
    }
}
