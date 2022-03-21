package s21_s30.s28_lists;

import java.util.Arrays;
import java.util.List;

public class List04 {
    public static void main(String[] args) {
        String [] names = {"Tom", "Dick", "Harry"};
        List<String> list = Arrays.asList(names); //names.asList();
        list.set(0, "Sue");
        System.out.println(names[0]);
        
        /*
        A. Sue
        B. Tom
        C. 8. Satirdan dolayi kod calismaz.
        D. 9. Satirdan dolayi kod calismaz.
        E. Kod exception olusturur.

         */
    }
}
