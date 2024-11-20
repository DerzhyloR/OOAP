package MKP2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class SalesProduct {
    private static final SalesProduct sales= new SalesProduct();
    private int countFood;
    private int countClothes;
    private int countMedicine;
    private double totalPrice;

    private SalesProduct(){
        countClothes=0;
        countFood=0;
        countMedicine=0;
        totalPrice=0;
    }

    public static SalesProduct getObject(){
        return sales;
    }

    public void finalPrice(int number){
        Random rand = new Random();
        double firsPrice=50 + (rand.nextDouble() * 500);
        double price=0;
        String nameProfuct="";
        switch (number){
            case 1:
                price=firsPrice*1.15;
                countClothes++;
                nameProfuct="Одяг";
                break;
            case 2:
                price=firsPrice*1.05;
                countFood++;
                nameProfuct="Їжа";
                break;
            case 3:
                price=firsPrice*1.10;
                nameProfuct="Ліки";
                countMedicine++;
                break;
        }
        totalPrice+=price;
        writeToFile(price,nameProfuct);
    }

    private void writeToFile(double price,String name){
        try{
            BufferedWriter writer= new BufferedWriter(new FileWriter("productSalse.txt",true));
            String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            writer.write("Час: "+time+"\tТип продукту: "+name+"\tЦіна: "+String.format("%.2f",price)+"\n");
            writer.close();
        }catch (Exception e){
            System.out.println("Помилка запису у файл!");
        }
    }

    public void clearFileOrCreate(){
        try {
            FileWriter writer = new FileWriter("productSalse.txt", false);
        }catch (Exception e){
            System.out.println("Помилка відкриття файлу");
        }
    }

    public void outputResult(){
        System.out.println("\nПідсумок продажів:\nКількість проданого одягу: "+countClothes+"\nКількість проданої їжі: "+countFood
                +"\nКількість проданих ліків: "+countMedicine+"\nЗагальна суму продажів: "+String.format("%.2f",totalPrice));
    }

}
