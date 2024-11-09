package Lab4;

public class Main {
    public static void main(String [] args){
        AlarmClockActions alertClock1= new FirstAlarmClockAlert();
        AlarmClock clock1=new CreateAlarmClock(alertClock1);
        clock1.start();
        clock1.toWake();
        clock1.stop();
        System.out.println();
    }
}
