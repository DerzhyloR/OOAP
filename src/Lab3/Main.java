package Lab3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    private static Map<Client,Car> data= new HashMap<>();

    public static void main(String [] args){
        while (true) {
            System.out.println("Введіть ім'я клієнта: ");
            String name = scanner.nextLine();
            int age = getDataInt("Введіть вік клієнта:", false);
            System.out.println("Введіть стать клієнта: ");
            String sex = scanner.nextLine();
            Client client = new Client(name, age, sex);
            System.out.println("Введіть марку автомобіля: ");
            String model = scanner.nextLine();
            double price = getDataDouble("Введіть ціну автомобіля: ");
            int chooseTypeOfPayment = getDataInt("Виберіть тип оплати за машину:\n1.Повна оплата\n2.Кредитом\n3.У розстрочку\nВаш вибір: ", true);
            String typePayment = findoutTypePayment(chooseTypeOfPayment);
            Car car = creatingObject(chooseTypeOfPayment, typePayment, model, price);
            car.finalPrice();
            car.setGuarantee();
            car.setTypeOfInsurance();
            data.put(client, car);
            if (!isContinue("\nВнести нового клієнта?\ny-Так\nn-Ні")){
                break;
            }
        }
        outputAllData();
    }

    public static Car creatingObject(int number,String clientTypeOfPayment,String model, double price){
        Car obj=null;
        switch (number){
            case 1:
                obj= new FullPayment(clientTypeOfPayment,model,price);
                break;
            case 2:
                obj= new CreditPayment(clientTypeOfPayment,model,price);
                break;
            case 3:
                obj= new InstallmentsPayment(clientTypeOfPayment,model,price);
                break;
        }
        return obj;
    }

    public static void outputAllData(){
        for(Map.Entry<Client,Car>dani:data.entrySet()){
            dani.getKey().getInfo();
            dani.getValue().outputData();
        }
    }

    public static String findoutTypePayment(int number){
        String res="";
        if(number==1){
            res="Повна оплата";
        }
        else if(number==2){
            res="Кредитом";
        }
        else {
            res="У розстрочку";
        }
        return res;
    }

    public static boolean isContinue(String txt){
        boolean isCon=false;
        while (true) {
            System.out.println(txt);
            String res = scanner.nextLine();
            if (res.toLowerCase().equals("y")) {
                isCon = true;
                break;
            } else if(res.toLowerCase().equals("n")) {
                isCon = false;
                break;
            }
            else {
                System.out.println("Помилка вибору! Повторіть спробу");
            }
        }
        return isCon;
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

    public static int getDataInt(String txt,boolean isForObject){
        while (true){
            try {
                System.out.println(txt);
                int chyslo=scanner.nextInt();
                scanner.nextLine();
                if(chyslo>0){
                    if(!isForObject) {
                        return chyslo;
                    }
                    else {
                        if(chyslo<4){
                            return chyslo;
                        }
                        else {
                            System.out.println("Помилка вибору! Повторіть спробу");
                        }
                    }
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
