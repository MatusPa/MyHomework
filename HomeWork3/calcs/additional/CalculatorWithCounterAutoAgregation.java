package HomeWork3.calcs.additional;


import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregation {
    long count;
    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithMathExtends calculatorWithMathExtends;


    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator calculator) {
        if(calculator != null)
            this.calculatorWithMathCopy = null;
            this.calculatorWithMathExtends = null;
            this.calculatorWithOperator = calculator;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathExtends calculator) {
        if(calculator != null)
            this.calculatorWithMathCopy = null;
        this.calculatorWithMathExtends = calculator;
        this.calculatorWithOperator = null;
    }

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculator) {
        if(calculator != null)
            this.calculatorWithMathCopy = calculator;
        this.calculatorWithMathExtends = null;
        this.calculatorWithOperator = null;
    }





    public double sum(double num1, double num2){
        count++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.addition(num1, num2);
        }
        if (calculatorWithMathCopy != null){
            return calculatorWithMathCopy.addition(num1,num2);
        }
        else {
            return calculatorWithMathExtends.addition(num1, num2);
        }

    }
    public double vychet(double num1, double num2 ){
            count++;
            if (calculatorWithOperator != null) {
                return calculatorWithOperator.subtraction(num1, num2);
            }
            if (calculatorWithMathCopy != null) {
                return calculatorWithMathCopy.subtraction(num1, num2);
            }
            else {
                return calculatorWithMathExtends.subtraction(num1, num2);
            }
        }
    public double delenie (double num1, double num2){
                count++;
                if (calculatorWithOperator != null) {
                    return calculatorWithOperator.division(num1, num2);
                }
                if (calculatorWithMathCopy != null) {
                    return calculatorWithMathCopy.division(num1, num2);
                }
                else{
                    return calculatorWithMathExtends.division(num1, num2);
                }
            }
    public double multiply (double num1, double num2){
                    count++;
                    if (calculatorWithOperator != null) {
                        return calculatorWithOperator.multiply(num1, num2);
                    }
                    if (calculatorWithMathCopy != null) {
                        return calculatorWithMathCopy.multiply(num1, num2);
                    }
                    else{
                        return calculatorWithMathExtends.multiply(num1, num2);
                    }
                }
    public double module(double num){
                        count++;
                        if (calculatorWithOperator != null) {
                            return calculatorWithOperator.module(num);
                        }
                        if (calculatorWithMathCopy != null){
                            return calculatorWithMathCopy.module(num);
                        }
                        else{
                            return calculatorWithMathExtends.module(num);
                        }
    }
    public double expontiation (double num,double num1){
                            count++;
                            if (calculatorWithOperator != null) {
                                return calculatorWithOperator.exponentiation(num,num1);
                            }
                            if (calculatorWithMathCopy != null){
                                return calculatorWithMathCopy.exponentiation(num,num1);
                            }
                            else {
                                return calculatorWithMathExtends.exponentiation(num, num1);

                            }
    }
    public double root (double num){
        count++;
        if (calculatorWithOperator != null) {
            return calculatorWithOperator.root(num);
        }
        if (calculatorWithMathCopy != null){
            return calculatorWithMathCopy.root(num);
        }
        else{
            return calculatorWithMathExtends.root(num);
        }
    }
    public long getCountOperation(){
        return count;
    }

}










