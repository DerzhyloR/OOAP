package Lab4;

public class CreateAlarmClock implements AlarmClock{
    protected AlarmClockActions clockActions;

    public CreateAlarmClock(AlarmClockActions clockActions){
        this.clockActions=clockActions;
    }

}
