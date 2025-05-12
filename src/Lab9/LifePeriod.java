package Lab9;

public class LifePeriod {
    private String state;

    public void setState(String state) {
        System.out.println("Поточний етап життя: " + state);
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public LifeMoment saveToMemento() {
        System.out.println("Збережено спогад: " + state);
        return new LifeMoment(state);
    }

    public void restoreFromMemento(LifeMoment memonto) {
        state = memonto.getState();
        System.out.println("Відновлено етап життя: " + state);
    }
}
