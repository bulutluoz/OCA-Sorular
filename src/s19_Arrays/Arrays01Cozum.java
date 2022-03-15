package s19_Arrays;

import java.util.Arrays;

public class Arrays01Cozum {
    public static void main(String[] args) {


        int[][] scores = new int[5][];
        // int[][] scores = new int[5][];

        Object[][][] cubbies = new Object[3][0][5];
        // [[], [], []]

        Object[][][] cubbies2 = new Object[3][1][5];
        // [[[null, null, null, null, null]], [[null, null, null, null, null]], [[null, null, null, null, null]]]




        System.out.println(Arrays.deepToString(cubbies2));
    }
}
