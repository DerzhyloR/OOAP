package Lab5;

public class People extends Character {
    public People(){
        super("Людина",15,10);
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
