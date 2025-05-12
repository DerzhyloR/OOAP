package Lab10;

public class StandardHouse extends Building{
    @Override
    protected void buildAnotherComponent() {
        System.out.println("Без додаткових деталей");
    }
}
