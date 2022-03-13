package s01_s10.s02_ternary;

public class Ternary {
    public static void main(String[] args) {

        int x =5 ;

        System.out.println(x>2 ? x <4 ? 10 : 8 : 7 );


        // verilen bir sayinin tek veya cift oldugunu yazdiran bir kod olusturalim

        int sayi= 20;
        if (sayi%2==0){
            System.out.println("sayi cift bir sayidir");
        } else {
            System.out.println("Sayi tek bir sayidir");
        }

        System.out.println(sayi%2==0 ? "Sayi Cift" : "Sayi Tek");


    }
}
