package HomeWork5.service;

import HomeWork5.dto.EasySearch;
import HomeWork5.dto.TextFileProcessing;

import static com.ibm.icu.text.PluralRules.Operand.e;

public class EasySearchService {
    public void run(){
        TextFileProcessing textFileProcessing = new TextFileProcessing("Война и мир_книга.txt");
        String text = textFileProcessing.readTextFromFile();
        EasySearch easySearch= new EasySearch();
        System.out.println(easySearch.search(text, "Вой"));
    }
}
