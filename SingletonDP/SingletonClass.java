public class SingletonClass{
    static private SingletonClass singletonObject = null;// lazy instanciation
    private SingletonClass(){

    }

     public static synchronized SingletonClass getInstanceSingleton(){
        if(singletonObject == null){
            singletonObject = new SingletonClass();
        }
        return singletonObject;
    }

}