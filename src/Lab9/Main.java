package Lab9;

import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        LifePeriod life = new LifePeriod();
        TimeMachine timeMachine = new TimeMachine();
        boolean isAdding=true;
        while (isAdding){
            System.out.println("Введіть етап життя: ");
            life.setState(scanner.nextLine());
            timeMachine.addMemento(life.saveToMemento());
            int number=getDataInt("Хочете додати ще один етап життя? 1.так 2.ні : ",2);
            if (number==2) {
                isAdding = false;
            }
        }

    }

    public static int getDataInt(String txt,int minOptions){
        while (true){
            try {
                System.out.println(txt);
                int chyslo=scanner.nextInt();
                scanner.nextLine();
                if(chyslo>0 && chyslo<=minOptions){
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
