package Lab3;

public class FullPayment extends Car{
    public FullPayment(String clientTypeOfPayment,String model, double price){
        super(clientTypeOfPayment,model,price);
    }

    @Override
    public void finalPrice() {
        double newPrice=price*0.95;
        price=newPrice;
    }

    @Override
    public void setGuarantee() {
        guarantee="12 місяців";
    }

    @Override
    public void setTypeOfInsurance() {
        typeOfInsurance="-50% знижки на загальну суму ремонту";
    }
}
