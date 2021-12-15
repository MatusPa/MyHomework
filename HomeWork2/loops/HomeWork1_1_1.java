package HomeWork2.loops;

public class HomeWork1_1_1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        long mult = 1;
        for (long i = 1; i <= a; i++) {
            mult *= i;

            if(mult<=0){
                System.out.print("\nВВЕДЕНО НЕВЕРНОЕ ЧИСЛО");
                return;
            }
            if(i != a) {
                System.out.print(i + "*");
            } else {
                System.out.print(i +"=");
              }
        }
        System.out.print(mult);
    }
}

