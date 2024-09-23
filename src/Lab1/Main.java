package Lab1;

import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    public static void main(String [] args){
            int g=1;
            int number_Passanger=getDataInt("Введіть кількість пасажирів:");
            String fullNames[]=new String[number_Passanger];
            String idFlights[]= new String[number_Passanger];
            String idBaggage[]= new String[number_Passanger];
            double widths[]= new double[number_Passanger];
            for(int i=0; i<number_Passanger;i++) {
                System.out.println("Пасажир №" + g);
                System.out.println("Повне ім'я пасажира:");
                fullNames[i]=scanner.nextLine();
                System.out.println("ID рейсу:");
                idFlights[i]=scanner.nextLine();
                System.out.println("ID багажу:");
                idBaggage[i]=scanner.nextLine();
                widths[i]=getDataDouble("Вага багажу:");
                g++;
            }

            Control control = new Control();
            for (int i = 0; i < idBaggage.length; i++) {
                Baggage baggage = new Baggage(idBaggage[i], widths[i]);
                Passenger passenger = new Passenger(fullNames[i], idFlights[i], control);
                passenger.addNewBaggage(baggage);
            }

            System.out.println("\nFULL INFORMATION:");
            control.outputBaggageInfo();
    }

    public static int getDataInt(String txt){
        while (true){
            try {
                System.out.println(txt);
                int chyslo=scanner.nextInt();
                scanner.nextLine();
                if(chyslo>0){
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
