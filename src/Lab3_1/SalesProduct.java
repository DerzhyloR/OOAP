package Lab3_1;

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

    public SalesProduct getObject(){
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
                nameProfuct="Одяг";
                break;
            case 2:
                price=firsPrice*1.05;
                nameProfuct="Їжа";
                break;
            case 3:
                price=firsPrice*1.10;
                nameProfuct="Ліки";
                break;
        }
        totalPrice+=price;
    }

    public void writeToFile(){

    }


}
