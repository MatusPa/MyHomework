package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
         CalculatorWithOperator calc = new CalculatorWithOperator();

        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        double  res1 = calc.division(28,5);
        double  res2 = calc.exponentiation(res1,2);
        double  res3 = calc.multiply(15,7);
        double  res4 = calc.addition(4.1,res3);
        double  res5 = calc.addition(res4,res2);

        System.out.println("Result: " + res5);


    }
}
