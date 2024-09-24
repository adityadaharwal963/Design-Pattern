/*
 * Concrete factory for creating Gui componenet for mac 
 */
public class MacFactory implements GUIfactory{
    @Override
    public Button createButton() {
        Button macButton = new MacButton();
        return macButton;
    }
    @Override
    public Checkbox creatCheckbox() {
        Checkbox macCheckbox = new MacCheckbox();
        return macCheckbox;
    }
}
