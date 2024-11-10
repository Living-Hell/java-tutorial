public class JavaReflection {
    public static void main(String[] args) {
        // Reflection

        // What is reflection?
        // It is used to examine the Classes, Method, Fields, Interfaces at runtime and also possible to exchange
        // the behavior of the class too.
        // For eg.:
        // What all methods present in the class.
        // What all fields present in the class.
        // What is the return type of the method.
        // What is the modifier of the Class.
        // What all interfaces class has implemented.
        // Change the value of the public and private fields of the Class, etc

        // How to do reflection of classes?
        // To reflect the class, we first need to get an Object of Class

        // What is this class Class?
        // Instance of the class Class represents classes during runtime.
        // JVM creates one Class object for each and every class which is loaded during run time.
        // This Class object has meta data information about the particular class like its method, fields, constructor, etc.

        // How to get the particular class Class object?
        // There are 3 ways:
        // 1. Using forName() method
        // Eg.
        // class Bird{}
        // Class birdClass = Class.forName("Bird");

        // 2. Using .class
        // Eg.
        // class Bird{}
        // Class birdClass = Bird.class;

        // 3. Using getClass() method
        // Eg.
        // class Bird{}
        // Bird bird = new Bird();
        // Class birdClass = bird.getClass();

        // How to do reflection of Classes:
        // It only has get methods and not set methods which can be used to access the meta data of the class
        // Some eg:
        // getFields(), getName(), getMethods(), getModifiers(), etc.
        // The package "java.lang.reflect" provides classes that can be used to access and manipulate the value like fields, methods, constructors, etc.
        // And these classes are generally returned by the above mentioned and some other methods only.

        // Reflection of Methods
        // First of all, get the reflection of the class.
        // Then we can use getMethods() to get all the public methods of the class.
        // We can then iterate over the methods to get the other metadata of the methods using methods like getName(), getReturnType(), getModifiers(), etc.
        // Eg.
        // Method[] methods = eagleClass.getMethods();
        // for(Method method : methods){
        //     System.out.println(method.getName());
        //     System.out.println(method.getReturnType());
        //     System.out.println(method.getDeclaringClass());
        // }

        // We can use getDeclaredMethods to get all the declared methods (both public and private) of just that particular class (not the inherited methods).
        // We can even invoke the methods as well.
        // Eg.
        // Class eagleClass = Class.forName("Eagle");
        // Object eagleObject = eagleClass.newInstance(); // Invokes the constructor to create a new instance of the class

        // Method flyMethod = eagleClass.getMethod("fly", int.class, boolean.class, String.class);
        // flyMethod.invoke(eagleObject, 100, true, "Eagle");

        // Reflection of Fields:
        // getFields() and getDeclaredFields() are similar to getMethods() and getDeclaredMethods() respectively.
        // Similar to methods, we need to get the instance of the class and then can use methods to get the metadata of the fields.
        // getFields() returns only the public fields of the class.
        // Other methods are getName, getType, getModifiers, etc.
        // Similarly, getDeclaredFields can be used to get all the fields (public and private)

        // Using reflection we can even change the behaviour of the class.
        // We can change the value of the field members

        // Setting the value of a public field:
        // Eg.
        // Class eagleClass = Eagle.class;
        // Eagle eagleObj = new Eagle();
        // Field field =  eagleClass.getDeclaredField("breed");
        // field.set(eagleObj, "eagleBrownBreed");
        // System.out.println(eagleObj.breed);

        // Setting the value of a private field:
        // We cannot change the value of the private field members
        // However, there is a hack through which we can do so.
        // We can use the setAccessible() method to make the field accessible
        // Eg.
        // Class eagleClass = Eagle.class;
        // Eagle eagleObj = new Eagle();
        // Field field =  eagleClass.getDeclaredField("breed");
        // field.setAccessible(true);
        // field.set(eagleObj, "eagleBrownBreed");
        // System.out.println(eagleObj.breed);

        // This is also a disadvantage of reflection since there is no control over the code now.
        // Reflection breaks the encapsulation property of the OOPS.

        // Reflection of constructors
        // Reflection breaks singleton
        // public class Eagle{
        //     private Eagle(){ // private constructor
        //     }
        //     public void fly(){
        //         System.out.println("Eagle can fly");
        //     }
        // }

        // Class eagleClass = Eagle.class;
        // Constructor[] eagleConstructorList = eagleClass.getConstructors();
        // for(Constructor eagleConstructor : eagleConstructorList){
        //     System.out.println("Modifiers: " + Modifier.toString(constructor.getModifiers()));
        //     eagleConstructor.setAccessible(true);
        //     Eagle eagleObject = (Eagle)eagleConstructor.newInstance();
        //     eagleObject.fly();
        // }

        // The constructor was private and no one can access the member methods since the constructor is private so no one can create an instance of that class.
        // However, using reflection we can access that private constructor which breaks the basic rule of singleton class by changing its accessibility

        // Since reflection breaks the encapsulation principle of OOPS, it's not encouraged to use it.
        // Reflection is slow since everything happens at runtime.











    }
}
