package HomeWork2.arrays;

import HomeWork2.utils.ArraysUtils;

public class HomeWork2_2 {
    public static void main(String[] args) {
    int[] massivConsole = ArraysUtils.arrayFromConsole();
    vyvodkazhdogo(massivConsole);
    vyvodVtorogo(massivConsole);
    vyvodObratnyi(massivConsole);

    }

    public static void vyvodkazhdogo(int [] massivConsole) {
        System.out.println("Do While. Все элементы масcива:");
        int i =0;
        do {
            System.out.print(massivConsole[i] + "\t");
            i++;
        } while(i<massivConsole.length);

        System.out.print("\n"+"While. Все элементы масcива:"+ "\n");
        int a =0;
        while(a<massivConsole.length){
            System.out.print(massivConsole[a] + "\t");
            a++;
        }


        System.out.print("\n"+"For. Все элементы масcива:"+ "\n");

        for (int j = 0; j < massivConsole.length; j++) {
            System.out.print(massivConsole[j] + "\t" );
        }

        System.out.print("\n"+"For each. Все элементы масcива:"+ "\n");
        for (int show : massivConsole){
            System.out.print(show + "\t");
        }


    }
    public static void vyvodVtorogo(int [] massivConsole) {
        if (massivConsole.length==1){
            System.out.println();
            System.out.println("\n"+"Второго нет!! Длина массива меньше двух");
        }
        else {
            System.out.print("\n" + "Do While. Каждый второй:" + "\n");
            int i = 1;
            do {
                System.out.print(massivConsole[i] + "\t");
                i += 2;
            } while (i < massivConsole.length);

            System.out.print("\n" + "While. Каждый второй:" + "\n");
            int a = 1;
            while (a < massivConsole.length) {
                System.out.print(massivConsole[a] + "\t");
                a += 2;
            }

            System.out.print("\n" + "For. Каждый второй:" + "\n");

            for (int j = 1; j < massivConsole.length; j += 2) {
                System.out.print(massivConsole[j] + "\t");
            }
        }
    }
        public static void vyvodObratnyi(int [] massivConsole) {
            System.out.print("\n"+"Do While. В обратном порядке:"+"\n");
            int i =massivConsole.length -1;
            do {
                System.out.print(massivConsole[i] + "\t");
                i--;
            } while(i > -1);

            System.out.print("\n"+"While. В обратном порядке:"+ "\n");
            int a = massivConsole.length -1;
            while(a>-1){
                System.out.print(massivConsole[a] + "\t");
                a--;
            }


            System.out.print("\n"+"For. В обратном порядке:"+ "\n");

            for (int j = massivConsole.length-1; j >-1 ; j--) {
                System.out.print(massivConsole[j] + "\t" );
            }
        }



}

