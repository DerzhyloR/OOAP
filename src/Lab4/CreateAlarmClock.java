package Lab4;

public class CreateAlarmClock implements AlarmClock{
    protected AlarmClockActions clockActions;

    public CreateAlarmClock(AlarmClockActions clockActions){
        this.clockActions=clockActions;
    }

    @Override
    public void start() {
        System.out.println("Будильник запустився!");
    }

    @Override
    public void stop() {
        System.out.println("Будильник зупинився!");
    }

    @Override
    public void toWake() {
        clockActions.message();
        clockActions.ring();
    }

}
