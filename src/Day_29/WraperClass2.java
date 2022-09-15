package Day_29;

public class WraperClass2 {
    public static void main(String[] args) {
        //Value()
        Integer I=10;
        int i=I.intValue();
        System.out.println("i = " + i);

        Byte B=100;
        byte b=B.byteValue();
        System.out.println("b = " + b);
        Boolean BL=true;
        boolean bl=BL.booleanValue();
        System.out.println("bl = " + bl);


        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.sum(10,20) = " + Integer.sum(10, 20));
        System.out.println("Double.max(10,30) = " + Double.max(10, 30));

        System.out.println("Character.isDigit('a') = " + Character.isDigit('a'));
        System.out.println("Character.isDigit('9') = " + Character.isDigit('9'));//rakam mı
        System.out.println("Character.isLetter('4') = " + Character.isLetter('4'));
        System.out.println("Character.isLetter('a') = " + Character.isLetter('a'));//harf mi

        System.out.println("Character.isAlphabetic('a') = " + Character.isAlphabetic('a'));//harf
        System.out.println("Character.isAlphabetic('8') = " + Character.isAlphabetic('8'));

        System.out.println("Character.isUpperCase('a') = " + Character.isUpperCase('a'));
        System.out.println("Character.isUpperCase('A') = " + Character.isUpperCase('A'));
        System.out.println("Character.isUpperCase('b') = " + Character.isLowerCase('b'));
        System.out.println("Character.isUpperCase('B') = " + Character.isLowerCase('B'));


    }
}
