package Lab1;

public class Baggage {
    private String idBaggage;
    private double width;

    public Baggage(String  id,double width){
        this.idBaggage=id;
        this.width=width;
    }

    public String getIdBaggage(){
        return this.idBaggage;
    }

    public double getWidth(){
        return this.width;
    }
}
