package HomeWork5.dto.api;

public interface ISearchEngine {
    /**
     * Метод возвращает информации о количестве раз которое встречается слово в тексте.
     * Первый параметр текст в котором ищем, второй параметр что ищем в тексте.
     */
     long search(String text, String word);



}
