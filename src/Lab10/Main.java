package Lab10;

import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String [] args){
        boolean isBuild=true;
        while (isBuild){
            int selectedOption=getDataInt("Оберіть з чим збудувати будинок:\n1.З мансардою\n2.З балконом\n3.З Гаражем\n4.Звичайний",4);
            Building house=createBuilding(selectedOption);
            if(house!=null) {
                house.buildHouse();
                int number = getDataInt("Хочете збудувати ще один будинок? 1.так 2.ні : ", 2);
                if (number == 2) {
                    isBuild = false;
                }
            }
        }
    }

    private static Building createBuilding(int option) {
        switch (option) {
            case 1:
                return new HouseAttic();
            case 2:
                return new HouseBalcony();
            case 3:
                return new HouseGarage();
            case 4:
                return new StandardHouse();
        }
        return null;
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
