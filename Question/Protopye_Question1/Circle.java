
public class Circle implements Shape{

    @Override
    public Shape clone()  {
        try{
            return (Shape)super.clone();
        }catch(CloneNotSupportedException e){
            return null;
        }
       
    }
    @Override
    public void display(){
        System.out.println("Shape display Circle");
    }
}
