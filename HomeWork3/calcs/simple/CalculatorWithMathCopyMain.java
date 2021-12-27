package HomeWork3.calcs.simple;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calcul = new CalculatorWithMathCopy();
        // 4.1 + 15 * 7 + (28 / 5) ^ 2

        double  res1 = calcul.division(28,5);
        double  res2 = calcul.exponentiation(res1,2);
        double  res3 = calcul.multiply(15,7);
        double  res4 = calcul.addition(4.1,res3);
        double  res5 = calcul.addition(res4,res2);

        System.out.println("Result: " + res5);

    }

}
