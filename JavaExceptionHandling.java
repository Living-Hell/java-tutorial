public class JavaExceptionHandling {
    public static void main(String[] args){
        // Exception
        // - Its an event that occurs during the execution of the program
        // - It will disrupt the normal flow of the program
        // - It creates the exception object, which contain information about the error like
        //      - Its type of exception and message
        //      - Stack trace, etc.
        // - Runtime system use this exception object and find the class which can handle it.
        // - If no one can handle the exception, runtime system will terminate the program abruptly and print stack trace

        // Exception Hierarchy
        // - Object
        //     - Throwable
        //         - Exception
        //             - Un- Checked/ RuntimeException
        //                  - ArithmeticException
        //                  - IndexOutOfBoundsException
        //                      - ArrayIndexOutOfBoundsException
        //                      - StringIndexOutOfBoundsException
        //                  - NullPointerException
        //                  - ClassCastException
        //                  - IllegalArgumentException
        //                      - NumberFormatException
        //              - Checked/ Compile Time Exception
        //                  - ClassNotFoundException
        //                  - InterruptedException
        //                  - IOException
        //                      - FileNotFoundException
        //                      - EOFException
        //                      - SocketTimeoutException
        //                  - SQLException
        //          - Error
        //              - OutOfMemoryError
        //              - StackOverflowError

        // Un-checked/ Runtime Exception
        // - These are the exceptions which occur during runtime and compiler not forcing us to handle them

        // Checked/ Compile Time Exception
        // - Compiler verifies them during the compile time of the code and if not handled properly, code compilation will fail.

        // We can handle the exception using "throws" keyword
        // "throws" tells that, this method MIGHT throw this exception (or might not), so, please caller, you handle it properly
        // Caller class then need to take care of this exception.

        // We can handle the exception using "try-catch block"
        // - try block is used to execute the code which might throw exception
        // - catch block is used to handle the exception

        

    }
}
