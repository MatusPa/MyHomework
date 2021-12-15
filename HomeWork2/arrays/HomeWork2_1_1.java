package HomeWork2.arrays;


import HomeWork2.utils.ArraysUtils;

public class HomeWork2_1_1 {
    public static void main(String[] args) {

        int[] container = ArraysUtils.arrayFromConsole();
        System.out.println();
        System.out.println("Размер массива");
        System.out.println(container.length);
        System.out.println("Элементы массива");
        for (int i = 0; i <container.length ; i++){
            System.out.print(" "+container[i]);
        }
    }

}

