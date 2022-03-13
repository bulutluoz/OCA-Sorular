package s01_s10.s05_nullPointer;

public class NullPointerNedir {
    public static void main(String[] args) {

        /*
        int sayi=null;
        boolean bl=null;
        ptimitive data turleri icin null pointer kullanilamaz
        */

        // non-primitive tum data turlerinde null pointer kullanilabilir
        Integer sayi=null;
        Boolean bl=null;

        String str1;
        String str2= new String();
        String str3= "";
        String str4=null;

        // bir String'e deger atayabiliriz
        // bu 4 variable atama acisindan ayni durumdadir
        // hepsine yeni deger atanabilir ve yeni hali kullanilabilir
        //str4="java";
        //System.out.println(str4); // java


        // bir String'i yazdirabilirim
        //System.out.println(str4); //
        // str1 deger atamasi yapilmadigindan yazdirilamaz, alti kirmizi cizilir, kod calismaz
        // null atamasi yaptigimiz String yazdirildiginda null sonucunu goruruz
        // bu bir String degil, sadece str4'e null atandiginin isaretidir

        // bir String ile manipulation yapabilirim

        //System.out.println("Java " + str4);
        // str1 deger atamasi yapilmadigindan kullanilamaz, alti kirmizi cizilir, kod calismaz
        // str4 icin Java null yazdirir, islem yapilmasina itiraz etmez ama
        // str4'un null olarak isaretlendigini bize bildirir

        System.out.println(str4.length());
        // str1 deger atamasi yapilmadigindan kullanilamaz, alti kirmizi cizilir, kod calism
        // str4 icin NullPointerException verir


        //












    }
}
