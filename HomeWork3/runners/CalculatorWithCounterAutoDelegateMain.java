package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoAgregation;
import HomeWork3.calcs.additional.CalculatorWithCounterAutoComposite;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;


public class CalculatorWithCounterAutoDelegateMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregation calculator =
                new CalculatorWithCounterAutoAgregation(new CalculatorWithMathExtends());

        CalculatorWithCounterAutoComposite calculator1 = new CalculatorWithCounterAutoComposite();

        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        double  res1 = calculator1.delenie(28,5);
        double  res2 = calculator.expontiation(res1,2);
        double  res3 = calculator1.multiply(15,7);
        double  res4 = calculator.sum(4.1,res3);
        double  res5 = calculator.sum(res4,res2);

        System.out.println("Result1: " + res1);
        System.out.println("Result2: " + res2);
        System.out.println("Result3: " + res3);
        System.out.println("Result4: " + res4);
        System.out.println("ResultFinal: " + res5);
        System.out.println("Count: "+( calculator.getCountOperation() +calculator1.getCountOperation()));

    }

}























