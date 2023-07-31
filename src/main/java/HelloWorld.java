package main.java;

public class HelloWorld{
    // a single line comment
    /*
     * a
     * multi
     * line
     * comment
     */

    // method - reusable code
    public static int favoriteNumber(){
        return 22;
    }

     // This main method is a special program in Java
     // Every program needs a main method to run
     // Why? Bc it is the entry point of that application
    public static void main(String[] args){
        // this is our method implementation

        /*
         * Java is an Object Oriented Language
         * We create clases to act as blueprints
         * However, not everything in Java is an object
         * 
         * There are 8 primitive types in Java
         * //Whole Numbers                      Size
         * byte                                 1 byte (8 bit) : -128 : 127
         * int                                  4 bytes (32 bits)
         * float                                4 bytes (32 bits)
         * double                               8 bytes (64 bits)
         * short                                2 bytes (16 bits): -32,768:32,767
         * long                                 8 bytes (64 bits)
         * 
         * single ASCII values
         * char                                 2 bytes (16 bits)
         * 
         * boolean (true or false values)       1 bit
         */


        // These are variables : portable, reusable values
        // syntax: <access modifier><data type><name> = <value>
        int intValue = 1000000000;
        byte byteValue = 127;
        
        System.out.println(favoriteNumber());
    }
}