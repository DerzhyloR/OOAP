package Lab2_1;

public class Solid implements Facade{
    private double width;
    private double height;
    private double price;
    private String material;

    public Solid(double width, double height, double price, String material){
        this.width=width;
        this.height=height;
        this.price=price;
        this.material=material;
    }

    @Override
    public String getTypeFacade() {
        return "Суцільний";
    }

    @Override
    public double getSize() {
        return width*height;
    }

    @Override
    public double getPrice() {
        return getSize()*price;
    }
}
