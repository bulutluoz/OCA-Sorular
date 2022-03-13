package s01_s10.s08_stringManipulations;

public class StringManipulations01 {
    public static void main(String[] args) {

        String numbers = "012345678";
        System.out.println(numbers.substring(1, 3));
        System.out.println(numbers.substring(7, 7));
        System.out.println(numbers.substring(7));

        /*
        A. 12
        B. 123
        C. 7
        D. 78
        E. A blank line.
        F. An exception is thrown.
        G. The code does not compile.

         */
    }

}
