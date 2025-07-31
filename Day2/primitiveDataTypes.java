

public class primitiveDataTypes {
    public static void main(String[] args) {
        // Primitive data types
        byte myByte = 127;             // 1 byte
        short myShort = 32000;         // 2 bytes
        int myInt = 100000;            // 4 bytes
        long myLong = 15000000000L;    // 8 bytes, ends with 'L'

        float myFloat = 5.75f;         // 4 bytes, ends with 'f'
        double myDouble = 19.99;       // 8 bytes

        char myChar = 'A';             // 2 bytes
        boolean myBool = true;         // 1 bit

        // Output
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);

        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);

        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBool);
    }
}
