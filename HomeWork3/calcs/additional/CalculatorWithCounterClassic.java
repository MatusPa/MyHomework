package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    long count;
    public void incrementCountOperation(){
        count++;
    }
     public long getCountOperation(){
        return count;
    }


}
