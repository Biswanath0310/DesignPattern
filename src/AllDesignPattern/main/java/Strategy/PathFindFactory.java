package Strategy;

public class PathFindFactory {
    public static PathFindStrategy createStrategy(Mode mode){
        switch (mode){
            case CAR: return CarPathFindStrategy.getInstance();
            case BIKE: return BikePathFindStrategy.getInstance();
            case WALK: return WalkPathFindStrategy.getInstance();
            default: return null;
        }
    }
}
