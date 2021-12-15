package HomeWork2.sorts;

import HomeWork2.utils.ArraysUtils;
import HomeWork2.utils.SortsUtils;

import java.util.Arrays;

public class HomeWork4_4 {
    public static void main(String[] args) {
        int[] mas = ArraysUtils.arrayRandom(10,99);
        System.out.println("Рандомный массив: ");
        System.out.println(Arrays.toString(mas));
        System.out.println("Отсортированный шейкерным методом массив: ");
         System.out.println(Arrays.toString(SortsUtils.shakerSort(mas)));
        System.out.println("Пузырьком");
        System.out.println(Arrays.toString(SortsUtils.puzyrbSort(mas)));

    }
}
