package Lab5;

public abstract class Character {
    protected String name;
    protected int initialStrength;
    protected int initialDefense;

    public Character(String name, int baseStrength, int baseDefense) {
        this.name = name;
        this.initialStrength = baseStrength;
        this.initialDefense = baseDefense;
    }

    public String getName() {
        return name;
    }

    public abstract int getStrength();
    public abstract int getDefense();
}
