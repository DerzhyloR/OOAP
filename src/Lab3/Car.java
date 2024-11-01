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

    public abstract void finalPrice();
    public abstract void setGuarantee();
    public abstract void setTypeOfInsurance();

    public void outputData(){
        System.out.print("Тип оплати: "+clientTypeOfPayment+"\nМарка машини: "+model+"\nЦіна: "+price+"\nТип страхування:"
        +typeOfInsurance+"\nГарантія:"+guarantee+"\n");
    }
}
