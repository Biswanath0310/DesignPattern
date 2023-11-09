package Strategy;

public class CarPathFindStrategy implements PathFindStrategy{

    private static CarPathFindStrategy instance;

    private CarPathFindStrategy(){

    }
    @Override
    public void findPath(String source, String dest) {
        System.out.println("Car");
    }

    public static CarPathFindStrategy getInstance(){
        if(instance == null){
            synchronized (CarPathFindStrategy.class){
                if(instance == null){
                    instance = new CarPathFindStrategy();
                }
            }
        }
        return instance;
    }
}
