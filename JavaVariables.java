public class JavaVariables {
    public static void main(String[] args) {

        //Java is a strong typed and strong static typed language

        /* Naming conventions:*/
        int myNum = 10; //valid
        int $myNum = 10; //valid
        int _myNum = 10; //valid
        int my_num = 10; //valid
//      int my-num = 10; invalid
//      int my num = 10; invalid
//      int 9myNum = 10; invalid
        String myName = "John"; // camelCase should be used
        final int MY_NUM = 10; //constant variables should be in capital letters
//      MY_NUM = 14; this is not allowed

        /* Types of variables: */

        /* Primitive data types: */

        int myInt = 10;
        double myDouble = 9.8;
        char myChar = 'a';
        boolean myBoolean = true;
        long l = 10;
        float f = 10.5f;
        byte b = 10;
        short s = 10;

        /* CHAR */
        // char c = 0; //NUL (not NULL) /u0000 -> default value of char
        // char c = 65535; //Unicode U+FFFF /uffff
        // range of char 0 to 65535
        // 2 Bytes = 16 bits
        // 2^16 = 65536

        /* BYTE */
        // 1 Byte = 8 bits
        // Range 0 to 255 (if unsigned)
        // Range -128 to 127 (if signed)
        // 2^8 = 256
        // Default value = 0
        // Its a signed 2nd compliment
        // Last bit is the sign bit
        // If last bit is set, i.e. 1, it means its negative
        // If last bit is not set, i.e. 0, it means its positive

        /* Signed 2nd compliment */
        // Eg. 3 -> 0011
        //    -3 -> 1100 (compliment) + 1 -> 1101
        //     3 + (-3) = 0
        //     0011 + 1100 = 10000 -> 0000 (we'll consider only the first 4 bits)

        byte byteExample;
//      system.out.println(byteExample); doesn't print 0 but gives error

        /* Default value for eg. 0 for byte is assigned only to the class members variables and not to local variables */

        /* SHORT */
        // 2 Bytes = 16 bits
        // 2^16 = 65536
        // Default value = 0
        // Its a signed 2nd compliment
        // Last bit is the sign bit
        // If last bit is set, i.e. 1, it means its negative
        // If last bit is not set, i.e. 0, it means its positive

        /* INT */
        // 4 Bytes = 32 bits
        // 2^32 = 4294967296
        // Default value = 0
        // Its a signed 2nd compliment
        // Last bit is the sign bit
        // Ranger -2,147,483,648 to 2,147,483,647
        // -2^31 to 2^31 - 1

        /* LONG */
        // 8 Bytes = 64 bits
        // 2^64 = 18446744073709551616
        // Default value = 0
        // Its a signed 2nd compliment
        // Last bit is the sign bit
        // Ranger -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // -2^63 to 2^63 - 1

        long longVar = 101L;
        System.out.println(longVar);

        /* FLOAT */
        // 32 bits IEEE 754 value
        // 1.4E-45 to 3.4028235E38

        float floatVar = 10.5f;
        System.out.println(floatVar);

        /* DOUBLE */
        // 64 bits IEEE 754 value
        // 4.9E-324 to 1.7976931348623157E308

        double doubleVar = 10.5d;
        System.out.println(doubleVar);

        float var1 = .3f;
        float var2 = .5f;
        float var3 = var1 - var2;
        System.out.println(var3); // prints -0.19999999


        /* If you are very particular about decimal, never use flat or double. Instead, use BigInteger */

        /* BOOLEAN */
        // true or false
        // 1 bit
        // Default value = false

        boolean boolVar = true;
        System.out.println(boolVar);

        /* Types of conversions (Typecasting): */

        /* Widening/Automatic Conversion */
        // From lower data type to higher data type, it does automatic conversion and its called widening conversion
         int i = 10;
         double d = i;
         System.out.println(d); //prints 10.0


        /* DownCasting/ Explicit Casting */
        // From higher data type to lower data type, conversion needs to be done explicitly or manually
        double d1 = 10.5;
        int i1 = (int) d1;
        System.out.println(i1); //prints 10

        float i2 = 10.2f;
//      short s2 = i2; This throws error
        short s2 = (short) i2;
        System.out.println(s2); // prints 10

        int v3 = 128;
        byte b1 = (byte) v3;
        System.out.println(b1); // prints -128

        v3 = 129;
        b1 = (byte) v3;
        System.out.println(b1); // prints -127

        v3 = -129;
        b1 = (byte) v3;
        System.out.println(b1); // prints 127

        //This is because the range of byte is -128 to 127

        /* Promotion */
        byte b2 = 127;
        byte b3 = 1;
//      byte b4 = b2 + b3; This throws error since (b2 + b3) is promoted internally in the expression to int
//      and now stores value 128 which is out of the range of byte so, we need to change its type accordingly
        int b4 = b2 + b3;
        System.out.println(b4); // prints 128

        // or we can do explicit type casting
        byte b5 = (byte) (b2 + b3);
        System.out.println(b5); // prints -128

        //In promotion, if one of the datatype in the expression is higher, all the datatypes are converted
        // to that higher data type and then evaluated accordingly.
        int i3 = 24;
        double d2 = 20d;
//      int i4 = i3 + d2; this throws error since the double is the higher data type and the expression is evaluated
//      as double after converting i3 to double
        int i4 = (int) (i3 + d2);
        System.out.println(i4); // prints 44
        double d3 = i3 + d2;
        System.out.println(d3); // prints 44.0

    }
}
