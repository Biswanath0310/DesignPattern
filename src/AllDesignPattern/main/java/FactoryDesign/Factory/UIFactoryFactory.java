package FactoryDesign.Factory;

public class UIFactoryFactory {
    public static UIFactory getFactory(PlatForm platForm){
        if(platForm == PlatForm.ANDROID){
            return new AndroidUIFactory();
        }
        if(platForm == PlatForm.WINDOWS){
            return new WindowsUIFactory();
        }
        if(platForm == PlatForm.IOS){
            return new IosUIFactory();
        }
        return null;
    }
}
