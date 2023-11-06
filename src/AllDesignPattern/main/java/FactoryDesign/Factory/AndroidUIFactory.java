package FactoryDesign.Factory;

import FactoryDesign.Button.AndroidButton;
import FactoryDesign.Button.Button;
import FactoryDesign.TextBox.AndroidTextBox;
import FactoryDesign.TextBox.TextBox;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AndroidTextBox();
    }
}
