package Lab2;

public class PanKotskyExtra implements GiftSet{
    GiftSetInfo gift= new GiftSetInfo();
    @Override
    public void setNameGift(double price) {
        gift.setName("Пан Коцький");
    }

    @Override
    public void setLollipops(double price) {
        gift.setLollipopsWeight(0.2,price);
    }

    @Override
    public void setChocolates(double price) {
        gift.setChocolatesWeight(0.8,price);
    }

    @Override
    public void setWaffles(double price) {
        gift.setWafflesWeight(0.4,price);
    }

    @Override
    public void setDragee(double price) {
        gift.setDrageeWeight(0.6,price);
    }

    @Override
    public GiftSetInfo getGift() {
        return gift;
    }
}
