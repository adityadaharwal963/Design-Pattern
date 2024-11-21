/*
 * Concrete factory for creating Gui componenet for Windows
 */
public class WinFactory implements GUIfactory {
    @Override
    public Button createButton() {
        Button winButton = new WinButton();
        return winButton;
    }
    @Override
    public Checkbox creatCheckbox() {
        Checkbox winCheckbox = new WinCheckbox();
        return winCheckbox;
    }
}
