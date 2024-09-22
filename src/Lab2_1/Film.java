package Lab2_1;

public class Film implements FacadeFactory{
    @Override
    public Facade solidFacade(double width, double height) {
        return new Solid(width,height,50,"Плівковий");
    }

    @Override
    public Facade storeFrontFacade(double width, double height) {
        return new StoreFront(width,height,50,"Плівковий");
    }
}
