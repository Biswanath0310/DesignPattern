package Decorator;

public class VanillaCone implements IceCream{

    public VanillaCone() {
    }

    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Vanilla Cone";
    }
}
