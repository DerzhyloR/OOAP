package Lab1;

public class Main {
    public static void main(String [] args){
        String fullNames[]= {"Eleo Tim","John Davin","Justin Glone","Pedro Hanty","Oleh Josh"};
        String idFlights[]={"FLP85","FLP234","FLP118","FLP176","FLP208"};
        String idBaggage[]={"BG120","BG124","BG116","BG137","BG181"};
        double widths[]={45.5,25.3,37.8,21.1,46.6};

        Control control= new Control();
        for(int i=0;i<5;i++){
            Baggage baggage= new Baggage(idBaggage[i],widths[i]);
            Passenger passenger=new Passenger(fullNames[i],idFlights[i],control);
            passenger.addNewBaggage(baggage);
        }

        System.out.println("FULL INFORMATION:");
        control.outputBaggageInfo();
    }
}
