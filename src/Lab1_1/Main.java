package Lab1_1;

import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    public static void main(String [] args){
        double sideSquare=getDataDouble("Введіть сторону квадрата: ");
        Figure square= new Square(sideSquare);
        square.areaOfTheFigure();
        square.outputArea();
        double length=getDataDouble("Введіть довжину прямокутника: ");
        double width=getDataDouble("Введіть ширину прямокутника: ");
        Figure rectangle= new Rectangle(length,width);
        rectangle.areaOfTheFigure();
        rectangle.outputArea();
        double radius=getDataDouble("Введіть радіус круга: ");
        Figure circle= new Circle(radius);
        circle.areaOfTheFigure();
        circle.outputArea();
    }

    public static double getDataDouble(String txt){
        while (true){
            try {
                System.out.println(txt);
                double chyslo=scanner.nextDouble();
                scanner.nextLine();
                if(chyslo>0){
                    return chyslo;
                }
                else{
                    System.out.println("ПОМИЛКА ВВОДУ! Повторіть спробу");
                }
            }catch (Exception e){
                System.out.println("ПОМИЛКА ВВОДУ! Повторіть спробу");
                scanner.next();
            }
        }
    }
}
