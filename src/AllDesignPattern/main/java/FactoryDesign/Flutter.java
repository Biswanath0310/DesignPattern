package FactoryDesign;

import FactoryDesign.Factory.PlatForm;
import FactoryDesign.Factory.UIFactory;
import FactoryDesign.Factory.UIFactoryFactory;

public class Flutter {

    private PlatForm platForm;

    public Flutter(PlatForm platForm) {
        this.platForm = platForm;
    }

    public void setTheme(){
        System.out.println("Setting a theme for the app");
    }

    public void setRefreshRate(){
        System.out.println("Setting a refresh rate for the app");
    }

    public UIFactory getUIFactory(){
        return UIFactoryFactory.getFactory(platForm);
    }
}
