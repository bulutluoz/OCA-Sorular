package s31_s40.s32_methodKullanimi;

public class MethodKullanimi {
    public static void addToInt(int x, int amountToAdd) {
        x = x + amountToAdd;
        }
    public static void main(String[] args) {
            int a = 15;
            int b = 10;
            MethodKullanimi.addToInt(a, b);
            System.out.println(a);
    }
}

        /*
        A. 10
        B. 15
        C. 25
        D. 5.satirdan dolayi kod calismaz
        E. 10.satirdan dolayi kod calismaz
        F. Yukaridakilerden hicbiri.
         */