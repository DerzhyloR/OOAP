package Lab2;

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
        while (true){
            packing();
            if(!isContinuePacking()){
                break;
            }
        }
    }

    public static void packingLasunka(){
        GiftSetBuilder gift=new LasunkaEconomy();
        director.setBuilder(gift);
        GiftSet lasunka=director.buildGift(priceLollipops,priceChocolates,priceWaffles,priceDragee);
        lasunka.outputInfo();
    }

    public static void packingNaminaiko(){
        GiftSetBuilder gift=new NaminaikoStandart();
        director.setBuilder(gift);
        GiftSet naminaiko=director.buildGift(priceLollipops,priceChocolates,priceWaffles,priceDragee);
        naminaiko.outputInfo();
    }

    public static void packingPanKotsky(){
        GiftSetBuilder gift=new PanKotskyExtra();
        director.setBuilder(gift);
        GiftSet panKotsky=director.buildGift(priceLollipops,priceChocolates,priceWaffles,priceDragee);
        panKotsky.outputInfo();
    }

    public static void packing(){
        int number=0;
        while (true) {
            try {
                System.out.println("\nВиберіть набір для пакування:\n1.Економічний «Ласунка»\n2.Стандартний «Наминайко»\n" +
                        "3.Екстра «Пан Коцький»\nВаш вибір: ");
                number=scanner.nextInt();
                if(!startPacking(number)){
                    break;
                }
            }catch (Exception e){
                System.out.println("Помилка вводу! Повторіть спробу:");
                scanner.next();
            }
        }
    }

    public static boolean startPacking(int enteredNumber){
        boolean isMistake=false;
        switch (enteredNumber){
            case 1:
                packingLasunka();
                break;
            case 2:
                packingNaminaiko();
                break;
            case 3:
                packingPanKotsky();
                break;
            default:
                isMistake=true;
                System.out.println("Помилковий номер набору пакування!");
        }
        return isMistake;
    }

    public static boolean isContinuePacking(){
        boolean value=false;
        int number=0;
        while (true) {
            try {
                System.out.println("Продовжити пакування?\n1.Так\n2.Ні\nВаш вибір: ");
                number = scanner.nextInt();
                if(number>0 && number<3){
                    break;
                }
                else {
                    System.out.println("Помилка вибору!");
                }
            }catch (Exception e){
                System.out.println("Помилка вибору!");
                scanner.next();
            }
        }
        if(number==1){
            value=true;
        }
        return value;
    }

    public static double getData(String txt){
        while (true){
            try {
                System.out.println(txt);
                double number=scanner.nextDouble();
                if(number>0){
                    return number;
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
