package FactoryDesign.Factory;

import FactoryDesign.Button.Button;
import FactoryDesign.Button.IosButton;
import FactoryDesign.TextBox.IosTextBox;
import FactoryDesign.TextBox.TextBox;

public class IosUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public TextBox createTextBox() {
        return new IosTextBox();
    }
}
