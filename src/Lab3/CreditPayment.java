package Lab3;

public class CreditPayment extends Car{

    public CreditPayment(String clientTypeOfPayment,String model, double price){
        super(clientTypeOfPayment,model,price);
    }

    @Override
    public void finalPrice() {
        double newPrice=price*1.5;
        price=newPrice;
    }

    @Override
    public void setGuarantee() {
        guarantee="8 місяців";
    }

    @Override
    public void setTypeOfInsurance() {
        typeOfInsurance="-20% знижки на загальну суму ремонту";
    }
}
