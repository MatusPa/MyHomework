package HomeWork5.dto;

import HomeWork5.dto.api.ISearchEngine;

import java.util.Locale;

public class CaseIndependentSearchEngineCover implements ISearchEngine {
    ISearchEngine searchEngine;

    public CaseIndependentSearchEngineCover(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }



    @Override
    public long search(String text, String word) {
        if (searchEngine instanceof RegExSearch) {
            String wordPlusModifier = "(?i)" + word;
            return searchEngine.search(text, wordPlusModifier);
        } else {
            String textLow = text.toLowerCase();
            String wordLow = word.toLowerCase();
            return searchEngine.search(textLow, wordLow);
        }
    }
}
