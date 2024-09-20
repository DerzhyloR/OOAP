package Lab1;

import java.util.HashMap;
import java.util.Map;

public class Control {
    Map<Baggage,Passenger> baggageMap= new HashMap<>();
    public void controlBaggage(Baggage baggage,Passenger passenger){
        baggageMap.put(baggage,passenger);
    }

    public void outputBaggageInfo(){
        System.out.format("%-12s %-10s %-10s %-15s%n","IdBaggage","Width","IdFlight","Full name");
        for(Map.Entry<Baggage,Passenger>element:baggageMap.entrySet()){
            System.out.format("%-12s %-10.1f %-10s %-15s%n",element.getKey().getIdBaggage(),element.getKey().getWidth(),
                    element.getValue().getIdFlight(),element.getValue().getName());
        }
    }

}
