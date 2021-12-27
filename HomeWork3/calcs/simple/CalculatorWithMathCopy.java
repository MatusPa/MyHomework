package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    @Override
    public double addition(double num1, double num2) {
        double add = num1 + num2;
        return add;
    }
    @Override
    public double subtraction(double num1, double num2) {
        double sub = num1 - num2;
        return sub;
    }
    @Override
    public double multiply(double num1, double num2) {
        double mult = num1 * num2;
        return mult;
    }
    @Override
    public double division(double num1, double num2) {
        double div = num1 / num2;
        return div;
    }
    @Override
    public double exponentiation (double num1, double num2){
        double exp = Math.pow(num1,num2);
        return exp;
    }
    @Override
    public double module (double num){
        double mod = Math.abs(num);
        return mod;
    }
    @Override
    public double root (double num1){
        double root = Math.sqrt(num1);
        return root;
    }
}
