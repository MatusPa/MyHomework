package HomeWork2.loops;

import java.util.Scanner;

public class HomeWork1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число");
        Double chislo =input.nextDouble();
        System.out.println("Введите степень");

        int stepen = input.nextInt();
        double result = 1;
        for (int i = 1; i <=stepen; i++) {
            result *= chislo;
        }
        System.out.println(chislo +" ^ " + stepen + " = " + result );
    }

}
