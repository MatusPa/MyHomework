package HomeWork3.calcs.additional;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {
    private ICalculator iCalculator;
    private long count;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator iCalculator){
        this.iCalculator = iCalculator;
   }
    public double sum(double num1, double num2){
        double sum = iCalculator.addition(num1,num2);
        count++;
        return sum;
    }
    public double vychet(double num1, double num2 ){
        double v = iCalculator.subtraction(num1,num2);
        count++;

        return v;
    }
    public double delenie (double num1, double num2){
        double d = iCalculator.division(num1,num2);
        count++;

        return d;
    }
    public double multiply (double num1, double num2){
        double m = iCalculator.multiply(num1, num2);
        count++;

        return m;
    }
    public double module(double num){
        double m = iCalculator.module(num);
        count++;

        return m;

    }
    public double expontiation (double num,double num1){
        double exp =iCalculator.exponentiation(num,num1);
        count++;
        return exp;

    }
    public double root (double num){
        double n = iCalculator.root(num);
        count++;
        return n;
    }
    long getCountOperation(){
        return count;
    }



}
