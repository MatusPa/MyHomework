package HomeWork5.dto;

import HomeWork5.dto.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine  {
    ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }


    @Override
    public long search(String text, String word) {

        String textNormal = text.replaceAll(":|,|\\.|\"|--|\\*|\\(|\\)|\\?|;|!",
                " ").replaceAll("\\s+", " ");
        return searchEngine.search(textNormal, word);
    }
}
