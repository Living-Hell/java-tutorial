public class JavaConstructors {
    public static void main(String[] args) {

        // CONSTRUCTORS

        // A constructor is a special method that is called when an object is created.
        // It is used to initialize the object's attributes or instance variables.
        // It is called automatically when an object is created.
        // The name of the constructor should be the same as the class name.
        // It is similar to methods except:
        // 1. It does not have a return type
        // 2. Constructors are not static or final or abstract, syncrhronized
        // 3. Constructor name is same as the class name

        // Types of constructors

        // 1. Default constructor
        // 2. Parameterized constructor
        // 3. No argument constructor
        // 4. Private constructor
        // 5. Constructor Overloaded
        // 6. Constructor chaining
        //      - this
        //      - super

        // Employee obj = new Employee();
        // the new keyword tells the java compiler that we need to call the constructor.

        // Constructor has the same name as the class name so that it is easy to identify and call it
        // A class method can also have the same name as the constructor.

        // Why constructors cannot be final?
        // Final methods cannot be overridden, that's the purpose of it.
        // A constructor is not inherited from the parent class.
        // When a constructor cannot be inherited, it means it cannot be overridden as well.
        // Thus, there is no use of using final for constructor.

        // Why constructors cannot be abstract?
        // Abstract classes are declared in the parent class and implemented in the child class.
        // Constructors are not inherited from the parent class.
        // When constructors are not inherited, they cannot be implemented either.
        // Thus, if we use abstract for constructors, we cannot implement it.

        // Why constructors cannot be static?
        // Constructors are used to initialise the instance variables.
        // Since static methods can access only the static variables and methods, constructors wont be able to initialise the instance variables.
        // If we define the constructor as static, we wont be able to use super.

        // Can we define constructor in interface?
        // We can create an object for classes, but we cannot create object for instances.
        // So, there is no use of constructor since the primary use of constructor is to create the objects.

        // In the constructor, we can use this keyword to initialize the instance variables.
        // It helps to differentiate between the arguments and the instance variables.
        // In the constructor, we can use super keyword to call the parent class constructor.

        //Eg.
        // Employee(string name, string id){
        //     this.name = name;
        //     this.id = id;
        // }

        // We can declare a constructor private so that no one can call the constructor directly .
        // Eg.
        // private Employee(){}
        // public static Employee getInstance(){
        //     return new Employee();
        // }

        // The public function should be static so that it can be called without creating an object and can be used to create an object.
        // Private constructor can be used so that no one outside has the access to it and no one outside can create an object.
        // The class has the complete control over it (object creation).

        // Constructor chaining
        // We can use 'this' keyword to call the constructor within the constructor.

        // Eg.
        // Employee(){
        //     this(123);
        // }
        // Employee(string id){
        //     this("John", id);
        // }
        // Employee(string name, string id){
        //     this.name = name;
        //     this.id = id;
        // }

        // One constructor calls the other and that calls the other until the value is set.
        // Within one class, when we have multiple constructors, we can make a chain using "this" and pass certain data.
        // "this" can only be used inside one class.

        // Whenever we create a child class, the constructor of the parent class will be called automatically.
        // When we create the object, the parent constructor is invoked first and then the constructor of the child class is invoked.
        // It follows a top to bottom approach.

        // Even if we don't provide it, automatically the first line added by the java runtime is "super()".
        // super() is used to call the parent class constructor.
        // If the parent class constructor is not provided, java will throw an error.
        // If the parent class constructor is parameterised and needs some props, we need to pass the props in the child class constructor through "super".

        //Eg.
        // Employee(string name, string id){
        //     super(name);
        //     this.id = id;
        // }






    }
}
