package Lab5;

public abstract class Character {
    protected String name;
    protected int initialStrength;
    protected int initialDefense;

    public Character(String name, int initialStrength, int initialDefense) {
        this.name = name;
        this.initialStrength = initialStrength;
        this.initialDefense = initialDefense;
    }

    public String getName() {
        return name;
    }

    public abstract int getStrength();
    public abstract int getDefense();
}
