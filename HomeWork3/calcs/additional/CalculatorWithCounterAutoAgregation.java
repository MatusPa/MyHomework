package HomeWork3.calcs.additional;


import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregation {
    long count;
    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithMathExtends calculatorWithMathExtends;


    public CalculatorWithCounterAutoAgregation(CalculatorWithMathExtends calculatorWithMathExtends,
                                               CalculatorWithMathCopy calculatorWithMathCopy,
                                               CalculatorWithOperator calculatorWithOperator) {

        this.calculatorWithMathCopy = calculatorWithMathCopy;
        this.calculatorWithMathExtends = calculatorWithMathExtends;
        this.calculatorWithOperator = calculatorWithOperator;
    }




    public double sum(double num1, double num2){
        double sum = calculatorWithOperator.addition(num1,num2);
        count++;
        return sum;
    }
    public double vychet(double num1, double num2 ){
        double v = calculatorWithMathCopy.subtraction(num1,num2);
        count++;

        return v;
    }
    public double delenie (double num1, double num2){
        double d = calculatorWithMathExtends.division(num1,num2);
        count++;

        return d;
    }
    public double multiply (double num1, double num2){
        double m = calculatorWithMathCopy.multiply(num1, num2);
        count++;

        return m;
    }
    public double module(double num){
        double m = calculatorWithOperator.module(num);
        count++;

        return m;

    }
    public double expontiation (double num,double num1){
        double exp =calculatorWithMathExtends.exponentiation(num,num1);
        count++;
        return exp;

    }
    public double root (double num){
        double n = calculatorWithMathExtends.root(num);
        count++;
        return n;
    }
    long getCountOperation(){
        return count;
    }

}










