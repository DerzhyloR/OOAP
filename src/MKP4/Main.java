package MKP4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<Player> starters = new ArrayList<>();
        starters.add(new Player("Роман"));
        starters.add(new Player("Олег"));
        starters.add(new Player("Mаксим"));
        starters.add(new Player("Вадим"));
        Queue<Player> bench = new LinkedList<>();
        bench.add(new Player("Ігор"));
        bench.add(new Player("Сергій"));
        bench.add(new Player("Василь"));
        Game game = new Game(starters, bench);
        Manager manager = new Manager(game);
        game.addObserver(manager);
        game.simulateMatch();
    }
}
