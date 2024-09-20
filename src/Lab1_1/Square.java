package Lab1_1;

public class Square extends Figure {
    private double sideOfFigure;
    private double area;

    public Square(double side){
        super();
        this.sideOfFigure=side;
        this.area=0;
    }

    @Override
    public void areaOfTheFigure(){
        this.area=Math.pow(this.sideOfFigure,2);
    }

    @Override
    public void outputArea(){
        System.out.println("Площа квадрата = "+this.area+"\n");
    }

}
