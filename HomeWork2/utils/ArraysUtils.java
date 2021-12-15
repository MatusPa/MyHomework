package HomeWork2.utils;

import java.util.Scanner;
// Задание 2.1
public class ArraysUtils {
    public static  int[] arrayFromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int razmer = sc.nextInt();
        int[] massiv;
        massiv = new int[razmer];
        int element;
        for (int i = 0; i <massiv.length ; i++) {
            System.out.println("Введите следующий элемент массива");
            element = sc.nextInt();
            massiv[i] = element;
        }
        return massiv;
    }
    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] massiv = new int[size];
        for (int i = 0; i <massiv.length ; i++) {
            massiv[i] = (int) (Math.random()*maxValueExclusion);
        }
        return massiv;
    }
}
