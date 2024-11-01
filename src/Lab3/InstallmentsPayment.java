package Lab3;

public class InstallmentsPayment extends Car {

    public InstallmentsPayment(String clientTypeOfPayment,String model, double price){
        super(clientTypeOfPayment,model,price);
    }

    @Override
    public void finalPrice() {
        double newPrice=price*1.2;
        price=newPrice;
    }

    @Override
    public void setGuarantee() {
        guarantee="3 місяців";
    }

    @Override
    public void setTypeOfInsurance() {
        typeOfInsurance="-10% знижки на загальну суму ремонту";
    }
}
