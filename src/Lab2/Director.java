package Lab2;

public class Director {
    private GiftSetBuilder builder;

    public void setBuilder(GiftSetBuilder builder){
        this.builder=builder;
    }

    public GiftSet buildGift(double priceLollipops, double priceChocolates, double priceWaffles, double priceDragee){
        builder.setNameGift();
        builder.setLollipops();
        builder.setChocolates();
        builder.setWaffles();
        builder.setDragee();
        builder.setPrise(priceLollipops,priceChocolates,priceWaffles,priceDragee);
        return builder.getGiftSet();
    }
}
