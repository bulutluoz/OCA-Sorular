package s41_s50.s43_varargs;

public class Varargs {
    void m1(int a, int... b){

        System.out.println(b.length);
    }
    void m1(char c, String... d){

        System.out.println(d.length);
    } /*
    void m1(String... e, int f){
        System.out.println(e.length);
    }
     */
    public static void main(String[] args) {

        Varargs vrg=new Varargs();
        vrg.m1(3,4,5,6,7);
        //vrg.m1(67,"Hello","Hi");
        vrg.m1('c',75,80,90);
        vrg.m1('d',"Hello");
    }
}
