package Lab3_1;

public class SalesProduct {
    private static final SalesProduct sales= new SalesProduct();
    private int countFood;
    private int countClothes;
    private int countMedicine;

    private SalesProduct(){
        countClothes=0;
        countFood=0;
        countMedicine=0;
    }


}
