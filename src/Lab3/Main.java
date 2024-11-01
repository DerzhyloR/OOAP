package Lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    public static void main(String [] args){
        ArrayList<Object> data= new ArrayList<>();
        System.out.println("Введіть ім'я клієнта: ");
        String name=scanner.nextLine();



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

    public static int getDataInt(String txt,boolean isForObject){
        while (true){
            try {
                System.out.println(txt);
                int chyslo=scanner.nextInt();
                scanner.nextLine();
                if(chyslo>0){
                    if(!isForObject) {
                        return chyslo;
                    }
                    else {
                        if(chyslo<4){
                            return chyslo;
                        }
                        else {
                            System.out.println("Помилка вибору! Повторіть спробу");
                        }
                    }
                }
                else{
                    System.out.println("Помилка вибору! Повторіть спробу");
                }
            }catch (Exception e){
                System.out.println("ПОМИЛКА ВВОДУ! Повторіть спробу");
                scanner.next();
            }
        }
    }
}
