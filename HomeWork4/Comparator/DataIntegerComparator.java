package HomeWork4.Comparator;

import java.util.Comparator;

public class DataIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1!=null && o2!=null)
            return o1.compareTo(o2);
        return 0;
    }
}
