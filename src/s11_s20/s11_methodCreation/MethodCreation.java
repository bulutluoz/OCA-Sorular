package s11_s20.s11_methodCreation;

public class MethodCreation {

        public static long square(int x) {
            long y = x * (long) x;
            x = -1;
            return y;
            }
        public static void main(String[] args) {
            int value = 9;
            long result = square(value);
            System.out.println(value);
            }
    }
    /*
        A. -1
        B. 9
        C. 81
        D. 12. Satirdan dolayi Compile error olusur.
        E. Baska bir satirdan dolayi Compile error olusur.
     */

