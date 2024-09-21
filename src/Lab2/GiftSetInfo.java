package Lab2;

public class GiftSetInfo {
    private String name;
    private double lollipopsWeight;
    private double chocolatesWeight;
    private double wafflesWeight;
    private double drageeWeight;
    private double totalPrice;

    public void setName(String name){
        this.name=name;
    }

    public void setLollipopsWeight(double weight, double price){
        this.lollipopsWeight=weight;
        this.totalPrice+=weight*price;
    }

    public void setChocolatesWeight(double weight, double price){
        this.chocolatesWeight=weight;
        this.totalPrice+=weight*price;
    }

    public void setWafflesWeight(double weight, double price){
        this.wafflesWeight=weight;
        this.totalPrice+=weight*price;
    }

    public void setDrageeWeight(double weight, double price){
        this.drageeWeight=weight;
        this.totalPrice+=weight*price;
    }

    public void outputInfo(){
        System.out.println("Назва подарункового набору: "+name+"\n" +
                "Льодяники: "+lollipopsWeight+" кг\n" +
                "Шоколадні цукерки: "+chocolatesWeight+" кг\n" +
                "Вафлі: "+wafflesWeight+" кг\n" +
                "Драже: "+drageeWeight+" кг\n" +
                "Загальна вартість: "+totalPrice+" грн\n");
    }

}
