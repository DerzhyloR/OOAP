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
        System.out.print("\nТип оплати: "+clientTypeOfPayment+"\nМарка машини: "+model+"\nЦіна: "+price+"\nТип страхування:"
        +typeOfInsurance+"\nГарантія:"+guarantee+"\n");
    }

    public Car creatingObject(int number,String clientTypeOfPayment,String model, double price){
        Car obj=null;
        switch (number){
            case 1:
                obj= new FullPayment(clientTypeOfPayment,model,price);
                break;
            case 2:
                obj= new CreditPayment(clientTypeOfPayment,model,price);
                break;
            case 3:
                obj= new InstallmentsPayment(clientTypeOfPayment,model,price);
                break;
        }
        return obj;
    }

}
