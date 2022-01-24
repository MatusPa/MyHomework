package HomeWork5.service;

import HomeWork5.dto.RegExSearch;
import HomeWork5.dto.TextFileProcessing;

public class RegExSearchService {
    public void run(){
        TextFileProcessing textFileProcessing = new TextFileProcessing("Война и мир_книга.txt");
        String text = textFileProcessing.readTextFromFile();
        RegExSearch regExSearch = new RegExSearch();
        System.out.println(regExSearch.search(text, "и"));
    }
}
