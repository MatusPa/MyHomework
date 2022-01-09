package HomeWork4;

import HomeWork4.Comparator.DataIntegerComparator;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainerService {
    public void Run(){
         Integer[] integers = {1,2,4,2,5,2};
        System.out.println( "Было: " + Arrays.toString(integers));
        DataContainer<Integer> d = new DataContainer<>(integers);
        Integer a = 1;
      //  d.delete(a);
        System.out.println(d.delete(a));
        System.out.println("Стало: "+Arrays.toString(d.getItems()));

        DataIntegerComparator comparator =new DataIntegerComparator();
   //     d.sort(comparator);
      DataContainer.sort(d);
        System.out.println("Стало после сортировки: "+d.toString());


    }
}
