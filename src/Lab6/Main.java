package Lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ComplexMapObject> cities = new ArrayList<>();
        boolean createMoreCities = true;
        while (createMoreCities) {
            System.out.print("Введіть ім'я: ");
            String cityName = scanner.nextLine();
            System.out.print("Введіть координату х для " + cityName + ": ");
            int cityX = scanner.nextInt();
            System.out.print("Введіть координату у для  " + cityName + ": ");
            int cityY = scanner.nextInt();
            scanner.nextLine();
            ComplexMapObject city = new ComplexMapObject(cityName, cityX, cityY);
            boolean createMoreDistricts = true;
            while (createMoreDistricts) {
                System.out.print("Введіть назву області: ");
                String districtName = scanner.nextLine();
                System.out.print("Введіть координату х для " + districtName + ": ");
                int districtX = scanner.nextInt();
                System.out.print("Введіть координату у для " + districtName + ": ");
                int districtY = scanner.nextInt();
                scanner.nextLine();
                ComplexMapObject district = new ComplexMapObject(districtName, districtX, districtY);
                boolean createMoreObjects = true;
                while (createMoreObjects) {
                    System.out.print("Введіть назву для простого об'єкту в області(Магазин, школа): ");
                    String objectName = scanner.nextLine();
                    System.out.print("Введіть координату х для  " + objectName + ": ");
                    int objectX = scanner.nextInt();
                    System.out.print("Введіть координату у для " + objectName + ": ");
                    int objectY = scanner.nextInt();
                    scanner.nextLine();
                    SimpleObject simpleObject = new SimpleObject(objectName, objectX, objectY);
                    district.addComponent(simpleObject);
                    System.out.print("Хочете створити ще однин простий об'єкт для області? 1.так 2.ні : ");
                    String answer = scanner.nextLine();
                    if (!answer.equalsIgnoreCase("yes")) {
                        createMoreObjects = false;
                    }
                }
                city.addComponent(district);
                System.out.print("Хочете створити ще одину область? 1.так 2.ні : ");
                String answer = scanner.nextLine();
                if (!answer.equalsIgnoreCase("yes")) {
                    createMoreDistricts = false;
                }
            }
            cities.add(city);
            System.out.print("Хочете створити ще одне місто? 1.так 2.ні : ");
            String createAnotherCity = scanner.nextLine();
            if (!createAnotherCity.equalsIgnoreCase("yes")) {
                createMoreCities = false;
            }
        }
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
        scanner.close();
    }
}
