package FactoryDesign;

import FactoryDesign.Button.Button;
import FactoryDesign.Factory.PlatForm;
import FactoryDesign.Factory.UIFactory;
import FactoryDesign.TextBox.TextBox;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(PlatForm.IOS);
        UIFactory uiFactory = flutter.getUIFactory();
        Button button = uiFactory.createButton();
        TextBox textBox = uiFactory.createTextBox();
    }
}
