package MKP3;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int operation = getDataInt("Виберіть операцію: 1.Додавання, 2.Віднімання: ",false);
            String selectedOperation=operation==1?"Додавання":"Віднімання";
            int num1 = getDataInt("Введіть перше ціле число: ",true);
            int num2 = getDataInt("Введіть друге ціле число: ",true);
            MathInterpreter mathInterpreter = new MathInterpreter(selectedOperation);
            try {
                int result = mathInterpreter.interpret(num1, num2);
                System.out.println("Результат операції: " + result);
            } catch (Exception e) {
                System.out.println("Невірна операція!");
            }
            int number = getDataInt("\nВвести нові числа? 1 - так, 2 - ні: ",false);
            if (number == 2) {
                break;
            }
        }
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
