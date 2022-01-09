package HomeWork4.Comparator;

import java.util.Comparator;

public class StringDataComparator implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
