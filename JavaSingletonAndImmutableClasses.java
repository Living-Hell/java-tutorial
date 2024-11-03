public class JavaSingletonAndImmutableClasses {
    public static void main(String[] args){

        // Singleton Class
        // A class that can have only one instance
        // The instance is created when the class is loaded
        // This class objective is to create only 1 and 1 object.

        //Different ways of creating singleton class:
        // Eager Initialization
        // Lazy Initialization
        // Synchronization Block
        // Double check lock ( there is a memory issue, resolved through Volatile instance variable)
        // Bill Pugh Solution
        // Enum singleton

        // Eager Initialization
        // Eg.
        // public class DBConnection{
        //  private static DBConnection instance = new DBConnection();
        //  private DBConnection(){ }
        //  public static DBConnection getInstance(){
        //      return instance;
        //  }
        // }
        // public class Main{
        //     public static void main(String[] args){
        //         DBConnection connection = DBConnection.getInstance();
        //     }
        // }
        // All the static variables are pre-loaded in the memory
        // Even if the method won't be called, the object will be created and stored in memory


        // Lazy Initialization
        // Eg.
        // public class DBConnection{
        //  private static DBConnection instance;
        //  private DBConnection(){ }
        //  public static DBConnection getInstance(){
        //      if(instance == null){
        //          instance = new DBConnection();
        //      }
        //      return instance;
        //  }
        // }
        // Disadvantage is that if 2 threads come in parallel and find that the variable is null, then the object will be created multiple times


        // Synchronization Method:
        // public class DBConnection{
        //  private static DBConnection instance;
        //  private DBConnection(){ }
        //  synchronized public static DBConnection getInstance(){
        //      if(instance == null){
        //          instance = new DBConnection();
        //      }
        //      return instance;
        //  }
        // }
        // Advantage is that if 2 threads come in parallel and find that the variable is null, then the object will be created only once
        // What synchronized keyword does is puts 'Lock' and 'Unlock' in the memory
        // If two threads come in parallel, only 1 thread will be allowed to go inside the synchronized block
        // So, only 1 thread will be allowed to create the object
        // Disadvantage is that since we are putting 'Lock' on the method level, it becomes very slow
        // Every time the method is called, it will lock and unlock the method


        // Double check lock
        // Eg.
        // public class DBConnection{
        //  private static volatile DBConnection instance;
        //  private DBConnection(){ }
        //  public static DBConnection getInstance(){
        //      if(instance == null){
        //          synchronized(DBConnection.class){
        //              if(instance == null){
        //                  instance = new DBConnection();
        //              }
        //          }
        //      }
        //      return instance;
        //  }
        // }
        // This solves the problem of concurrency
        // If 2 threads come in parallel and find that the variable is null, one of the object will enter and the object will be created only once
        // Since we are checking 2 times, hence its called double check lock
        // The disadvantage of this is the memory issue
        // In CPU there are multiple cores and each core have their own cache generally known as L1 cache which has access to a common memory
        // For performance purpose, core stores all the memory in a temporary memory, cache and periodically sync up with the main memory
        // So, if a thread from 2 different cores come in parallel, one of the thread will do the computation and store the result in the cache
        // If the local memory (cache) has not been synched up yet, the other thread will also do the computation and store the result in the cache
        // So, two object will be created in this case as well.
        // Volatile fixes this issue of the memory
        // For all the 'Volatile' methods, all the read and write operations are done in memory
        // All the computations for the threads  will be done in memory not in the cache
        // However, this is also slow since the volatile is slow and the computation is done in memory


        // Bill Pugh Solution
        // Eg.
        // public class DBConnection{
        //  private DBConnection(){ }
        //  public static class DBConnectionHelper{
        //      private static final DBConnection instance = new DBConnection();
        //  }
        //  public static DBConnection getInstance(){
        //      return DBConnectionHelper.instance;
        //  }
        // }
        // This is the best solution and solves all the issues faced earlier
        // The nested class does not load into the memory as it is loaded only when it is called.
        // So, whenever it is used, then only its loaded in the memory

        // ENUM
        // All the constructors are private
        // In JVM only one snapshot/instance/object of ENUM is present
        // By default, ENUMs are singleton only

        // Immutable Classes
        // We can not change the value of an object once it is created.
        // Declare class as 'final' so that it can not be extended
        // All class members should be private. So that direct access can be avoided
        // And class members are initialized only once using constructor
        // There should not be any setter methods, which is generally used to change the value
        // Just getter methods. And return Copy of the member variable
        // Example: String, Wrapper Classes, etc.
        //Eg.
        // final class MyImmutableClass{
        //     private final String name;
        //     private final List<Object> petNameList;
        //     MyImmutableClass(String name, List<Object> petNameList){
        //         this.name = name;
        //         this.petNameList = petNameList;
        //     }
        //     public String getName(){
        //         return name;
        //     }
        //     public List<Object> getPetNameList(){
        //         return new ArrayList<>(petNameList);
        //     }
        // }
        // In case of ArrayList final makes the variable point to the same list, i.e reference point is the same, however, more values can be added into it or some values can be removed from it.




    }
}
