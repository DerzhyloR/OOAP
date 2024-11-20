package MKP2;

import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);

    public static void main(String [] args){
        SalesProduct sales=SalesProduct.getObject();
        sales.clearFileOrCreate();
    }

    public static int getDataInt(String txt){
        while (true){
            try {
                System.out.println(txt);
                int chyslo=scanner.nextInt();
                scanner.nextLine();
                if(chyslo>0 && chyslo<4){
                    return chyslo;
                }
                else{
                    System.out.println("ПОМИЛКА ВИБОРУ! Повторіть спробу");
                }
            }catch (Exception e){
                System.out.println("ПОМИЛКА ВВОДУ! Повторіть спробу");
                scanner.next();
            }
        }
    }
}
