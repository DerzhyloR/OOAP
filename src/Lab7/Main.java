package Lab7;

import java.util.Scanner;

public class Main {
    static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        TaskHandler editor = new Editor();
        TaskHandler layoutDesigner = new LayoutDesigner();
        TaskHandler graphicDesigner = new GraphicDesigner();
        editor.setNextHandler(layoutDesigner);
        layoutDesigner.setNextHandler(graphicDesigner);
        while (true) {
            System.out.println("Оберіть яке завдання виконати:\nВнесення правок\nОформлення макету\nСтворення дизайну\nВаш вибір: ");
            String task = scanner.nextLine();
            System.out.println("\nОбробка завдання: " + task);
            editor.handleTask(task);
            int number = getDataInt("\nЗапустити виконання нового завдання? 1-так 2-ні: ");
            if(number==2){
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
