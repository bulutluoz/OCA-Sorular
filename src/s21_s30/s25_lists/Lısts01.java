package s21_s30.s25_lists;

import java.util.ArrayList;
import java.util.List;

public class Lısts01 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        //list.add(7);
        for (int i = 0; i < list.size() ; i++)
            System.out.print(list.get(i));



        /*
        A. onetwo
        B. onetwo7
        C. onetwo yazar ve sonra exception olusur
        D. 12. Satirdan dolayi kod calismaz.
        E. 14. Satirdan dolayi kod calismaz.
         */

    }

}
