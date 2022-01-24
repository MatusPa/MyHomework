package HomeWork5.service;

import HomeWork5.dto.TextFileProcessing;

public class TextFileProcessingService2_2 {
    public void run(){
        TextFileProcessing textFileProcessing = new TextFileProcessing("Война и мир_книга.txt");
        System.out.println(textFileProcessing.printTopValueList(100));
    }
}
