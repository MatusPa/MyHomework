package HomeWork4;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    T[] data;


    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * переопределленный метод для вывода массива в виде строки без элементов  null
     */
    @Override
    public String toString() {
        if (data == null)
            return "null";
        int iMax = data.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            if(data[i]!=null)
            b.append(data [i]);
            if (i == iMax) {
                return b.append(']').toString();
            }
            b.append(" ");
        }
    }



    /**
     * метод добавляет item в массив
     */
    public int add(T item) {
        boolean empty = false;
        int emptyIndex = 0;
        if (item == null){
            return -1;
        }
        for (int a = 0; a < data.length; a++) {
            if(data[a] == null) {
                empty = true;
                emptyIndex = a;
                break;
            }
        }
        if (!empty) {
            int previousLength = data.length;
            data = Arrays.copyOf(data, data.length + 1);
            data[previousLength] = item;
            return previousLength ;
        }
        else {
            data[emptyIndex] = item;
            return emptyIndex;
        }
    }
    /**
     * метод возвращает элемент массива по индексу
     */
    public T get(int index){
        if(index>=data.length){return null;}
        return data[index];
    }

    /**
     * метод возвращает массив data
     */
    T[] getItems(){
        return data;
    }

    /**
     * метод удаляет элемент массива по индексу
     * @param index -индекс элемента , который нужно удалить
     * @return - возвращает true , если удалось удалить
     */
    public boolean delete(int index) {
        if (index >= data.length || index < 0) {
            return false;
        } else {
            if (index == 0 && data.length == 1) {
                data = Arrays.copyOf(data, 0);

                } else {
                    for (int i = index; i < data.length-1; i++) {
                    data[i] = data[i+1];
                    }
                data = Arrays.copyOf(data, data.length - 1);
            }
        return true;
        }
    }
    /**
     * метод удаляет элемент массива по значению
     * @param item - элемент который нужно удалить
     * @return - возвращает true , если удалось удалить
     */
    public boolean delete(T item){
        int itemIndex;
        boolean del=false;
        for (int i = 0; i < data.length; i++) {
            if(data[i].equals(item)){
                itemIndex = i;
                delete(itemIndex);
                del = true;
                break;
            }
        }
        return del;
    }

    /**
     * метод сортирует массив
     * @param comparator - переданный компаратор, реализация которого использыется для сортировки
     */
     public void sort( Comparator<T> comparator){
         boolean isSorted = false;
         T buf;
         while(!isSorted) {
             isSorted = true;
             for (int i = 0; i < data.length - 1; i++) {
                 if (comparator.compare(data[i], data[i + 1]) > 0) {
                     isSorted=false;
                     buf = data[i];
                     data[i] = data[i + 1];
                     data[i + 1] = buf;
                 }
             }
         }
    }
    /**
     * Метод сортировки используя реализацию из объектов типа wildcard Comparable
     */
    static void  sort(DataContainer<?extends Comparable> dataContainer) {
        int size = dataContainer.getItems().length;
        Comparable []m=dataContainer.getItems();
        Comparable buf;
        boolean isSorted = false;
        while(!isSorted){
            isSorted=true;
            for (int i = 0; i <size  - 1; i++) {
                if (m[i].compareTo(m[i + 1]) > 0) {
                    isSorted =false;
                    buf = m[i];
                    m[i] = m[i + 1];
                    m[i + 1] = buf;
                }
            }
        }


    }

}


