package HomeWork5.dto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TextFileProcessing {
    private String fileName;
    private Set wordsSet;

    private Map wordsMap;
    private List <Map.Entry<String,Integer>> topValueList;


    public TextFileProcessing(String fileName) {
        this.fileName = fileName;


    }

    public String textWordsOnlyString(){
        String text = readTextFromFile();
        String textChanged = text.replaceAll(":|,|\\.|\"|--|\\*|\\(|\\)|\\?|;|!",
                " ").replaceAll("\\s+", " ");
        return textChanged;
    }

    public String[] createWordsMassiv(){
        return textWordsOnlyString().split(" ");

    }



    public Set getWordsSet() {
        return wordsSet;
    }


    /**
     * Метод считывает текстовый файл
     * @return файл в виде строки
     */
    public String readTextFromFile(){
        try {
            FileReader reader = new FileReader(fileName);
            int c;
            StringBuilder builder = new StringBuilder();
            while((c=reader.read())!=-1){
                builder.append((char)c);
            }
            return builder.toString();

        } catch (FileNotFoundException e) {
            return("Ошибка чтения файла");
        } catch (IOException e) {
            return "Ошибка ввода-вывода";
        }
    }

    /**
     * тестовый метод для тренировки на небольшом количсетве текста
     * @param stringsAmount количество строк каоторые небходимо выбрать из текста
     * @return возвращает строку сформированную из строк файла
     */
    public String readStringsFromFileTest(int stringsAmount){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            int c;
            StringBuilder builder = new StringBuilder();
            for (int i = 1; i <=stringsAmount ; i++) {
                builder.append(reader.readLine());
            }
            return builder.toString();

        } catch (FileNotFoundException e) {
            return("Ошибка чтения файла");
        } catch (IOException e) {
            return "Ошибка ввода-вывода";
        }
    }

    /**
     * метод записывает использованнные в тексте слова в Set
     * @return возваращает количество использованных в тексте слов
     */
    public int textToWordsSet() {
        Set<String> words = new HashSet<>();
        String [] allWordsFromFile = createWordsMassiv();
        for (String s : allWordsFromFile) {
            words.add(s);
        }
        this.wordsSet = words;
        return words.size();
    }

    public void createWordsMap(){
        Map<String,Integer> wMap = new HashMap<>();
        String [] allWordsFromFile = createWordsMassiv();
        for (String w : allWordsFromFile) {
            if (wMap.containsKey(w)){
                wMap.put(w,wMap.get(w)+1);
            }
            else{
                wMap.put(w,1);
            }
        }
        this.wordsMap = wMap;
    }
    public List createTopWordsList(){
        createWordsMap();
        List<Map.Entry<String, Integer>> topValueList = new ArrayList<>(wordsMap.entrySet());

        Comparator<Map.Entry<String, Integer>> comparator =
                Map.Entry.<String, Integer>comparingByValue().reversed();
        topValueList.sort(comparator);
        this.topValueList = topValueList;

        return topValueList;

    }

    /**
     * метод для получения списка топ "n" слов в виде строки
     * @param n - ограничивает топ
     * @return возвращает топ строкой
     */
    public String printTopValueList(int n){
        createTopWordsList();
        StringBuilder builder = new StringBuilder();

        int listSize = topValueList.size();

        int count = 0;

        for (Map.Entry<String, Integer> s : topValueList) {
            if (count==n){
                builder.append(s.getKey() +" - " +s.getValue() +" раз." );
                return builder.toString();
            }
            else{
                builder.append(s.getKey() +" - " +s.getValue() +" раз, " );
                count++;
            }
        }
        return builder.toString();
    }
}
