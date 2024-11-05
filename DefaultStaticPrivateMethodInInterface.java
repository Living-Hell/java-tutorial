public class DefaultStaticPrivateMethodInInterface {
    public static void main(String[] args){

        // Java8 Interface Features

        //Default Method (Java8)
        // Before Java8, interface used to have only Abstract method. And all child classes had to
        // provide the implementation of the abstract methods.
        // If we have an interface and multiple classes are implementing it, then, in future if we have to add a method
        // in the interface then we have to implement it in all classes, even if the functionality might be the same.
        // Default method fixed this issue.
        // Eg.
        // public interface Bird{
        //     public void fly();
        //     default void sing(){
        //         System.out.println("Singing");
        //     }
        // }

        // Why default method was introduced?
        // To add functionality in existing legacy interface we need to use Default method. Example steam() method in Collection interface.

        // Default and Multiple Inheritance and how to handle?
        // When a class is implementing multiple interfaces and they have common default method implementation, in such case,
        // the derived class that is implementing the interfaces has to provide the implementation of those methods in its own class.

        // How to extend interface, that contains Default method:
        // If a sub-interface which is implementing another interface abstracts the default method implementation, the sub-interface or the sub-classes
        // implementing that interface has to provide the implementation for that method.

        // Another way is to override the default implementation in the sub-interface.
        // Eg.
        // public interface Bird{
        //     default void sing(){
        //         System.out.println("Singing");
        //     }
        // }

        // public interface FlyingBird extends Bird{
        //     default void sing(){
        //         boolean singObject = Bird.super.sing();
        //         return singObject;
        //     }
        // }

        // Another way is to not touch the methods and its implementation in the sub-interfaces and the classes implementing the interface can make use
        // of the default methods of the parent interfaces directly.


        // Static Method
        // We can provide the implementation of the method in interface through this.
        // But it can not be overridden by classes which implement the interface
        // We can access it using interface name itself
        // Its by default public

        // Eg.
        // public interface Bird{
        //     public static void sing(){
        //         System.out.println("Singing");
        //     }
        // }

        // Java 9 Features

        // Private Method and Private Static method
        // We can provide the implementation of method but as a private access modifier in interface.
        // It brings more readability in the code. For example if multiple default method share some code, then this can help.
        // It can be defined as static and non-static
        // From static method, we can call only private static interface method.
        // Private static method can be called from both static and non-static method
        // Private interface method can not be abstract. Means we have to provide the definition
        // It can be used inside the particular interface only.

    }
}
