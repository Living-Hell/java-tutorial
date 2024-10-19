public class JavaClassesInDepth1 {
    public static void main(String[] args){

        // Types of Classes:
        // 1. Concrete Class
        // 2. Abstract Class
        // 3. Super Class and Sub Class
        // 4. Object Class
        // 5. Nested Class
        //      - Inner Class (Non static nested class)
        //      - Anonymous Inner Class
        //      - Member Inner Class
        //      - Local Inner Class
        //      - Static Nested Class/ Static Class
        // 6. Generic Class
        // 7. POJO Class
        // 8. Enum Class
        // 9. Final Class
        // 10. Singleton Class
        // 11. Immutable Class
        // 12. Wrapper Class

        // Concrete Class
        // These are the classes that we can create and instance using the 'new' keyword
        // All the methods in this class have implementation
        // It can also be your child class from interface or extended abstract class
        // A class access modifier can be 'public' or 'package private' (no explicit modifier defined)


        // Abstract Class
        // Show only important features to users and hide its internal implementation. 2 ways to achieve abstraction:
        // - Class is declared as abstracted through keyword "abstract".
        // - It can have both abstract(method without body) and non abstract methods.
        // - We can not create an instance of this class.
        // - We parent has some features which all child classes have in common, then this can be used.
        // - Constructors can be created inside them. And with super keyword from child classes we can access them.
        // Eg. interface and abstract class
        // abstract class Car{}
        // In abstract class, we can define the methods but we can implement it or we can not, its our choice.
        // In interface, we can only define the methods and we can not implement it.
        // We cannot create an object of the instance class or the abstract class.

        // Super Class and Sub Class
        // - A class that is derived from another class is called a subclass
        // - And from class through which subclass is derived is called superclass
        // - In java, in the absence of any other explicit superclass, every class is implicitly a subclass of Object class.
        // - Object is the topmost class in Java
        // It has some common methods like clone(), toString(), equals(), notify(), wait(), etc.
        // A class which does not extend any class or is not a sub class of any defined super class, Object is the default super class for all classes.
        // Object is the parent of all and by default is the parent of all classes..

        // Child objects can be stored in parent class reference
        // If we want to hold an object in a parent class reference, but we dont know the parent class, then we can hold it in the Object class reference.

        // Nested Class
        // A nested class is a class that is defined inside another class.
        // When to use?
        // When we know that a class(A) will be used by only one another class(B), then instead of
        // creating a new file(A.java) for it, we can create nested class inside B class itself.
        // It also helps us to group logically related classes in one file.
        // Scope is the same as of its outer class
        // It is of 2 types
        // 1. Static Nested Class
        // 2. Non-Static Nested Class
        //    - Member Inner Class
        //    - Local Inner Class
        //    - Anonymous Inner Class

        // Static Nested Class
        // IT does not have access to the non-static instance variable and method of outer class
        // Its objects can be initiated without initiating the object of outer class
        // It can be private, public, protected or package private(default, no explicit declaration)

        // Eg. usage:
        // OuterClass.StaticNestedClass obj = new OuterClass.StaticNestedClass();
        // obj.methodName();

        //***Class modifiers of the file can only be public or package private(default, no explicit declaration).
        //***But the nested classes can be private and protected as well.

        // Non-Static Nested Class or Inner class
        // It has access to all the instance (including static) variables and methods of outer class
        // Its object can be initiated only after initiating the object of outer class

        // 1. Member Inner Class
        // - It can be private, public, protected or package private(default, no explicit declaration)

        // Eg. usage:
        // OuterClass outerClassObj = new OuterClass();
        // OuterClass.MemberInnerClass obj = outerClassObj.new MemberInnerClass();
        // obj.methodName();

        // 2. Local Inner Class
        // These are those classes which are defined in any block like for loop, while loop block, if condition block, methods,etc
        // It can not be declared as private, protected or public. Only default (no explicit declaration) is allowed.
        // It cannot be initiated outside of the block.

        // Inheritance in Nested Class:
        // Nested classes can be inherited as well.
        // It can be single or multiple
        // As we know, when child class constructor is invoked, it first invokes the constructor of parent.
        // But if the parent is inner class, it first invokes the constructor of outer class.
        // And then it invokes the constructor of child class.
        // It is similar to the inheritance in the parent class.

        // 3. Anonymous Inner Class
        // An inner class without a name is called an anonymous class.
        // It is used when we want to override the behaviour of the method without even creating any subclass.



    }
}
