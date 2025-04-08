package Lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<ComplexMapObject> cities = new ArrayList<>();
        boolean createMoreCities = true;
        while (createMoreCities) {
            System.out.print("Введіть ім'я міста: ");
            String cityName = scanner.nextLine();
            int cityX =  getDataInt("Введіть координату х для " + cityName + ": ",0);
            int cityY = getDataInt("Введіть координату у для  " + cityName + ": ",0);
            scanner.nextLine();
            ComplexMapObject city = new ComplexMapObject(cityName, cityX, cityY);
            boolean createMoreDistricts = true;
            while (createMoreDistricts) {
                System.out.print("Введіть назву району: ");
                String districtName = scanner.nextLine();
                int districtX = getDataInt("Введіть координату х для " + districtName + ": ",0);
                int districtY = getDataInt("Введіть координату у для " + districtName + ": ",0);
                scanner.nextLine();
                ComplexMapObject district = new ComplexMapObject(districtName, districtX, districtY);
                boolean createMoreObjects = true;
                while (createMoreObjects) {
                    System.out.print("Введіть назву для простого об'єкту в районі(Магазин, школа): ");
                    String objectName = scanner.nextLine();
                    int objectX = getDataInt("Введіть координату х для  " + objectName + ": ",0);
                    int objectY = getDataInt("Введіть координату у для " + objectName + ": ",0);
                    scanner.nextLine();
                    SimpleObject simpleObject = new SimpleObject(objectName, objectX, objectY);
                    district.addComponent(simpleObject);
                    int number=getDataInt("Хочете створити ще однин простий об'єкт для району? 1.так 2.ні : ",2);
                    if (number==2) {
                        createMoreObjects = false;
                    }
                }
                city.addComponent(district);
                int number=getDataInt("\"Хочете створити ще один район? 1.так 2.ні : ",2);
                if (number==2)  {
                    createMoreDistricts = false;
                }
            }
            cities.add(city);
            int number=getDataInt("Хочете створити ще одне місто? 1.так 2.ні : ",2);
            if (number==2) {
                createMoreCities = false;
            }
        }
        System.out.println("\n===== Карта міста =====");
        for (ComplexMapObject city : cities) {
            printComponent(city, 0, 0, ""); // Виводимо місто і все, що в ньому
        }
        System.out.println("========================\n");
        while (true) {
            System.out.print("Введіть ім'я компонента,який ви хочете знайти: ");
            String searchName = scanner.nextLine();
            boolean found = false;
            for (ComplexMapObject city : cities) {
                MapComponent foundComponent = city.findChild(searchName);
                if (foundComponent != null) {
                    System.out.println("Знайдено: " + foundComponent.getName());
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Не знайдено!");
            }
            int number=getDataInt("Здійснити пошук ще раз? 1.так 2.ні : ",2);
            if (number==2) {
                break;
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
                else if(chyslo>=0 && minOptions==0){
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

    private static void printComponent(MapComponent component, int parentX, int parentY, String indent) {
        int absX = parentX + component._x;
        int absY = parentY + component._y;
        System.out.println(indent + component.getName() + " (" + absX + ", " + absY + ")");
        if (component instanceof ComplexMapObject) {
            ComplexMapObject complex = (ComplexMapObject) component;
            for (MapComponent child : complex.children) {
                printComponent(child, absX, absY, indent + "    ");
            }
        }
    }
}
