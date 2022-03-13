package s01_s10.s09_stringManipulation;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s = "purr";
        s.toUpperCase();
        s.trim();
        s.substring(1, 3);
        s += " two";
        System.out.println(s.length());

        /*
        A. 2
        B. 4
        C. 8
        D. 10
        E. Kod exception olusturur.
        F. Kod calismaz.
        */
    }
}
