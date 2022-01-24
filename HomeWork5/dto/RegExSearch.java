package HomeWork5.dto;

import HomeWork5.dto.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {


    /**
     * Метод для поиска слов в тексте. Не учитывает части слов, а только отдельностоящие слова.
     * @param text текст в котором нужно искать
     * @param word слово  которое ищем
     * @return количество совпадений
     */
    @Override
    public long search(String text, String word) {
        String regex = "\\s"+word+"\\s";

         Pattern p =   Pattern.compile(regex) ;
        Matcher m = p.matcher(text);
        long count = 0;
        while (m.find()){
            count++;
        }

        return count;
    }
}
