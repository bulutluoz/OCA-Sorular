package s31_s40.s36_constructorThisKullanimi;

public class Constructor02 {
    int num;
    public Constructor02(int num) {
        // INSERT CODE HERE
        this.num = num;
    }
    public static void main(String[] args) {
        System.out.println(new Constructor02(50).num);
    }
}

        /*
        A. num = num;
        B. num = this.num;
        C. this.num = num;
        D. Yukaridakilerden hicbiri
         */
