package MKP;

import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    public static void main(String [] args){
        ApplicationState appState1 = ApplicationState.getInstance();
        appState1.setLoginId("User123");
        appState1.setMaxSize(200);

        System.out.println("AppState 1:");
        appState1.outputData();

        ApplicationState appState2 = ApplicationState.getInstance();
        System.out.println("AppState 2:");
        appState2.outputData();

        System.out.println("Are both instances the same? " + (appState1 == appState2));
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
