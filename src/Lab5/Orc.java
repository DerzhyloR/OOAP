package Lab5;

public class Orc extends Character{
    public Orc(){
        super("Орк",40,35);
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
