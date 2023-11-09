package Strategy;

public class BikePathFindStrategy implements PathFindStrategy{

    private static BikePathFindStrategy instance;

    private BikePathFindStrategy(){

    }
    @Override
    public void findPath(String source, String dest) {
        System.out.println("Bike");
    }

    public static BikePathFindStrategy getInstance(){
        if(instance == null){
            synchronized (BikePathFindStrategy.class){
                if(instance == null){
                    instance = new BikePathFindStrategy();
                }
            }
        }
        return instance;
    }
}
