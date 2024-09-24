
public class Brand2Factory implements BrandFactory {
    @Override
    public Camera creatCamera() {
        return new Brand2Camera();
    }
    @Override
    public Lighting createLighting() {
        return new Brand2Lighting();
    }
    @Override
    public Fans creatFans() {
        return new Brand2Fans();
    }
    
}
