package Lab1;

public class Passenger {
    private String fullName;
    private String idFlight;

    private Control control;

    public Passenger(String namePassenger,String id,Control control){
        this.fullName=namePassenger;
        this.idFlight=id;
        this.control=control;
    }

    public String getName(){
        return this.fullName;
    }

    public String getIdFlight(){
        return this.idFlight;
    }

    public void addNewBaggage(Baggage baggage){
        control.controlBaggage(baggage,this);
    }
}
