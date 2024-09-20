package Lab1_1;

abstract class Figure {
    public Figure(){
        System.out.println("Об'єкт створено!");
    }

    public abstract void areaOfTheFigure();

    public abstract void outputArea();
}
