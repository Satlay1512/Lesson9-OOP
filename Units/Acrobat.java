package Units;

public class Acrobat extends InfantClass {

    public Acrobat(String name, int x, int y) {
        super(440, 360, 60, 75, 55, 430, name, x, y);
    }

    @Override
    public String getName(){
        return "Acrobat";
    }
}
