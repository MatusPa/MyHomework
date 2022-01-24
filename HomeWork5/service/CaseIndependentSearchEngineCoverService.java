package HomeWork5.service;

import HomeWork5.dto.CaseIndependentSearchEngineCover;
import HomeWork5.dto.EasySearch;
import HomeWork5.dto.RegExSearch;
import HomeWork5.dto.TextFileProcessing;
import HomeWork5.dto.api.ISearchEngine;

public class CaseIndependentSearchEngineCoverService {
    public void run(){
        TextFileProcessing textFileProcessing = new TextFileProcessing("Война и мир_книга.txt");
        String text = textFileProcessing.readTextFromFile();
        ISearchEngine engine = new CaseIndependentSearchEngineCover(new EasySearch());
        System.out.println(engine.search(text,"Война"));;
    }

}
