package Lab4;

public class Main {
    public static void main(String [] args){
        AlarmClockActions alertClock1= new FirstAlarmClockAlert();
        AlarmClock clock1=new CreateAlarmClock(alertClock1);

    }
}
