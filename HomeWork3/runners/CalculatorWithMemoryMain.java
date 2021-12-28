package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithMemory;
import HomeWork3.calcs.api.ICalculator;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory();
        double  res1 = calculator.delenie(28,5);
        System.out.println(calculator.getAndCleanMemory());
        double  res2 = calculator.expontiation(res1,2);
        System.out.println("Memory: " + calculator.getAndCleanMemory());

        double  res3 = calculator.multiply(15,7);
        System.out.println(calculator.getAndCleanMemory());

        double  res4 = calculator.sum(4.1,res3);
        System.out.println("Memory: " + calculator.getAndCleanMemory());

        double  res5 = calculator.sum(res4,res2);
        System.out.println("Memory: " + calculator.getAndCleanMemory());


        System.out.println("Result: " + res5);
        System.out.println("Memory: " + calculator.getAndCleanMemory());
    }

}
