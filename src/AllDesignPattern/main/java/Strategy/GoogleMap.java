package Strategy;

public class GoogleMap {
    public static void main(String[] args) {
        PathFindStrategy pathFindStrategy = PathFindFactory.createStrategy(Mode.CAR);
        pathFindStrategy.findPath("SRC","DEST");
    }
}
