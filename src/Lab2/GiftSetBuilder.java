package Lab2;

public abstract class GiftSetBuilder {
    protected GiftSet giftSet= new GiftSet();

    public abstract void setNameGift();
    public abstract void setLollipops();
    public abstract void setChocolates();
    public abstract void setWaffles();
    public abstract void setDragee();

    public GiftSet getGiftSet(){
        return giftSet;
    }
}
