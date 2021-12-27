package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    long count;
    void incrementCountOperation(){
        count++;
    }
    long getCountOperation(){
        return count;
    }


}
