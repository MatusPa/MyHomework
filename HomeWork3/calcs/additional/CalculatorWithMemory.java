package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMemory {
    double memory;
    long count;
    private CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();






    public double sum(double num1, double num2){
        double sum = calculatorWithMathExtends.addition(num1,num2);
        count++;
        memory = sum;

        return sum;
    }
    public double vychet(double num1, double num2 ){
        double v = calculatorWithMathExtends.subtraction(num1,num2);
        count++;
        memory = v;

        return v;
    }
    public double delenie (double num1, double num2){
        double d = calculatorWithMathExtends.division(num1,num2);
        count++;
        memory = d;
        return d;
    }
    public double multiply (double num1, double num2){
        double m = calculatorWithMathExtends.multiply(num1, num2);
        count++;
        memory = m;
        return m;
    }
    public double module(double num){
        double m = calculatorWithMathExtends.module(num);
        count++;
        memory = m;
        return m;

    }
    public double expontiation (double num,double num1){
        double exp =calculatorWithMathExtends.exponentiation(num,num1);
        count++;
        memory = exp;
        return exp;

    }
    public double root (double num){
        double n = calculatorWithMathExtends.root(num);
        count++;
        memory = n;
        return n;
    }
    long getCountOperation(){
        return count;
    }


    public double getMem() {
        return memory;
    }
    public double getAndCleanMemory(){
        double a = getMem();
        memory = 0;
        return a;
    }
}
