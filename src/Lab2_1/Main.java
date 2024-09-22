package Lab2_1;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String [] args){
        Buying order = new Buying();
        while (true) {
            double width =getDataDouble("Введіть ширину фасаду (в метрах): ");
            double height = getDataDouble("Введіть висоту фасаду (в метрах): ");
            int type=getDataInt("Введіть тип фасаду:\n1.Суцільний\n2.Вітрина\nВаш вибір: ",1,2);
            int material =getDataInt("Введіть матеріал фасаду:\n1.Плівковий\n2.Фарбований\n3.Пластиковий\nВаш вибір:",1,3);

            FacadeFactory factory = chooseMaterial(material);
            Facade facade = chooseType(type, factory, width, height);
            order.addNewFacade(facade);
            int number=getDataInt("Бажаєте додати ще один фасад?\n1.Так\n2.Ні\nВаш вибір: ",1,2);
            if(number==2){
                break;
            }
        }
        order.outputOrdering();

    }

    public static FacadeFactory chooseMaterial(int number){
        FacadeFactory factory = null;
        switch (number) {
            case 1:
                factory = new Film();
                break;
            case 2:
                factory = new Painted();
                break;
            case 3:
                factory = new Plastic();
                break;
        }
        return factory;
    }

    public static Facade chooseType(int number,FacadeFactory factory,double width, double height){
        Facade facade = null;
        if (number == 1) {
            facade = factory.solidFacade(width, height);
        } else if (number == 2) {
            facade = factory.storeFrontFacade(width, height);
        }
        return facade;
    }

    public static double getDataDouble(String txt){
        while (true){
            try {
                System.out.println(txt);
                return scanner.nextDouble();
            }catch (Exception e){
                System.out.println("ПОМИЛКА ВВОДУ! Повторіть спробу");
                scanner.next();
            }
        }
    }

    public static int getDataInt(String txt,int firstNumber,int lastNumber){
        while (true){
            try {
                System.out.println(txt);
                int chyslo=scanner.nextInt();
                if(chyslo>=firstNumber && chyslo<=lastNumber){
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
