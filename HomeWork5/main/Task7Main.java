package HomeWork5.main;

import HomeWork5.dto.RegExSearch;
import HomeWork5.dto.TextFileProcessing;
import HomeWork5.dto.api.ISearchEngine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Task7Main {
    public static void main(String[] args) {

        try {
            Scanner console = new Scanner(System.in);
            File dir = new File(String.valueOf(args[0]));
            String[] files = dir.list();
            int num=1;
            for (String file : files) {
                System.out.println(num+". "+ file );
                num++;
            }
            FileWriter writer =new FileWriter("result.txt");
            int bookIndex =1;
            while(bookIndex>= 0){

                System.out.println("Введите номер книги из списка");
                bookIndex = console.nextInt() -1;
                System.out.println("Введите слово, которое необходимо найти");
                String word = console.next();
                String fileName =files[bookIndex];
                TextFileProcessing textFileProcessing = new TextFileProcessing("books\\"+fileName);

                ISearchEngine engine = new RegExSearch();
                long wordsAmount = engine.search(textFileProcessing.textWordsOnlyString(),word);
          //      System.out.println(fileName +" - "+ word +" - "+ wordsAmount);
                writer.write("\n"+fileName +" - "+ word +" - "+ wordsAmount);
                writer.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
