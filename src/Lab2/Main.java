package Lab2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner scanner= new Scanner(System.in);

    public static void main(String [] args){
        double priceLollipops=getData("Ціна за кг льодяників:  ");
        double priceChocolates=getData("Ціна за кг шоколадних цукерок:  ");
        double priceWaffles=getData("Ціна за кг вафлів:  ");
        double priceDragee=getData("Ціна за кг драже:  ");
    }

    public static double getData(String txt){
        while (true){
            try {
                System.out.println(txt);
                return scanner.nextDouble();
            }catch (Exception e){
                System.out.println("ПОМИЛКА ВВОДУ! Повторіть спробу");
                scanner.next();
            }
        }
    }
}
