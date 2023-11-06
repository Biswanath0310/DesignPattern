package FactoryDesign.Factory;

import FactoryDesign.Button.Button;
import FactoryDesign.TextBox.TextBox;

public interface UIFactory {
    Button createButton();
    TextBox createTextBox();
}
