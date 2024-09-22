package Lab2_1;

public class Painted implements FacadeFactory{
    @Override
    public Facade solidFacade(double width, double height) {
        return new Solid(width,height,120,"Фарбований");
    }

    @Override
    public Facade storeFrontFacade(double width, double height) {
        return new StoreFront(width,height,120,"Фарбований");
    }
}
