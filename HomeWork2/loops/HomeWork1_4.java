package HomeWork2.loops;

public class HomeWork1_4 {
    public static void main(String[] args) {
        long a=1;
        int stepenb = 1;
        for (int i = 1; a >0 ; i++) {
            a*=3;
            stepenb =  i;
        }
        System.out.println("После переполнения: " + a);
        a =1;
        for (int i = 1; i!=stepenb; i++) {
            a*=3;
        }
        System.out.println("До переполнения: "+ a);
    }
}
