package MKP2;

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

}
