package s01_s10.s06_dataCasting;

public class DataCastingNedir {
    public static void main(String[] args) {

        // primitive ve sayisal data turlerindeki verileri birbirine cevirmek

        // byte short int long float double
        // kucuk esya buyuk kaba otomatik olarak sigar

        byte sayi1= 15;

        short sayi2= sayi1;

        long sayi3= 1500;
        double sayi4= sayi3;

        //

        int sayi5= 65;
        short sayi6= (short)sayi5;

        sayi5=150;
        byte sayi7= (byte)sayi5;
        System.out.println(sayi7);


    }
}
