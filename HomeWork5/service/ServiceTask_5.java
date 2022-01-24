package HomeWork5.service;

import HomeWork5.dto.*;
import HomeWork5.dto.api.ISearchEngine;

public class ServiceTask_5 {
    public void run(){
        TextFileProcessing text = new TextFileProcessing("Война и мир_книга.txt");
        String textReadyToSearch =  text.textWordsOnlyString();
        ISearchEngine engine = new CaseIndependentSearchEngineCover(new RegExSearch());
        System.out.println(engine.search(textReadyToSearch,"и"));
        System.out.println(engine.search(textReadyToSearch,"Война"));
        System.out.println(engine.search(textReadyToSearch,"Мир"));


    }
}
