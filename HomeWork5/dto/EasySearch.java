package HomeWork5.dto;

import HomeWork5.dto.api.ISearchEngine;

public class EasySearch implements ISearchEngine {
    /**
     * Метод считает найденные в тексте слова и учитывает части слов , совпадающие с запросом.
     * @param text текст, в котором ищем
     * @param word слово, которое ищем
     * @return количество совпадений
     */

    @Override
    public long search(String text, String word) {
        long count=0;
        int index = text.indexOf(word) ;
        int plusIndex = word.length()+1;
        while(index != -1){
            count++;
            index= text.indexOf(word,index + plusIndex);
        }
        return count;
    }
}
