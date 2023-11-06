package Decorator;

public class ChocolateCone implements IceCream{

    private IceCream iceCream;

    public ChocolateCone(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(iceCream == null){
            return 20;
        }else{
            return iceCream.getCost() + 20;
        }
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + "Chocolate Cone";
    }
}
