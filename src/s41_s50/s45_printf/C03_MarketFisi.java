package s41_s50.s45_printf;

import java.util.Arrays;
import java.util.List;

public class C03_MarketFisi {
    /*
    verilen uc listeden
    urun ismi , urun miktari, urun birim fiyatini alip
    fis seklinde odenecek toplam tutari yazdiran bir program yazalim
    toplam tutarlarda virgulden sonra 2 basamak alinacak,sonrasi dikkate alinmayacaktir

    urunler = Domates, biber, patlican, elma, armut
    miktarlar= 1,2,3.5,2.5,6
    birim fiyatlari=2.3,2.29,4.1,2,3
    satis fisi
    Urun     miktar   br_fiyat urun_top
    ===================================
    Domates    1.00    €2.30   € 2.30
    biber      2.00    €2.29   € 4.58
    patlican   3.50    €4.10   €14.35
    elma       2.50    €2.00   € 5.00
    armut      6.00    €3.00   €18.00
    ===================================
    Genel toplam     15.50kg   35.56€
     */

    public static void main(String[] args) {
        String urun[]={"Domates", "biber", "patlican", "elma", "armut"};
        double brFiyat[]={2.3,2.29,4.1,2,3};
        double miktar[]={1,2,3.5,2.5,6};


        System.out.println("Urun      miktar   br_fiyat urun_top");
        System.out.println("====================================");
        for (int i = 0; i < urun.length ; i++) {
            System.out.printf("%-8s %5.2fkg    €%05.2f  €%05.2f\n",urun[i],miktar[i],brFiyat[i],miktar[i]*brFiyat[i]);
        }
        System.out.println("====================================");

        double toplamUrunMiktari=0;
        for (int i = 0; i < miktar.length ; i++) {
            toplamUrunMiktari+=miktar[i];
        }

        double toplamOdenecekPara=0;
        for (int i = 0; i < miktar.length ; i++) {
            toplamOdenecekPara+=miktar[i]*brFiyat[i];
        }

        System.out.printf("Genel toplam     %5.2fkg    €%5.2f",toplamUrunMiktari,toplamOdenecekPara);

    }
}
