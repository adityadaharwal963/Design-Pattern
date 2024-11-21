package Observer_pattern;
import java.util.*;

// Concrete Subject
class TradingApp implements App{
    ArrayList<User>arr = new ArrayList();
    double price = 0.0;
    
    @Override
    public void attach(User u){
        arr.add(u);
    }
    
    public void detach(User u){
        arr.remove(u);
    }
    
    public void notifyUsers(){
        for(User u:arr){
            u.update(price);
        } 
    }
    
    public void setPrice(double price){
        this.price = price;
        notifyUsers();
    }
    
}