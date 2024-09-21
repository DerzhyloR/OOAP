package Lab2;

public abstract class GiftSetBuilder {
    GiftSet giftSet= new GiftSet();

    public abstract void setNameGift(double price);
    public abstract void setLollipops(double price);
    public abstract void setChocolates(double price);
    public abstract void setWaffles(double price);
    public abstract void setDragee(double price);

    public GiftSet getGiftSet(){
        return giftSet;
    }
}
