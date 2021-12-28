package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    long count;

    @Override
    public double addition(double num1, double num2) {
        count++;
        return super.addition(num1, num2);
    }

    @Override
    public double subtraction(double num1, double num2) {
        count++;
        return super.subtraction(num1, num2);
    }

    @Override
    public double multiply(double num1, double num2) {
        count++;
        return super.multiply(num1, num2);
    }

    @Override
    public double division(double num1, double num2) {
        count++;
        return super.division(num1, num2);
    }

    @Override
    public double exponentiation(double num1, double num2) {
        count++;
        return super.exponentiation(num1, num2);
    }

    @Override
    public double module(double num) {
        count++;
        return super.module(num);
    }

    @Override
    public double root(double num1) {
        count++;
        return super.root(num1);
    }
    public long getCountOperation(){
        return count;
    }

}






