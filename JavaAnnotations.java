public class JavaAnnotations {
    public static void main(String[] args){

        // Annotation
        // It is kind of adding META DATA to the java code
        // Means, its usage is optional
        // We can use this meta data information at runtime and can add certain logic in our code if wanted
        // How to Read Meta data information? Using reflection as discussed in previous video.
        // Eg.
        // public interface Bird{
        //  public boolean fly();
        // }
        // public class Eagle implements Birt{
        //  @Override -> Annotation
        //  public boolean fly(){
        //      return true;
        //  }
        // }

        // Types of Annotations:
        //  - Pre-Defined Annotations
        //      - Used on Annotations (called Meta-Annotations)
        //          - @Target
        //          - @Retention
        //          - @Documented
        //          - @Inherited
        //          - @Repeatable
        //      - Used on Java Code (Like classes, methods, etc.)
        //          - @Deprecated
        //          - @Override
        //          - @SupressWarnings
        //          - @FunctionalInterface
        //          - @SafeVarargs
        //  - Custom Annotations/User Defined @(Out custom name)

        // Annotations used on Java Code:
        // @Deprecated
        // - Usage of Deprecated class or methods or fields, shows you compile time Warning
        // - Deprecation means, no further improvement is happening on this and use new alternative method or field instead
        // - Can be used over: Constructor, Field, Local variable, method, package, parameter, type (class, interface, enum)

        // @Override
        // - During compile time. it will check that the method should be overridden or not
        // - And throws compile time error, if it do not match with the parent method.
        // - Can be used over: Methods

        // @SuppressWarnings
        // - It is used to suppress the compilation warnings
        // - Should be used safely as it could lead to run time exception if any valid warning is ignored
        // - Can be used over: Method, Field, Parameter, Constructor, Local Variable, Type (Class or interface or enum)

        // @FunctionalInterface
        // - Restrict interface to have only one abstract method
        // - Throws compilation error, if more than 1 abstract method is present
        // - Can be used over: Type (Class or interface or enum)

        // @SafeVarargs
        // - Used to suppress "Heap Pollution" warning
        // - Used over methods and constructors which accepts variable arguments as parameter
        // - Method should be either static or final (i.e. methods which can be overridden)
        // - In Java9 we can also use it on private methods

        // What is Heap Pollution?
        // Heap Pollution is a problem where Object of one Type (Example String) is storing the reference of another type Object (Example Integer).

        // Annotations used over Another Annotations (Meta-Annotations):

        // @Target
        // - This meta-annotation will restrict where to use the annotation
        // - Either at method or constructor of fields etc...

        // Element Types:
        // - TYPE
        // - FIELD
        // - METHOD
        // - PARAMETER
        // - CONSTRUCTOR
        // - LOCAL_VARIABLE
        // - ANNOTATION_TYPE (Annotations can be made meta-annotations using this)
        // - PACKAGE
        // - MODULE
        // - TYPE_PARAMETER
        // - TYPE_USE

        // @Retention
        // - This meta-annotation tells, how Annotation will be stored in Java.
        //      - RetentionPolicy.SOURCE: Annotations will be discarded by the compiler itself and it will not be recorded in .class file
        //      - RetentionPolicy.CLASS: Annotations will be recorded in .class file but will be ignored by JVM at run time
        //      - RetentionPolicy.RUNTIME: Annotations will be recorded in .class file and will be available at run time. Usage of reflection can be done

        // @Documented
        // - By default, Annotations are ignored when Java Documentation is generated
        // With this meta-annotation even Annotations will come in JavaDocs

        // @Inherited
        // - By default, Annotations are not inherited by child classes
        // - With this meta-annotation, Annotations will be inherited by child classes
        // This meta-annotation has no effect if annotation is used on anything other than a class

        // @Repeatable
        // - Allows us to use the same annotation multiple times on a single element
        // - Available in JAVA8

        // Eg.
        // @Repeatable(Categories.class)
        // @interface Category{
        //  String value();
        // }
        //
        // @Retention(RetentionPolicy.RUNTIME)
        // @interface Categories{
        //  Category[] value();
        // }
        //
        // @Category(value = "Java")
        // @Category(value = "Python")
        // public static class JavaCategory{}
        //
        // @Categories(value = {@Category(value = "Java"), @Category(value = "Python")})

        // User Defined or Custom Annotations
        // - We can create our own ANNOTATION using keyword "@interface"

        // Creating an Annotation with empty body:
        // public @interface MyAnnotation{}

        // @MyAnnotation
        // public class MyClass{}

        // Creating an Annotation with method (its more like a field)
        // - No parameter, no body
        // - Return type is restricted to Primitive, Class, String, Enums, annotations and array of these types

        // public @interface MyCustomAnnotation{
        //      string name();
        // }

        // @MyCustomAnnotation(name = "Java")
        // public class MyClass{}

        // Creating an Annotation with an element with Default values:
        // - Default value can not be null
        // public @interface MyCustomAnnotation{
        //      string name() default "Java";
        // }

    }
}
