package Units;


public class Robber extends InfantClass {
    public Robber(String name, int x, int y) {
        super(340, 330, 70, 80, 60, 450, name, x, y);
    }

    public String getInfo() {
        return "Robber";
    }

    @Override
    public String getName() {
        return "Robber";
    }
}

