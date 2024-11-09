public class FunctionalInterfaceAndLambdaExpression {
    public static void main(String[] args){

        // Functional Interface

        // Functional Interface is a Interface that has only 1 abstract method
        // Also known as SAM Interface (Single Abstract Method)
        // @FunctionalInterface keyword can be used at the top of the interface (but it is optional)

        //Eg.
        // @FunctionalInterface
        // public interface MyFunctionalInterface{
        //     void myMethod();
        // }
        // OR
        // public interface MyFunctionalInterface{
        //     void myMethod();
        // }

        // But we can have other methods like default methods, static methods and Object class methods
        // In interface if we define any object class method, we dont have to provide the implementation for it in the classes that extends it.
        // This is because all the classes extends the Object class by default and the definition is already provided there.

        //Lambda Expression
        // It is an expression that can be used to create a Functional Interface
        // Different ways to implement the functional interface
        // Eg.
        // @FunctionalInterface
        // public interface MyFunctionalInterface{
        //     void myMethod();
        // }

        // Using 'implements'
        // public class Eagle implements Bird{
        //     @Override
        //     public void fly(){
        //         System.out.println("Eagle can fly");
        //     }
        // }

        // using 'anonymous class'
        // public class Main{
        //     public static void main(String[] args){
        //         Bird bird = new Bird(){
        //             @Override
        //             public void fly(){
        //                 System.out.println("Eagle can fly");
        //             }
        //         };
        //     }
        // }

        // Using 'Lambda Expression'
        // public class Main{
        //     public static void main(String[] args){
        //         Bird bird = () -> System.out.println("Eagle can fly");
        //     }
        // }

        // Types of Functional Interface:

        // 1. Consumer:
        // Represent an operation that accepts a single input and returns no result
        // Present in package: java.util.function
        // Eg.
        // @FunctionalInterface
        // public interface MyFunctionalInterface<T>{
        //     void myMethod(T t);
        // }

        // 2. Supplier:
        // Represent the supplier of the result. Accepts no input parameter but produce a result.
        // Present in package: java.util.function
        // Eg.
        // @FunctionalInterface
        // public interface MyFunctionalInterface<T>{
        //     T myMethod();
        // }

        // 3. Function:
        // Represent an operation that accepts one input and produces one result
        // Present in package: java.util.function
        // Eg.
        // @FunctionalInterface
        // public interface MyFunctionalInterface<T, R>{
        //     R myMethod(T t);
        // }

        // 4. Predicate:
        // Represent an operation that accepts one input and produces a boolean result
        // Present in package: java.util.function
        // Eg.
        // @FunctionalInterface
        // public interface MyFunctionalInterface<T>{
        //     boolean myMethod(T t);
        // }

        // Handle use case when Functional Interface extends from other interface:
        // 1. Functional interface extending non-functional interface
        // if the parent interface has any abstract method,the child interface will inherit it. So, if the child interface
        // also has its own abstract method, it will have multiple abstract methods and will throw a compile time error.

        // 2. Interface extending functional interface
        // parent interface can have abstract methods as well as the child interface, it will work fine

        // 3. Functional interface extending another functional interface
        // if the parent interface has any abstract method,the child interface will inherit it. So, if the child interface
        // overrides the parent interface's method and don't have its own interface, it will work fine.
        // In short, parent and child should have the same abstract method.



    }
}
