package home_work_1;
import java.util.Scanner;
public class HomeWorkT5_2 {
    public static void main(String[] args) {


        Scanner one = new Scanner(System.in);
        System.out.print("Input your name: ");
        String yourName = one.next();
        switch (yourName) {
            case "Вася":
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
                break;

        }

    }
}
