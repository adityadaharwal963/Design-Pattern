public class Main {
    public static void main(String[] args) {
        ShapeRegister shapeRegister = new ShapeRegister();
        
        //prototype
        Rectangle rect = new Rectangle();
        Circle circle = new Circle();

        shapeRegister.registeryShape("rectangle",rect);
        shapeRegister.registeryShape("cricle", circle);

        Shape rect2 =  shapeRegister.createShape("rectangle");

        System.out.println(rect+" " +rect2);
    }
}
