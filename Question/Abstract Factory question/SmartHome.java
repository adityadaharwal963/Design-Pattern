public class SmartHome {
    private Fans fan;
    private Lighting light;
    private Camera cam;

    public SmartHome(BrandFactory factory){
        this.cam = factory.creatCamera();
        this.fan = factory.creatFans();
        this.light = factory.createLighting();
    }

    public void controlSystem(){
        this.cam.start();
        this.fan.start();
        this.light.start();
    }
}
