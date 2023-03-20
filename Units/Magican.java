package Units;

public class Magican extends MagClass {

    public Magican(String name, int x, int y) {
        super(380, 250, -33, -40, 40, 300, name, x, y);
    }


    @Override
    public String getName() {
        return "Magician";
    }

}