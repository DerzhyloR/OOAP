package Lab2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static Scanner scanner= new Scanner(System.in);
    private static Director director= new Director();
    private static double priceLollipops=0;
    private static double priceChocolates=0;
    private static double priceWaffles=0;
    private static double priceDragee=0;

    public static void main(String [] args){
        priceLollipops=getData("Ціна за кг льодяників:  ");
        priceChocolates=getData("Ціна за кг шоколадних цукерок:  ");
        priceWaffles=getData("Ціна за кг вафлів:  ");
        priceDragee=getData("Ціна за кг драже:  ");
    }


    public static void packingLasunka(){
        GiftSetBuilder gift=new LasunkaEconomy();
        director.setBuilder(gift);
        GiftSet lasunka=director.buildGift(priceLollipops,priceChocolates,priceWaffles,priceDragee);
        lasunka.outputInfo();
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
