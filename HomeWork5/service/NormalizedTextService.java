package HomeWork5.service;

import HomeWork5.dto.EasySearch;
import HomeWork5.dto.SearchEnginePunctuationNormalizer;
import HomeWork5.dto.TextFileProcessing;
import HomeWork5.dto.api.ISearchEngine;

public class NormalizedTextService {

    public void run(){
        TextFileProcessing textFileProcessing = new TextFileProcessing("Война и мир_книга.txt");
        String text = textFileProcessing.readTextFromFile();
        ISearchEngine searchEngine = new SearchEnginePunctuationNormalizer(new EasySearch());
        System.out.println(searchEngine.search(text, "Война"));
    }
}
