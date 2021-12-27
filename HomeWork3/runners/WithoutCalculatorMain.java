package HomeWork3.runners;

import HomeWork3.Calculator;

public class WithoutCalculatorMain extends Calculator {
    public static void main(String[] args) {
        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        double res1 =calculateInput(15,7,'*');    //  105.0
        double res2 = calculateInput(28,5,'/');  //   5.6
        double res3 =calculateInput(res2,2,'^');       //   31.359999999999996
        double res4 =calculateInput(res1,res3,'+');         //    136.35999999999999
        double res5 =calculateInput(4.1,res4,'+');     //   140.45999999999998

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println("Result: " + res5);
    }
    public static void oneMoreCalculation() {
        double res1 = (double)28 /5;        //  5.6
        double res2 = Math.pow(res1,2);     //  31.359999999999996
        int res3 = 15*7;                    //105
        double result = 4.1 + res3 + res2;  //  140.45999999999998


    }
}
