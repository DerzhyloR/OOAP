package MKP3;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static int getDataInt(String txt, boolean isNumber) {
        while (true) {
            try {
                System.out.println(txt);
                int chyslo = scanner.nextInt();
                scanner.nextLine();
                if (chyslo > 0 && chyslo <= 2) {
                    return chyslo;
                }
                else if(isNumber){
                    return chyslo;
                }else {
                    System.out.println("Помилка вибору! Повторіть спробу");
                }
            } catch (Exception e) {
                System.out.println("ПОМИЛКА ВВОДУ! Повторіть спробу");
                scanner.next();
            }
        }
    }
}
