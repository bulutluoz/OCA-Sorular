package s31_s40.s40_passByValue;
import java.util.Arrays;

public class PassByValue {

    public static void main(String[] args) {
        String str= "Java";
        int arr[]={1,2,3};
        method1(str);
        method2(arr);
        System.out.println(Arrays.toString(arr));
        method3(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(str);
    }
    private static void method3(int[] arr) {
        int yeniArr[]={10,11,12,13};
        arr=yeniArr;     }
    private static void method2(int[] arr) {
        arr[1]=4;
        arr[2]=3;     }
    private static void method1(String str) {
        str=str.toUpperCase();
    }

}
