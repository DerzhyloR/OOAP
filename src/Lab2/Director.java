package Lab2;

public class Director {
    private GiftSetBuilder builder;

    public void setBuilder(GiftSetBuilder builder){
        this.builder=builder;
    }

    public GiftSet buildGift(double priceLollipops, double priceChocolates, double priceWaffles, double priceDragee){
        builder.setLollipops();
        builder.setChocolates();
        builder.setWaffles();
        builder.setDragee();
        return builder.getGiftSet();
    }
}
