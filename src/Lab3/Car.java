package Lab3;

abstract class Car {
    protected String clientTypeOfPayment;
    protected String model;
    protected String typeOfInsurance;
    protected String guarantee;
    protected double price;

    public Car(String clientTypeOfPayment,String model, double price){
        this.clientTypeOfPayment=clientTypeOfPayment;
        this.model=model;
        this.price=price;
        typeOfInsurance="Unknown";
        guarantee="Unknown";
    }

    public abstract double finalPrice();
    public abstract String setGuarantee();
    public abstract String setTypeOfInsurance();

}
