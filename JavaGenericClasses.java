public class JavaGenericClasses {
    public static void main(String[] args) {

        // Generic Classes
        // - Classes that can be used with any type of data
        // Generic classes helps to write the class in a generic manner which helps to avoid typecasting
        // which we face because of using "Object" keyword

        // Eg.
//        public class Printer<T> {
//            T value;
//            public T getPrintValue(){
//                return value;
//            }
//
//            public void setPrintValue(T value){
//                this.value = value;
//            }
//        }

        // Usage:
        // Printer<String> printer1 = new Printer<String>();
        // printer.setPrintValue("Hello World");
        // String value = printer.getPrintValue();
        // Printer<Integer> printer2 = new Printer<Integer>();

        // Generic Type (in the above example <T>, can be any npn-primitive object

        // Inheritance in generic class

        // 1. Non Generic Subclass
        // Whenever we have a non-generic subclass, when we extend a generic class from a parent class,
        // we have to define the type of the parameter in the subclass at the time of extend.

        // Eg.
        // public class ColorPrint extends Print<String>{}

        // 2. Generic Subclass
        // We don't need to define the type of the parameter in the subclass at the time of extend.
        // We can do that at the time of object creation

        //More than 1 Generic Type example:

        // Eg.
        // public class Pair<K, V> {
        //     K value; //Key
        //     V value2; //Value
        //     public void put(K value, V value2){
        //         this.value = value;
        //         this.value2 = value2;
        //     }
        // }

        // Generic Method
        // If we only want to make Method Generic, not the complete Class, we can write Generic Methods too.
        // Type Parameter should be before the return type of the method declaration
        // Type Parameter scope is limited to method only.

        // Eg.
        // public class Print{
        //     public <T> void setValue(T value){
        //         this.value = value;
        //     }
        // }
        // Print obj = nre Print();
        // obj.setValue(new Bus());
        // obj.setValue("Hello World");

        // Raw Type
        // It is a name of the generic class or interface without any argument
        // We do not pass the type parameter while creating the object and the compiler will automatically
        // identify the type of the object and will pass the "Object" parameter type internally.

        // Bounded Generics
        // It can be used at generic classes and methods
        // Upper Bound (<T extends Number>) means T can be of type Number or its Subclass only.
        // Here superclass (here Number) we can have interface too.
        // Multi Bound is also possible
        // Java doesn't allow to extend multiple classes, but we can implement multiple interfaces.
        // Eg.
        // public class A extends ParentClass implements Interface1, Interface2 {}
        // public class Print<T extends ParentClass & Interface1 & Interface2>{}

        // In Wildcards, 3 things are possible:
        // 1. Upper Bound wildcardL <? extends UpperBoundClassName> i.e. class Name and below
        // 2. Lower Bound wildcardL <? super LowerBoundClassName> i.e. class Name and above
        // 3. Unbounded wildcard <?> only you can read

        //Difference between Upper Bound and Generic Class
        // In Generic class, when we have multiple type parameters, all the parameters should be of the same type
        // But in Upper Bound, we can have multiple type parameters as well.
        // Similarly, in case of generic class, we can have multiple parameters, <K,V,T> but in wild cards,
        // we cannot have multiple '?'

        // Type Erasure
        // - It is the process of removing the type information

        // Eg.
        // public class Printer<T> {
        //     T value;
        //     public void setPrintValue(T value){
        //         this.value value;
        //     }
        // }

        // public class Printer {
        //     Object value;
        //     public void setPrintValue(Object value){
        //         this.value value;
        //     }
        // }

        //Eg.2:
        // public class Printer<T extends Number> {
        //     T value;
        //     public void setPrintValue(T value){
        //         this.value value;
        //     }
        // }

        // public class Printer {
        //     Number value;
        //     public void setPrintValue(Number value){
        //         this.value value;
        //     }
        // }

        // When the byte code is generated, unbounded type parameter is replaced with object
        // In case of bounded type parameter, it is replaced with that bounded type parameter







    }
}
