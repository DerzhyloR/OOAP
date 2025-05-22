package MKP4;

class Manager implements Observer {
    private Game game;

    public Manager(Game game) {
        this.game = game;
    }

    @Override
    public void update(Player tired) {
        System.out.println("Менеджер: Гравець " + tired.name + " втомився!");
        game.substitutePlayer(tired);
    }
}