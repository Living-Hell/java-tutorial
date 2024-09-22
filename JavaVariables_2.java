public class JavaVariables_2 {
    public static void main (String[] args) {

        // NON PRIMITIVE DATA TYPE

        // Reference data type:
        // 1. Class 2. String 3. Interface 4. Array

        // CLASS:

        // Whenever we create an object of a class, for example empObject
        // a heap memory is allocated to it.
        // The empObject is nothing but a reference to that memory.
        // It holds the reference to the actual memory.
        // That's why its called reference data type.

        // In java, everything is pass by value and there is no concept of pass by reference
        // Everything is stored via reference in objects

        // STRING:

        // Strings are immutable
        // Strings are stored in the heap memory
        // String literals

        String s1 = "Hello"; // "Hello" is a string literal
        // String literal is stored in String Constant Pool

        String s2 = "Hello"; // This "Hello" won't be stored in String Constant Pool

        // s1 and s2 will both point to same "Hello" in String Constant Pool
        System.out.println(s1 == s2); //checks if they are pointing to same memory
        System.out.println(s1.equals(s2)); // checks if they are equal

        String s3 = new String("Hello"); // This "Hello" will be stored in String Constant Pool
        // whenever we use "new" keyword, it will not be considered as a string literal
        // using "new" keyword creates an object in heap memory

        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true

        // When we change the string, string literal will remain in the string constant pool
        // and new string will be stored in heap memory. That's why strings are immutable
        // Once created, cannot be changed

        s2 = "Hello World";
        // "Hello World" will be stored in String Constant Pool
        // "Hello" will remain in String Constant Pool
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // false


        // INTERFACE:

        // Interface is an abstract class
        // When an object implements the interface, it has to overwrite the methods
        // We can store the object of the child classes in the parent class

        // Eg.
        // public interface Person{
        //     public  String profession();
        // }

        // public class Teacher implements Person{
        //     @Override
        //     public String profession() {
        //         return "Teacher";
        //     }
        // }

        // Person teacher = new Teacher();

        // You cannot create object of interface
        // Since only the child classes have the interface
        // Interface just holds the reference

        // ARRAY

        int[] arr = new int[5];
        int arr2[] = new int[5];
        // Default value of int is 0

        // WRAPPER BOX
        // - Autoboxing
        // - Unboxing

        // We have 8 primitive data types in java
        // int, char, byte, short, long, float, double, boolean

        // Data Type | Wrapper Class (Reference Type)
        // int       | Integer
        // char      | Character
        // byte      | Byte
        // short     | Short
        // long      | Long
        // float     | Float
        // double    | Double
        // boolean   | Boolean

        // We can use wrapper classes to create object of primitive data types
        // Primitive data types are not stored in heap so, they are not passed by reference
        // When we pass them, they are passed by value and their reference is not passed
        // While when we pass an object, the object is passed and when we make any changes,
        // the change is reflected in the memory since its a reference data type.

        // Primitive data type are stored in stack memory.

        // All the java collections work on the heap memory and on reference data type, object only

        // Autoboxing - Primitive to Wrapper class
        int a = 10;
        Integer b = a;

        // Unboxing - Wrapper class to primitive
        Integer c = 10;
        int d = c;

        // Constant variables
        // static final int PI = 3.14;
        // only 1 copy can exist of a constant variable


    }
}
