package Lab5;

public class DecoratorWeapon extends Character{
    private Character base;
    private int weaponBonus;
    public DecoratorWeapon(Character base, int weaponBonus) {
        super(base.getName(), base.getStrength(), base.getDefense());
        this.base = base;
        this.weaponBonus = weaponBonus;
    }

    @Override
    public int getStrength() {
        return base.getStrength() + weaponBonus;
    }

    @Override
    public int getDefense() {
        return base.getDefense();
    }
}
