package odevler.bolum01;

public class Q11 {
    public static void main(String[] args) {
        int s= 365*24*60*60;
        int birth = s/7;
        int death = s/13;
        int immigrant = s/45;
        int population =312032486;

        int p1=population+immigrant+birth-death;
        System.out.println(p1);
        int p2=p1+immigrant+birth-death;
        System.out.println(p2);
        int p3=p2+immigrant+birth-death;
        System.out.println(p3);
        int p4=p3+immigrant+birth-death;
        System.out.println(p4);
        int p5=p4+immigrant+birth-death;
        System.out.println(p5);
    }
}
