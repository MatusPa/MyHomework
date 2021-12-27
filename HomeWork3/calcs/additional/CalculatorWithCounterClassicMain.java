package HomeWork3.calcs.additional;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calcula = new CalculatorWithCounterClassic();
        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        double  res1 = calcula.division(28,5);
        calcula.incrementCountOperation();
        double  res2 = calcula.exponentiation(res1,2);
        calcula.incrementCountOperation();
        double  res3 = calcula.multiply(15,7);
        calcula.incrementCountOperation();
        double  res4 = calcula.addition(4.1,res3);
        calcula.incrementCountOperation();
        double  res5 = calcula.addition(res4,res2);
        calcula.incrementCountOperation();

        System.out.println("Result: " + res5);
        System.out.println("Count: "+ calcula.getCountOperation());

    }
}
