package home_work_1;

public class HomeWorkT1 {
    public static void main(String[] args) {
        int a = 42; //  101010
        int b = 15; //  1111

        int c = a & b;  //  1010
        System.out.println(c);

        a = 42; //  101010
        b = 15; //  1111
        int d = a &= b;
        System.out.println(d); //   1010

        a = 42; //  101010
        b = 15; //  1111
        int g = a | b ;  //  101111
        System.out.println(g);

        a = 42; //  101010
        b = 15; //  1111
        int f = a |= b ; //  101111
        System.out.println(f);

        a = 42; //  101010
        b = 15; //  1111
        int h = a ^ b ;  //  100101
        System.out.println(h);

        a = 42; //  101010
        b = 15; //  1111
        int i = a ^ b ; //  100101
        System.out.println(i);

        a = 42; //  101010
        b = 15; //  1111
        int j = a >> 2; // 1010
        System.out.println(j);


        a = 42; //  101010
        b = 15; //  1111
        int k = a << 2; //  10101000
        System.out.println(k);


        a = 42; //  101010
        b = 15; //  1111
        int l = a >>> 2;    // 1010
        System.out.println(l);


        a = 42; //  101010
        b = 15; //  1111
        int m = a >>= 2;    //  1010
        System.out.println(m);

        a = 42; //  101010
        b = 15; //  1111
        int n = a >>>= 2;   //  1010
        System.out.println(n);





    }


}

