Singleton desgin pattern ensures a class has only one instance and provide gobal point to access it.

Why?
Thread pool, Caches, Dialog box , registry setting, Objects used for logging in console

Step to implement:

1. make private constructure 
2. create public static method (getInstance) , that return instance of object
3. create private static ref of object in class
4. if ref is null create new instance of object
5. return the ref of object

issue 2 thread to access same code 

Synchronize keyword is used to solve this
6. add synchronize to method 

lazy instanciation : create instance when required
early instanciation: instance is create at class file is loaded , memory is allocated to static object