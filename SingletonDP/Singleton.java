public class Singleton{
    static private Singleton singletonObject = new Singleton();// early instanciation
    private Singleton(){

    }

     public static synchronized Singleton getInstanceSingleton(){
        return singletonObject;
    }

}

class SingletonClass2{
    static private SingletonClass2 singletonObject2 = null;// lazy instanciation
    private SingletonClass2(){

    }

     public static  SingletonClass2 getInstanceSingleton(){
        
            if(singletonObject2 == null){
                singletonObject2 = new SingletonClass2();
            }
        
        return singletonObject2;
    }

}