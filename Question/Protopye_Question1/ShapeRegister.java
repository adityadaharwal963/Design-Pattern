
import java.util.HashMap;

public class ShapeRegister {
    HashMap <String,Shape> map = new HashMap<>();

    void registeryShape(String key,Shape s){
        map.put(key, s);
    }

    Shape createShape(String key){
        Shape s = map.get(key);

        if(s==null){
            return null;
        }
        return s.clone();
    }
}
