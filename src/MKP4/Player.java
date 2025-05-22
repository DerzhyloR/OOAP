package MKP4;

import java.util.Random;

class Player {
    String name;
    int fatigue;
    public Player(String name) {
        this.name = name;
        this.fatigue = 0;
    }

    public void play() {
        fatigue += new Random().nextInt(20);
    }

    public boolean isTired() {
        return fatigue >= 80;
    }

    @Override
    public String toString() {
        return name + " (Рівень втоми " + fatigue + ")";
    }
}
