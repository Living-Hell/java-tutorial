public class JavaMethods {

    public static void main(String[] args) {

        // Access Specifiers
        // Public: can be accessed through any class in any package
        // Private: can only be accessed within the same class
        // Protected: can only be accessed within the same package or other sub-classes in different packages
        // Default: if we do not mention anything, then Default access specifier is used. It can be only accessed by classes within the same package.

        // Return Type
        // What the method is going to return after computation of the method.
        // void: means that the method does not return anything
        // int: means that the method returns an integer
        // float: means that the method returns a float
        // double: means that the method returns a double

        // Methods name:
        // It should be a verb
        // e.g. get, set, print, add, subtract, multiply, divide, etc.
        // It should be in camelCase format
        // e.g. getFirstName, setLastName, printName, addNumbers, etc.

        // Parameters/Arguments
        // It is optional
        // It is used to pass information to the method
        // It is used to pass an argument to the method

        // Types of Methods:

        // 1. System Defined Methods
        // Eg. Math.sqrt()

        // 2. User Defined Methods
        // Eg. getFirstName()

        // 3. Overloaded methods
        // Return type is not considered, function name should be same and arguments should be different
        // Eg. getFirstName(String firstName)
        // Eg. getFirstName(String firstName, String lastName)

        // 4. Overriding methods
        // Subclass has the same method as the parent class

        // 5. Static methods
        // Eg. static int add(int a, int b)
        // When we associate a method with static, we are associating it with a class
        // class A {
        //     public static int add(int a, int b) {
        //         return a + b;
        //     }
        //     public int subtract(int a, int b) {
        //         return a - b;
        //     }
        // }
        // A obj1 = new A();
        // A obj2 = new A();
        // They both will have only subtract() method.
        // add method can be accessed as A.add()
        // When calling a non static method we reference the object while in case of static methods, we reference the class
        // Static method cannot access non-static instance and variables
        // Static method cannot be overridden
        // Override is dynamic binding, it invokes the method on run time based on the object
        // Static is compiled time binding not run-time


        // When to declare static methods?
        // Methods which do not modify the state of the object can be declared static
        // Utility method which do not use any instance variable and compute only on arguments


        // 6. Final method
        // When you dont want to change the implementation of a method
        // A child class can change the methods of the parent class
        // In such scenarios where we dont want to change the implementation of methods in child components,
        // we use final keyword
        // Final method cannot be overridden

        // 7. Abstract method
        // Abstract method should always be inside of an abstract class.
        // Abstract method cannot be static
        // Abstract methods doesn't have any definition, just the declaration
        // Implementation is done in the child class

        // 8. Variable Arguments (Varargs)
        // It is used to pass an indefinite number of arguments to the method
        // Eg. public static void printNames(String ...names)
        // Eg. printNames("Shushant", "Shubham", "Shruti")
        // Only one variable argument can be passed at a time in a method
        // It should be the last argument in the list

        // Example usage:
        //public static int sum(int a, int ...variables){
        //    int res = 0;
        //    for(int variable : variables){
        //        res += variable;
        //    }
        //    return res;
        //}

    }
}
