package Units;

public class Monk extends MagClass {

    public Monk(String name, int x, int y) {
        super(360, 254, -35, -45, 40, 300, name, x, y);
    }


    @Override
    public String getName() {
        return "Monk";
    }
}
