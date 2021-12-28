package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();
        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        double  res1 = calc.division(28,5);
        double  res2 = calc.exponentiation(res1,2);
        double  res3 = calc.multiply(15,7);
        double  res4 = calc.addition(4.1,res3);
        double  res5 = calc.addition(res4,res2);

        System.out.println("Result: " + res5);
    }
}
