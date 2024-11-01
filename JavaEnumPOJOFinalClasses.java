public class JavaEnumPOJOFinalClasses {
    public static void main(String[] args) {
        //POJO Classes
        //Stands for "Plain Old Java Object"
        //Class should  be public
        //Public default constructor
        //No annotations should be used like @Table @Entity @ld etc
        //It should not extend any class or implement any interface

        //ENUM Class
        //It has a collection of CONSTANTS (variables whose values can not be changed)
        //It can not extend any class, as it internally extends java.lang.Enum Class
        //It can implement interfaces
        //It can have variables, constructor, methods.
        //It can not be initiated (as its constructor will be private only, even if you give default, in bytecode it makes it private)
        //No other class can extend Enum class
        //It can have abstract method, and all the constant should implement that abstract method
        //A class can extend upto 1 class only, and since enum class internally extends a class, it cannot extend any other class
        
        //Normal Enum class:
        //public enum EnumSample{
        //  MONDAY.
        //  TUESDAY,
        //  WEDNESDAY,
        //  THURSDAY,
        //  FRIDAY,
        //  SATURDAY,
        //  SUNDAY;
        //}

        //Internally all the constants are assigned some values.
        //Eg. MONDAY = 1, TUESDAY = 2, WEDNESDAY = 3, THURSDAY = 4, FRIDAY = 5, SATURDAY = 6, SUNDAY = 7

        //Common functions that are used:
        //values()
        //valueOf()
        //name()
        //ordinal()

        //Eg, usage
        //for(EnumSample sample : EnumSample.values()){
        //  System.out.println(sample.ordinal());
        //}

        //EnumSample enumVariable = EnumSample.valueOf("MONDAY");
        //System.out.println(enumVariable.name());

        // Enum with custom values
        // public enum EnumSample{
        //  MONDAY(101, "1st day of the week"), // here the constructor is being called and passing value and description
        //  TUESDAY(102, "2nd day of the week"),
        //  WEDNESDAY(103, "3rd day of the week"),
        //  THURSDAY(104, "4th day of the week"),
        //  FRIDAY(105, "5th day of the week"),
        //  SATURDAY(106, "6th day of the week"),
        //  SUNDAY(107, "7th day of the week");

        //Whatever variable we define here, it's for each enum constant
        //  private int value;
        //  private String description;

        //Constructor can be initiated within the class
        //  EnumSample(int value, String description){
        //      this.value = value;
        //      this.description = description;
        //  }

        //These methods will also be there for each enum constant
        //  public int getValue(){
        //      return value;
        //  }
        //  public String getDescription(){
        //      return description;
        //  }

        //Class level method not for each constant
        // public static EnumSample getEnumSample(int value){
        //     for(EnumSample sample : EnumSample.values()){
        //         if(sample.getValue() == value){
        //             return sample;
        //         }
        //     }
        //     return null;
        // }

        //Method override by constants
        // public enum EnumSample{
        //  MONDAY{
        //      @Override
        //      public String getDescription(){
        //          return "1st day of the week";
        //      }
        //  },
        //  TUESDAY,
        //  WEDNESDAY,
        //  THURSDAY,
        //  FRIDAY,
        //  SATURDAY,
        //  SUNDAY;
        //
        //  public void getDescription(){
        //      System.out.println("A day of the week");
        //  }
        // }

        //Enum with abstract method
        // public enum EnumSample{
        //  MONDAY{
        //      @Override
        //      public String getDescription(){
        //          return "1st day of the week";
        //      }
        //  },
        //  TUESDAY{
        //      @Override
        //      public String getDescription(){
        //          return "2nd day of the week";
        //      }
        //  },
        //  WEDNESDAY{
        //      @Override
        //      public String getDescription(){
        //          return "3rd day of the week";
        //      }
        //  };
        // All the constants in the enum class have to define the abstract method
        // public abstract String getDescription();
        // }

        // Enum implement interfaces
        // public interface MyInterface{
        //     public String toLowerCase();
        // }

        // public enum EnumSample implements MyInterface{
        //  MONDAY,
        //  TUESDAY,
        //  WEDNESDAY,
        //  THURSDAY,
        //  FRIDAY,
        //  SATURDAY,
        //  SUNDAY;
        //  @Override
        //  public String toLowerCase(){
        //      return this.name().toLowerCase();
        //  }
        // }

        // Benefit of ENUM class over initialising constants with static final keyword
        // With public static we do not have any control over what values comes.
        // Any value can be passed to it and because of which the function might behave unexpectedly
        // Enum also enhances the readability of the code
        // We cannot send any value outside the constants in the enum class and hence any random value can't come

        // Final class
        // If we want any class that should not be inherited, then we use final class.
        // Eg.
        // public final class MyFinalClass{}



    }
}
