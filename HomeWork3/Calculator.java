package HomeWork3;

import java.util.Scanner;

public class Calculator {
   static Scanner sc = new Scanner(System.in);

    public static double calculateConsole() {
        double num1 = getNum();
        double num2 = getNum();
        char operation = getOperation();
        double result = calc(num1,num2,operation);
        return result;
    }
    public static double calculateInput(double num1,double num2, char operation){
        double result = calc(num1,num2,operation) ;
        return result;
    }

    public static double getNum() {

        System.out.println("Введите число");
        double num = sc.nextDouble();
        return num;
    }

    public static char getOperation() {
        System.out.println("Введите вид операции между числами");

        char operation = sc.next().charAt(0);
        return operation;
        }
    public static double calc(double num1, double num2, char operation){
        double result;
        switch (operation){
            case '+' : result =  num1 + num2;
            break;
            case '-' : result =  num1 - num2;
            break;
            case '*' : result =  num1 * num2;
                break;
            case '/' : result =  num1 / num2;
            break;
            case '^' : result =  Math.pow(num1,num2);
            break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());

        }
    return result;
    }
}




