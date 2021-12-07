package home_work_1;

public class HomeWorkT2 {
    public static void main(String[] args) {
        //2.1
        int a = 2;
        int b = 8;

        int k = 5 + 2 / 8;  // Результат = 5 ;        2 / 8 = 0
        System.out.println(k);

        //2.2
        int l =(5 + 2) / 8; // Результат = 0;       7/8 = 0
        System.out.println(l);

        //2.3
        int m = (5 + a++) / 8;   //  Результат = 0
        System.out.println(m);

        //2.4
        a = 2;
        b = 8;
        int n = (5 + a++) / --b; //  Результат = 1
        System.out.println(n);

        //2.5
        a = 2;
        b = 8;
        int o = (5 * 2 >> a++) / --b;    //   Результат = 0
        System.out.println(o);

        //2.6
        a = 2;
        b = 8;
        int p = (5 + 7 > 20 ? 68 : 22 * 2 >> a++) / --b;    //   Результат = ошибка
        System.out.println(p);

        /*
        a = 2;
        b = 8;
        int r = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> a++) / --b;  //  Результат = ошибка
        System.out.println(r);*/





        boolean s = 6 - 2 > 3 && 12 * 12 <= 119; // false  потому что true and false = false
        System.out.println(s);

        boolean t = true && false;// false АНАЛОГИЧНО
        System.out.println(t);


    }
}
