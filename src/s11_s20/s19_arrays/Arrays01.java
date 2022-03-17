package s11_s20.s19_arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        /*
        int arr[] = { 3, 4, 5};
        String arr2[] = new String[20];
         */


        int[][] scores = new int[5][];
        System.out.println(Arrays.deepToString(scores)); // [null, null, null, null, null]
        Object[][][] cubbies = new Object[3][0][5];
        System.out.println(Arrays.deepToString(cubbies)); // [[], [], []]

        //String beans[] = new beans[6]; // data turu yerine isim yazilmis

        //int[][] types = new int[]; // sol taraf iki katli array dolayisiyla sag tarafin da
                                    // iki katli olmasi ve length yazilmasi gerekir


        // int[][] java = new int[][]; // length yazilmadigi icin CTE verir







    }
}
