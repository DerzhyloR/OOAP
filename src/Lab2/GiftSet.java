package Lab2;

public class GiftSet {
    private String name;
    private double lollipopsWeight;
    private double chocolatesWeight;
    private double wafflesWeight;
    private double drageeWeight;
    private double totalPrice;

    public void setName(String name){
        this.name=name;
    }

    public void setLollipopsWeight(double weight){
        this.lollipopsWeight=weight;;
    }

    public double getLollipopsWeight(){
       return lollipopsWeight;
    }

    public void setChocolatesWeight(double weight){
        this.chocolatesWeight=weight;
    }

    public double getChocolatesWeight(){
        return chocolatesWeight;
    }

    public void setWafflesWeight(double weight){
        this.wafflesWeight=weight;
    }

    public double getWafflesWeight(){
        return wafflesWeight;
    }

    public void setDrageeWeight(double weight){
        this.drageeWeight=weight;
    }

    public double getDrageeWeight(){
        return drageeWeight;
    }

    public void setTotalPrice(double price){
        this.totalPrice=price;
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
