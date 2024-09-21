package Lab2;

public class NaminaikoStandart implements GiftSet {

    GiftSetInfo gift= new GiftSetInfo();

    @Override
    public void setNameGift(double price) {
        gift.setName("Наминайко");
    }

    @Override
    public void setLollipops(double price) {
        gift.setLollipopsWeight(0.6,price);
    }

    @Override
    public void setChocolates(double price) {
        gift.setChocolatesWeight(0.4,price);
    }

    @Override
    public void setWaffles(double price) {
        gift.setWafflesWeight(0.7,price);
    }

    @Override
    public void setDragee(double price) {
        gift.setDrageeWeight(0.3,price);
    }

    @Override
    public GiftSetInfo getGift() {
       return gift;
    }
}
