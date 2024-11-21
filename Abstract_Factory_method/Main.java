public class Main {
    public static void main(String[] args) {

        String osName = System.getProperty("os.name");
        System.out.println(osName);
        if(osName.equals("Mac OS X")){
            Application app = new Application(new MacFactory());
            app.paint();
        }else{
            Application app = new Application(new WinFactory());
            app.paint();
        }
        
        
    }
    
}
