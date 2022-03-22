package s34_nestedLoop;

public class NestedLoop {
    public static void main(String[] args) {
         int x = 5, j = 0;
         OUTER: for(int i=0; i<3; )
            INNER: do {
                  i++; x++;
                  if(x > 10) break INNER;
                  x += 4;
                  j++;
                  } while(j <= 2);
         System.out.println(x);
    } }



        /*
        A. 10
        B. 12
        C. 13
        D. 17
        E. The code will not compile because of line 4.
        F. The code will not compile because of line 6.
        */