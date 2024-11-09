package Lab4;

public class FirstAlarmClockAlert implements AlarmClockActions{
    @Override
    public void message() {
        System.out.println("Подає повідомлення у вигляді короткого сигналу");
    }

    @Override
    public void ring() {
        System.out.println("Дзвонить 1 раз впродовж 1 хвилини");
    }
}
