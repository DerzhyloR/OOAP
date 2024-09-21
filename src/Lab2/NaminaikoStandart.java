package Lab2;

public class NaminaikoStandart extends GiftSetBuilder{
    @Override
    public void setNameGift() {
        giftSet.setName("Наминайко");
    }

    @Override
    public void setLollipops() {
        giftSet.setLollipopsWeight(0.6);
    }

    @Override
    public void setChocolates() {
        giftSet.setChocolatesWeight(0.4);
    }

    @Override
    public void setWaffles() {
        giftSet.setWafflesWeight(0.7);
    }

    @Override
    public void setDragee() {
        giftSet.setDrageeWeight(0.3);
    }

    @Override
    public void setPrise(double priceLollipops, double priceChocolates, double priceWaffles, double priceDragee) {
        countPrise(priceLollipops, priceChocolates, priceWaffles, priceDragee);
    }
}
