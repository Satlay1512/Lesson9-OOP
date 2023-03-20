package Units;

public class XBowMan extends Shooter {
    public XBowMan(String name, int x, int y) {
        super(430, 290, 52, 65, 50, 23, name, x, y);
    }

    @Override
    public String getInfo(){
        return "XBowMan";
    }

    @Override
    public String getName() {
        return "XBowMan";
    }
}
