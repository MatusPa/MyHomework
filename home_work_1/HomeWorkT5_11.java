package home_work_1;

import java.util.Scanner;

public class HomeWorkT5_11 {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        System.out.print("Input your name: ");

        String name = my.next();
        if (name.equals("Вася")) {

            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
            return;
        }
        if (name.equals("Анастасия")) {
            System.out.println("Я тебя так долго ждал");
            return;
        }
        if ((name.equals("Анастасия") & name.equals("Вася")) == false) {
            System.out.println("Добрый день, а вы кто?");
        }
        my.close();
    }
}
