package Lab9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        List<String>allStates=new ArrayList<>();
        String currentState="";
        LifePeriod life = new LifePeriod();
        TimeMachine timeMachine = new TimeMachine();
        boolean isAdding=true;
        while (isAdding){
            System.out.println("Введіть етап життя: ");
            currentState=scanner.nextLine();
            allStates.add(currentState);
            life.setState(currentState);
            timeMachine.addMemento(life.saveToMemento());
            int number=getDataInt("Хочете додати ще один етап життя? 1.так 2.ні : ",2);
            if (number==2) {
                isAdding = false;
            }
        }
        boolean isBack=true;
        while (isBack){
            String txt="Оберіть в який етап життя ви хочете повернутися?:";
            int i=0;
            for (String state:allStates){
                i++;
                txt+="\n"+i+"."+state;
            }
            int number=getDataInt(txt,i);
            if(!currentState.equals(allStates.get(number-1))){
                currentState=allStates.get(number-1);
                life.restoreFromMemento(timeMachine.getMemento(number-1));
                int n=getDataInt("Хочете здійснити ще повернення в часі? 1.так 2.ні : ",2);
                if (n==2) {
                    isBack = false;
                }
            }else {
                System.out.println("Ви зараз на цьому етапі! Ви не межете повернутися до нього! ");
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
