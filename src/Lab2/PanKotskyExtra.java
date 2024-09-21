package Lab2;

public class PanKotskyExtra extends GiftSetBuilder{
    @Override
    public void setNameGift() {
        giftSet.setName("Пан Коцький");
    }

    @Override
    public void setLollipops() {
        giftSet.setLollipopsWeight(0.2);
    }

    @Override
    public void setChocolates() {
        giftSet.setChocolatesWeight(0.8);
    }

    @Override
    public void setWaffles() {
        giftSet.setWafflesWeight(0.4);
    }

    @Override
    public void setDragee() {
        giftSet.setDrageeWeight(0.6);
    }

    @Override
    public void setPrise(double priceLollipops, double priceChocolates, double priceWaffles, double priceDragee) {
        countPrise(priceLollipops, priceChocolates, priceWaffles, priceDragee);
    }
}
