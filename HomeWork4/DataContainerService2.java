package HomeWork4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainerService2 {
    public void Run(){

       String[] words = {};
       DataContainer<String > d = new DataContainer<>(words);

        int index1 = d.add("Привет");
        int index2 = d.add("Как дела");
        int index3 = d.add("Работаю");
        int index4 = d.add("Давай потом");
        String text1 = d.get(index1);
        String text2 = d.get(index2);
        String text3 = d.get(index3);
        String text4 = d.get(index4);

        System.out.println(text1);
        System.out.println(text2);
        System.out.println(text3);
        System.out.println(text4);


        System.out.println(Arrays.toString(d.getItems()));
    }
}
