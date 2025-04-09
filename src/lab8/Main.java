package lab8;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введіть формат дати із запропонованих варіантів: MM-DD-YYYY, DD-MM-YYYY, YYYY-MM-DD: ");
            String format = scanner.nextLine();
            System.out.print("Введіть дату: ");
            String date = scanner.nextLine();
            DateInterpreter dateInterpreter = new DateInterpreter(format);
            try {
                Date parsedDate = dateInterpreter.interpret(date);
                System.out.println("Опрацьована дата: " + parsedDate);
            } catch (Exception e) {
                System.out.println("Помилковий формат дати!");
            }
            int number=getDataInt("\nВвести дату знову? 1-так 2-ні: ");
            if (number==2){
                break;
            }
        }
    }

    public static int getDataInt(String txt){
        while (true){
            try {
                System.out.println(txt);
                int chyslo=scanner.nextInt();
                scanner.nextLine();
                if(chyslo>0 && chyslo<=2){
                    return chyslo;
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
