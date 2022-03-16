package s11_s20.s13_whileLoop;

public class WhileLoop {
    public static void main(String[] args) {
        int x = 0;


        while(x++ < 10) { }

        String message = x > 10 ? "Greater than" : "false";

        System.out.println(message+","+x);
        }
    }
    /*
    A. Greater than,10
    B. false,10
    C. Greater than,11
    D. false,11
    E. 6. Satirdan dolayi kod calismaz.
    F. 7. Satirdan dolayi kod calismaz.
    */

