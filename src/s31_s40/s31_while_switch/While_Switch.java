package s31_s40.s31_while_switch;

public class While_Switch {

    public static void main(String[] args) {
        boolean keepGoing = true;
        int count = 0;
        int x = 3;
        int sayac=1;
        while(count++ < 3) {
            int y = (1 + 2 * count) % 3;
            switch(y) {
                default:
                case 0: x -= 1; break;
                case 1: x += 5;
                 }
            }
        System.out.println(x);
        }
    }
        /*
        A. 4
        B. 5
        C. 6
        D. 7
        E. 13
        F. 11.satirdan dolayi kod calismaz
         */
