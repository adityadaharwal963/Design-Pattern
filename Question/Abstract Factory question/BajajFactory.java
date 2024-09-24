public class BajajFactory implements BrandFactory{
    @Override
    public Camera creatCamera() {
        return new BajajCamera();
    }
    @Override
    public Lighting createLighting() {
        return new BajajLighting();
    }
    @Override
    public Fans creatFans() {
        return new BajajFans();
    }
}
