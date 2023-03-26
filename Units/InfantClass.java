package Units;

import java.util.ArrayList;

public abstract class InfantClass extends Unit {

    int stamina;

    public InfantClass(int hp, int speed, int damage, int maxDamage, int armor, int stamina, String name, int x,
            int y) {
        super(hp, speed, damage, maxDamage, armor, name, x, y);
        this.stamina = stamina;
    }

    @Override
    public void step(ArrayList<Unit> team, ArrayList<Unit> friends) {
        if (this.stamina > 0 && this.hp > 0) {

            Unit target = team.get(0);
            double minDistance = this.position.getDistance(team.get(0));

            for (Unit unit : team) {
                if (this.position.getDistance(unit) < minDistance) {
                    minDistance = this.position.getDistance(unit);
                    target = unit;
                }
            }
            if (this.position.getDistance(target) >= 2) {
                this.position.direction(target.position, friends);
            } else {
                this.attack(target, this.damage, this.maxDamage);
                this.stamina--;
            }
        }
    }
}
