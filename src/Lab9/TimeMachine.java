package Lab9;

import java.util.ArrayList;
import java.util.List;

class TimeMachine {
    private final List<LifeMoment> savedStates = new ArrayList<>();

    public void addMemento(LifeMoment memento) {
        savedStates.add(memento);
    }

    public LifeMoment getMemento(int index) {
        return savedStates.get(index);
    }
}