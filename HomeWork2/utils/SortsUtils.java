package HomeWork2.utils;

import java.util.Arrays;

public class SortsUtils {

    public static int[] shakerSort(int[] arr){

        int left = 0;
        int right = arr.length-1;
        int vremennaya ;
        do {
            for (int i = left; i <right ; i++) {
                if(arr[i]>arr[i+1]){
                    vremennaya = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1] = vremennaya;
                }
            }
            right--;
            for (int i = right; i >left ; i--) {
                if (arr[i]<arr[i-1]){
                    vremennaya = arr[i];
                    arr[i]=arr[i-1];
                    arr[i-1]=vremennaya;
                }
            }
            left++;
        } while(left<right);
        return arr;
    }
    public static int[] puzyrbSort (int[] arr){
        boolean isSorted = false;
        int buf;
        while(!isSorted){
            isSorted = true;
            for (int i =0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=buf;
                }
            }
        }
        return arr;
    }

    public static int[] puzyrbSort2(int[] mas) {
        int buf = 0;
        for (int out = mas.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (mas[in] > mas[in + 1]){
                    buf = mas[in];
                    mas[in] =mas[in +1];
                    mas[in+1]= buf;

                }

            }
        }
        return mas;

    }



}
