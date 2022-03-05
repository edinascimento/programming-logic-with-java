public class TestandoVariaveis {
    public static void main(String[] args) {
        // Java tipos primitivos
        // boolean -> bits
        // char    -> 16 bits
        // byte    -> 8 bits
        // short   -> 16 bits
        // int     -> 32 bits
        // long    -> 64 bits
        // float   -> 32 bits
        // double  -> 64 bits

        char character = 65;
        System.out.println(character);

        char female = 'F';
        char male = 'M';

        String noPrimitiveDataType = "A huge sentence goes here";

        System.out.println("Gender: " + female);
        System.out.println("Gender: " + male);

        System.out.println("String is: " + noPrimitiveDataType);

        // Special primitive data type....
        boolean isMarried = true;
        System.out.println("Am I married: " + isMarried);

    }
}