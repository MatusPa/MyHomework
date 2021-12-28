package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoSuper;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calcu = new CalculatorWithCounterAutoSuper();
            // 4.1 + 15 * 7 + (28 / 5) ^ 2

            double  res1 = calcu.division(28,5);
            double  res2 = calcu.exponentiation(res1,2);
            double  res3 = calcu.multiply(15,7);
            double  res4 = calcu.addition(4.1,res3);
            double  res5 = calcu.addition(res4,res2);

        System.out.println("Result: " + res5);
        System.out.println("Count: "+ calcu.getCountOperation());
    }
}








