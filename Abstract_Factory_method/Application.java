/*
 * Clinet class implementation
 */
public class Application {
    //GUIfactory factory;
    Button button;
    Checkbox checkbox;

    public Application(GUIfactory guIfactory){
        //this.factory = guIfactory;
        this.button = guIfactory.createButton();
        this.checkbox = guIfactory.creatCheckbox();
    }
    
    void paint(){
        this.button.paint();
        this.checkbox.paint();
    }
}
