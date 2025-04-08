package Lab5;

public class Troll extends Character{
    public Troll(){
        super("Троль",25,20);
    }
    @Override
    public int getStrength() {
        return initialStrength;
    }

    @Override
    public int getDefense() {
        return initialDefense;
    }
}
