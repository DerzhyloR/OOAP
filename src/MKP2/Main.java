package MKP2;

public class Main {
    public static void main(String [] args){
        SalesProduct sales=SalesProduct.getObject();
        sales.clearFileOrCreate();
    }
}
