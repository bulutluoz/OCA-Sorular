package s21_s30.s27_lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class List03 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 4, -1, 5);
        Collections.sort(list);
        Integer array[] = list.toArray(new Integer[4]);
        System.out.println(array[0]);

        /*
        A. –1
        B. 10
        C. 10. Satirdan dolayi kod calismaz.
        D. 11. Satirdan dolayi kod calismaz.
        E. 12. Satirdan dolayi kod calismaz.
        F. Kod exception olusturur.
         */
    }
}
