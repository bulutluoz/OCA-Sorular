package s21_s30.s26_lists;

import java.util.ArrayList;

public class Lists02 {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(5);
        values.set(1, 6);
        values.remove(0);
        for (int i = 0; i < values.size() ; i++)
            System.out.print(values.get(i));

        /*
        A. 4
        B. 5
        C. 6
        D. 46
        E. 45
        F. exception olusur.
        G. Kod calismaz.

         */
    }
}
