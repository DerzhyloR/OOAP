package Lab2_1;

public class Plastic implements FacadeFactory{
    @Override
    public Facade solidFacade(double width, double height) {
        return new Solid(width,height,90,"Пластиковий");
    }

    @Override
    public Facade storeFrontFacade(double width, double height) {
        return new StoreFront(width,height,90,"Пластиковий");
    }
}
