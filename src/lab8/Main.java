package lab8;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть формат дати із запропонованих варіантів: MM-DD-YYYY, DD-MM-YYYY, YYYY-MM-DD: ");
        String format = scanner.nextLine();
        System.out.print("Введіть дату: ");
        String date = scanner.nextLine();
        DateInterpreter dateInterpreter = new DateInterpreter(format);
        try {
            Date parsedDate = dateInterpreter.interpret(date);
            System.out.println("Опрацьована дата: " + parsedDate);
        } catch (ParseException e) {
            System.out.println("Помилковий формат дати!");
        }
    }
}
