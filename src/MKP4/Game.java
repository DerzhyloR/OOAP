package MKP4;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class Game implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private List<Player> activePlayers;
    private Queue<Player> benchPlayers;

    public Game(List<Player> starters, Queue<Player> bench) {
        this.activePlayers = starters;
        this.benchPlayers = bench;
    }

    public void simulateMatch() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("\n--- Хвилина матчу " + i + " ---");
            for (int j = 0; j < activePlayers.size(); j++) {
                Player p = activePlayers.get(j);
                p.play();
                System.out.println(p);
                if (p.isTired()) {
                    notifyObservers(p);
                }
            }
        }
    }

    public void substitutePlayer(Player tired) {
        if (benchPlayers.isEmpty()) {
            System.out.println("Немає жодних запасних гравців" + tired.name);
            return;
        }
        Player sub = benchPlayers.poll();
        System.out.println("Заміна: " + tired.name + " замінюється на " + sub.name);
        activePlayers.remove(tired);
        activePlayers.add(sub);
    }

    @Override
    public void addObserver(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObservers(Player tired) {
        for (Observer o : observers) {
            o.update(tired);
        }
    }
}
