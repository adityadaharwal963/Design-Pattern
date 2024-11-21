package Observer_pattern;

// Observer
class User{
    TradingApp ta;
    double price = 0.0;
    
    User(TradingApp ta){
        this.ta = ta;
        ta.attach(this);
    }
    public void update(double price){
        this.price = price;
        display();
    }
    
    public void display(){
        System.out.println("Current stock price : "+price);
    }
    
}