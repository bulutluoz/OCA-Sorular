package s17_scope;
public class Scope {
    public static void main(String[] args) {
        int x=1;


        do {
            int y = 1;
            System.out.print(y++ + " ");
            } while(x <= 10); // soruda y CTE icin x yaptim


        /*
        A. 1 2 3 4 5 6 7 8 9
        B. 1 2 3 4 5 6 7 8 9 10
        C. 1 2 3 4 5 6 7 8 9 10 11
        D. 10. Satirdan dolayi kod calismaz.
        E. Kod sonsuz bir donguye girer.
         */
    }
}
