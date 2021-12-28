package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregationInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregationInterface calc
                = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        CalculatorWithCounterAutoAgregationInterface calc1 = new CalculatorWithCounterAutoAgregationInterface
                (new CalculatorWithMathCopy());
        CalculatorWithCounterAutoAgregationInterface calc2 = new CalculatorWithCounterAutoAgregationInterface
                (new CalculatorWithMathExtends());


        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        double  res1 = calc.delenie(28,5);
        double  res2 = calc2.expontiation(res1,2);
        double  res3 = calc1.multiply(15,7);
        double  res4 = calc2.sum(4.1,res3);
        double  res5 = calc.sum(res4,res2);

        System.out.println("Result: " + res5);
        System.out.println("Count: "+ (calc.getCountOperation() +
                calc1.getCountOperation()+ calc2.getCountOperation()));


    }
}
