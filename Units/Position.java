package Units;

public class Position {
    protected int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Unit unit){
      
        return Math.sqrt(Math.pow(x - unit.position.x, 2) + Math.pow(y - unit.position.y, 2));
        
    }

    public boolean isEquals(Position position){
        if ((position.x == this.x) & (position.y == this.y)) return true;
        else return false;
    }
    
}
