package Lab2_1;

public class StoreFront implements Facade{
    private double width;
    private double height;
    private double price;
    private String material;

    public StoreFront(double width, double height, double price, String material){
        this.width=width;
        this.height=height;
        this.price=price;
        this.material=material;
    }

    @Override
    public String getTypeFacade() {
        return "Вітрина";
    }

    @Override
    public double getSize() {
        return width*height;
    }

    @Override
    public double getPrice() {
        return getSize()*price;
    }

    @Override
    public String getMaterial(){
        return material;
    }
}
