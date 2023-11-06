package FactoryDesign.Factory;

import FactoryDesign.Button.Button;
import FactoryDesign.Button.WindowsButton;
import FactoryDesign.TextBox.TextBox;
import FactoryDesign.TextBox.WindowsTextBox;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextBox createTextBox() {
        return new WindowsTextBox();
    }
}
