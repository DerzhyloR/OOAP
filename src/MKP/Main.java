package MKP;

import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    public static void main(String [] args){
        ApplicationState state1 = ApplicationState.getInstance();
        System.out.println("Введіть Id: ");
        String id=scanner.nextLine();
        double size=getDataDouble("Введіть максимальний розмір: ");
        state1.setLoginId(id);
        state1.setMaxSize(size);
        state1.outputData(1);

        ApplicationState state2 = ApplicationState.getInstance();
        ApplicationState appState2 = ApplicationState.getInstance();
        appState2.outputData(2);

        if(state1==state2){
            System.out.println("Екземпляри однакові!");
        }else {
            System.out.println("Екземпляри різні!");
        }

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
}
