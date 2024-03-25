package abstractFactory.Material;

import abstractFactory.textBox;

public class MaterialTextBox implements textBox {
    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
