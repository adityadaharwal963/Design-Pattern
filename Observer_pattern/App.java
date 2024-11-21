package Observer_pattern;

/**
 * Subject
 */
public interface App {
abstract void attach(User u); //registerObserver();
abstract void  detach(User u); //unregisterObserver();
abstract void notifyUsers();//notifyObserver();
    
} 
