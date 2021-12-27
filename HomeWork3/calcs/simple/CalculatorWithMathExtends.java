package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
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
}
