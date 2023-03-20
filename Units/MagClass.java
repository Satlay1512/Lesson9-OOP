package Units;

public abstract class MagClass extends Unit {

    int mana;

    public MagClass(int hp, int speed, int damage, int maxDamage, int armor, int mana, String name, int x, int y) {
        super(hp, speed, damage, maxDamage, armor, name, x, y);
        this.mana = mana;
    }

}

