package s21_s30.s29_forLoop;

public class ForLoop {
    public static void main(String[] args) {
        int sayi = 0;
        int sum=0;

        for (sayi = 3; sayi>1 ; sayi/=sayi++)
            sum+=sayi;

        System.out.println(sum);
    }
}


        /*
            A. sonsuz loop olusur
            B. 1
            C. 3
            D. 8.satirdan dolayi kod calismaz
            E. Kod calistirilirsa exception olusur
         */