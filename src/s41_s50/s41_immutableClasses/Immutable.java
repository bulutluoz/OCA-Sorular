package s41_s50.s41_immutableClasses;

public class Immutable {
    public static void main(String[] args) {
        String s = "Hello";
        String t = new String(s);
        if ("Hello".equals(s)) System.out.println("one");
        if (t == s) System.out.println("two");
        if (t.equals(s)) System.out.println("three");
        if ("Hello" == s) System.out.println("four");
        if ("Hello" == t) System.out.println("five");

    }
}
    /*
        A. one
        B. two
        C. three
        D. four
        E. five
        F. Kod Calismaz.
     */