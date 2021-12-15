package HomeWork2.arrays;


import HomeWork2.utils.ArraysUtils;

public class HomeWork2_4 {
    public static void main(String[] args) {
        int[] mas = ArraysUtils.arrayRandom(7, 100);

        System.out.println("Все элементы массива: ");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        chetnyiPolojit(mas);
        maxChetIndex(mas);
        menbsheSrednegoArifmeticheskogo(mas);
        dvaNaimensh(mas);
        summaCifr(mas);

    }

    public static void chetnyiPolojit(int[] mas ) {
        int sum = 0;
        System.out.print("\n"+"Четные положительные элементы массива:");
        for (int i = 0; i <mas.length ; i++) {
            if (mas[i]%2==0 && mas[i]>0){
                System.out.print(mas[i]+" ");
                sum+=mas[i];
            }
        }
        System.out.print("\n"+"Сумма : "+ sum);
        System.out.print("\n"+"*******");
    }

    public static void maxChetIndex(int[] mas) {
        int maxElement = 0;

        for (int i = 0; i < mas.length; i++) {

            if (i%2 == 0 && i!=0 && mas[i]>maxElement) {
                maxElement = mas[i];
            }
        }
        System.out.print("\n"+"Максимальный из элементов с четным индексом: " + maxElement);
    }

    public static void menbsheSrednegoArifmeticheskogo(int [] mas ) {
        int menSredArifm = 0;
        int sum = 0;
                for (int el: mas){
                        sum+=el;
        }
        int sredArifm = sum/mas.length;
        System.out.print("\n"+"Среднее арифметическое: " + sredArifm);
        System.out.print("\n"+"Элементы меньше среднего арифметического:");

        for (int i = 0; i <mas.length ; i++) {
            if(mas[i]<sredArifm){
                System.out.print(mas[i] + " ");
            }
        }

    }

    public static void dvaNaimensh(int[] mas) {
        int m1 = mas[0];

        int num = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < m1) {
                m1 = mas[i];
                num = i;
            }
        }
        int m2;
        int j;
        if (num == 0) {
            num = 1; m2=mas[1];
        } else {
            num = 0; m2 = mas[0];
        }

        for ( j=num; j < mas.length; j++) {
                 if( mas[j]<m2 && mas[j]!=m1){
                    m2 = mas[j];
                 }
            }
        System.out.print("\n"+"Два наименьших элемента: ");
        System.out.print( m1+" "+m2);
    }

    public static void summaCifr(int[] mas) {
        int sum = 0;
        for (int i = 0; i<mas.length ; i++) {
            int b = mas[i];
            for(int j = b%10; j>0; b/=10, j=b%10  ){
                sum +=j;
            }
        }
        System.out.print("\n"+ "Cумма цифр массива: "+ sum);
    }
}




