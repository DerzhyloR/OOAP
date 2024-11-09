package Lab4;

public class SecondAlarmClockAlert implements AlarmClockActions{
    @Override
    public void message() {
        System.out.println("Подає повідомлення у вигляді надсилання 1 повідомлення");
    }

    @Override
    public void ring() {
        System.out.println("Дзвонить 2 рази впродовж 1 хвилини");
    }
}
