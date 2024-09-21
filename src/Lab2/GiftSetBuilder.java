package Lab2;

public abstract class GiftSetBuilder {
    protected GiftSet giftSet= new GiftSet();

    public abstract void setNameGift();
    public abstract void setLollipops();
    public abstract void setChocolates();
    public abstract void setWaffles();
    public abstract void setDragee();
    public abstract void setPrise(double priceLollipops,double priceChocolates, double priceWaffles, double priceDragee);

    public GiftSet getGiftSet(){
        return giftSet;
    }

    public void countPrise(double priceLollipops, double priceChocolates, double priceWaffles, double priceDragee) {
        double countPrice=giftSet.getLollipopsWeight()*priceLollipops+ giftSet.getChocolatesWeight()*priceChocolates+
                giftSet.getWafflesWeight()*priceWaffles+ giftSet.getDrageeWeight()*priceDragee;
        giftSet.setTotalPrice(countPrice);
    }
}
