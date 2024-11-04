public class JavaInterfaces {
    public static void main(String[] args) {

        // Interfaces
        // Interface is something which helps 2 system to interact with each other, without one system knowing the details of other
        // In simple term, it helps to achieve Abstraction

        // How to define the interface
        // Interface declaration consists of
        //  - Modifiers
        //  - "interface" keyword
        //  - Interface Name
        //  - Comma separated list of parent interfaces
        //  - Body

        // Eg>
        // public interface Bird{
        //     public void fly();
        // }

        // Only public and Default Modifiers are allowed (Protected and private are not allowed)
        // It can extend from other interfaces using the "extends" keyword and comma separated interface names

        // Eg.
        // public interface NonFlyingBirds extend Bird, LivingThings{
        //     public void swim();
        // }

        // Why we need interfaces?

        // 1. Abstraction
        // Using interface, we can achieve full Abstraction which means we can define WHAT class must do, but not HOW it will do
        // Eg.
        // public interface Bird{
        //     public void fly();
        // }

        // public class Parrot implements Bird{
        //     @Override
        //     public void fly(){
        //         System.out.println("Parrot can fly");
        //     }
        // }

        // 2. Polymorphism
        // Interface can be used as a Data Type
        // We can not create the object of an interface, but we can hold the reference of all the classes which implements it. And at runtime, it decides which method need to be invoked.

        // Eg.
        // Bird birdObject1 = new Eagle();
        // Bird birdObject2 = new Parrot();
        // birdObject1.fly();
        // birdObject2.fly();

        // Note: We can never create an object of an interface and we can only create an object of a concrete class.

        // 3. Multiple Inheritance
        // In Java, Multiple inheritance is possible only through interfaces.
        // Since the interface only provides the signature/declaration of the methods and not the implementation, we can have multiple inheritance.
        // The inherited interface simply defines the methods that the parent interfaces declared.
        // This is not possible with classes since the classes can have implementation too and if 2 or more classes have same function and its implementation, it can cause issue.
        // That's why any class can inherit only one parent class.
        // This is called "Diamond Problem".

        // Eg.
        // public interface LandAnimal{
        //     public void breathe();
        // }
        // public interface WaterAnimal{
        //     public void breathe();
        // }
        // public interface FlyingBirds extends LandAnimal, WaterAnimal{
        //     @Override
        //     public void breathe(){
        //         System.out.println("Birds can breathe");
        //     }
        // }


        // Methods in Interfaces
        // All methods are implicitly public only
        // Method can not be declared as final

        // Fields in Interface
        // Fields are public, static and final implicitly (CONSTANTS)
        // We can not make field private or protected.
        //Eg.
        // public interface Bird{
        //      int MAX_HEIGHT_IN_FEET = 2000;
        //      this is equivalent to
        //      public static final int MAX_HEIGHT_IN_FEET = 2000;
        // }

        // Interface Implementation
        //  - Overriding method can not have more restrictive access specifiers
        //  - Concrete class must override all the methods declared in the interface
        //  - Abstract classes are not forced to override all the methods
        //  - However, the classes that extend the abstract class needs to provide the implementation of all
        //    the abstract methods of the parent class as well as the methods declared in the interface
        //  - A class can implement from multiple interfaces

        // Nested Interface
        // It is an interface that is defined inside another interface.
        // It is declared within a class

        // Generally it is used to group logically related interfaces in one file

        // Rules
        //  - A nested interface declared within an interface must be public
        //  - A nested interface declared within a class can have any access modifier
        //  - When you implement outer interface, inned interface implementation is not required and vice-versa

        // When we declare an interface inside a class, it can be private, protected or public

        // Eg.
        // public interface Bird{
        //     public void fly();
        //     public interface NonFlyingBird{
        //         public void swim();
        //     }
        // }

        // Use cases:
        // public class Eagle implements Bird{
        //     @Override
        //     public void fly(){
        //         System.out.println("Eagle can fly");
        //     }
        // }

        // public class Parrot implements Bird.NonFlyingBird{
        //     @Override
        //     public void swim(){
        //         System.out.println("Parrot can swim");
        //     }
        // }

        // public class Penguin implements Bird, Bird.NonFlyingBird{
        //     @Override
        //     public void fly(){
        //         System.out.println("Penguin can fly");
        //     }
        //     @Override
        //     public void swim(){
        //         System.out.println("Penguin can swim");
        //     }
        // }

        // If a class implements only the nested interface, it only needs to provide the definition for the nested interface's methods
        // Eg.
        // public class Bird{
        //     protected interface NonFlyingBird{
        //         public void swim();
        //     }
        // }
        // public class Eagle implements Bird.NonFlyingBird{
        //     @Override
        //     public void swim(){
        //         System.out.println("Eagle can swim");
        //     }
        // }


        // Interface vs Abstract Class
        // Abstract Class
        //   1. Keyword used here is 'abstract'
        //   2. Child class need to use keyword 'extends'
        //   3. It can have both abstract and non abstract methods
        //   4. It can extend from another class and multiple interfaces
        //   5. Variables can be static, non static, final, non final, etc
        //   6. Variables and Methods can be private, protected, public or default
        //   7. Multiple inheritance is not supported
        //   8. It can provide the implementation of the interface
        //   9. It can have constructor
        //   10. To declare the method abstract, we have to use 'abstract' keyword and it can be 'protected', 'public' or 'default'

        // Interface
        //   1. Keyword used here is 'interface'
        //   2. Child class need to use keyword 'implements'
        //   3. It can have only abstract methods (from Java 8 onwards, it can have default, static and private method too where we can provide implementation)
        //   4. It can only extend from other interfaces
        //   5. Variables are by default CONSTANTS
        //   6. Variable and Methods are by default public (in Java9, private methods is supported)
        //   7. Multiple inheritance is supported with this in Java
        //   8. It can not provide the implementation of any other interface or abstract class
        //   9. It cannot have constructor
        //   10. No need for any keyword to make method abstract. And by default it is 'public'

    }
}
