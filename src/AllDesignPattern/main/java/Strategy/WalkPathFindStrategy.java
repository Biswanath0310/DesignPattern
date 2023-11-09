package Strategy;

public class WalkPathFindStrategy implements PathFindStrategy{

    private static WalkPathFindStrategy instance;

    private WalkPathFindStrategy(){

    }
    @Override
    public void findPath(String source, String dest) {
        System.out.println("Walk");
    }

    public static WalkPathFindStrategy getInstance(){
        if(instance == null){
            synchronized (WalkPathFindStrategy.class){
                if(instance == null){
                    instance = new WalkPathFindStrategy();
                }
            }
        }
        return instance;
    }
}
