package s31_s40.s38_Constructor;

public class Cons {
    public static int length=0;
}

class ConsLength {
    static Cons cons1=new Cons();
    static Cons cons2=new Cons();
    static  {
        System.out.print(cons1.length);
    }
    public static void main(String[] args) {

        cons1.length=2;
        cons2.length=8;

        System.out.println(cons1.length);
    }
}
            /*
            A. 02
            B. 08
            C. 2
            D. 8
            E. Kod calismaz.
            F. Kod calisir ancak exception olusur.
             */



