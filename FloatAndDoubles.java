import java.math.BigDecimal;

public class FloatAndDoubles {

    public static void main(String[] args) {
        float a = .7f;
        System.out.println(a); // prints 0.7
        System.out.println((double)a); //prints 0.699999988079071

        // float stores the data in 32 bits IEEE 754 format
        // 1 bit - sign
        // 8 bits - exponent
        // 23 bits - mantissa/significant

        // E.g. 4.125f storage in memory in this format
        // Step 1: Convert int to binary
        // 4 -> 100
        // .125 -> .001
        // 0.125 x 2 = 0.25 | 0
        // 0.25 x 2 = 0.5 | 0
        // 0.5 x 2 = 1 | 1

        // 4.125 -> 100.001

        // Make it in the form of (1.xxx) * 2^(exponent)
        // 100.001 = 1.00001 * 2^(2)
        // [0.00001] -> mantissa and 2 -> exponent

        // Add bias to the exponent
        // For float, bias = 127 (2^7 - 1)
        // 127 + 2 = 129

        // Step 4
        // 4.125 in memory
        // 0 | 1 0 0 0 0 0 0 0 1 | 0 0 0 0 1 0 0 ... 0
        // 0 for +ve | 129 for bias | 0 0 0 0 1 mantissa (after decimal)

        // Now let's revert back to check if we are getting the same value
        // (-1)^sign x (1 + mantissa) x  2^(exponent - 127)
        // (-1)^0 x (1 + 0.00001) x 2^(129 - 127)
        // (-1)^0 x (1 + 1/(2^5)) x 2^(129 - 127)
        // 1 x (1 + 0.3125) x 2^2
        // 1.03125 x 4
        // 4.125

        // Now we check for .7f
        // 0.7 to binary
        // 0.7 x 2 = 1.4 | 1
        // 0.4 x 2 = 0.8 | 0
        // 0.8 x 2 = 1.6 | 1
        // 0.6 x 2 = 1.2 | 1
        // 0.2 x 2 = 0.4 | 0
        // 0.4 x 2 = 0.8 | 0
        // 0.8 x 2 = 1.6 | 1
        // 0.6 x 2 = 1.2 | 1
        // 0.2 x 2 = 0.4 | 0
        // ... (repeating)

        // binary form of 0.7
        // .1 0110 0110 0110 0110

        // now we convert to the form of (1.xxx) * 2^(exponent)
        // 1.0110 0110 0110 0110 x 2^-1

        // Add bias to the exponent
        // -1 + 127 = 126

        // storing in memory
        // 0 | 0 1 1 1 1 1 1 0 | 0 1 1 0 0 1 1 0 0 1 1 0...

        // reverting back in the form of (-1)^sign x (1 + mantissa) x  2^(exponent - 127)
        // 1 x ( 1 + mantissa) x  2^(126 - 127)
        // mantissa -> 1/2^2 + 1/2^3 + 1/2^6 + 1/2^7 + 1/2^10 + 1/2^11 + 1/2^14 + 1/2^15 + 1/2^18 + 1/2^19 + 1/2^22 + 1/2^23
        // 0.25 + 0.125 + 0.015625 + 0.0078125 + 0.000976562 + ...
        // 0.399414062
        // 1.399414062 x 1/2
        // 0.699707031

        // Same issue happens with double, just the storage bits is 64 bits
        // 1 bit for sign, 11 bits for exponent, 52 bits for mantissa
        // bias for double is 1023

        // That's why we use Big Decimal

         BigDecimal bd = new BigDecimal(0.7);
         System.out.println(bd); // prints 0.6999999999999999555910790149937383830547332763671875

    }
}
