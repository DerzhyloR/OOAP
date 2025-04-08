package Lab5;

public class DecoratorArmor extends Character{
    private Character base;
    private int armorBonus;

    public DecoratorArmor(Character base, int armorBonus) {
        super(base.getName(), base.getStrength(), base.getDefense());
        this.base = base;
        this.armorBonus = armorBonus;
    }

    @Override
    public int getStrength() {
        return base.getStrength();
    }

    @Override
    public int getDefense() {
        return base.getDefense()+armorBonus;
    }
}
