package HomeWork2.loops;

import java.util.Random;

public class HomeWork1_2 {
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
                    }
    }
    public static void main(String[] args) {

       String yourInput = args[0];
       if (!isDigit(yourInput)){
           System.out.println(("Введено не число"));
           return;
       }
       double yourInputDouble = Double.parseDouble(yourInput);
       if ( yourInputDouble % 1 != 0) {
           System.out.println("Введено не целое число");
       }


        char[] charMassiv = yourInput.toCharArray();


        int count = 1;
        for (int i = 0; i < charMassiv.length; i++) {

            String stroka = Character.toString(charMassiv[i]);
            int cifra = Integer.parseInt(stroka);
            count *= cifra;

            if (i == charMassiv.length - 1) {
                        System.out.print(cifra + " = " + count);
            } else {
                System.out.print(cifra + " * ");
            }



        }
    }
}



