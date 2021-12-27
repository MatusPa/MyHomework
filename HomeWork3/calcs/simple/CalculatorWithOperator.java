package HomeWork3.calcs.simple;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoAgregation;
import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    CalculatorWithCounterAutoAgregation calculatorWithCounterAutoAgregation;
    @Override
    public double addition (double num1, double num2){
        return num1 + num2;
    }
    @Override
    public double subtraction (double num1, double num2){
        return num1 - num2;
    }
    @Override
    public double multiply (double num1, double num2){
        double mult = num1 * num2;
        return mult;
    }
    @Override
    public double division (double num1, double num2){
        double div = num1 / num2;
        return div;
    }
    @Override
    public double exponentiation (double num1, double num2){
        double exp = num1;
        for (int i = 1; i < num2; i++) {
            exp *= num1;
        }
        return exp;
    }
    @Override
    public double module (double num){
        double mod;
        if (num>=0){
            mod = num;
        }
        else{
            mod = num*(-1);
        }
        return mod;
    }
    @Override
    public double root (double num1){
        double root = Math.sqrt(num1);
        return root;
    }
}
