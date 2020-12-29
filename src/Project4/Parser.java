package Project4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {
    public Scanner scanner;
    int numValues = 8;
    public Double[] unsortedValues = new Double[numValues];

    public Parser(File file){
        try{
            scanner = new Scanner(file);
        } catch (FileNotFoundException e){
            System.out.println("No file found");
            e.printStackTrace();
        }
        readDataIntoArray();

    }
    public void readDataIntoArray(){
        for (int i = 0; i < numValues; i++) {
            unsortedValues[i] = Double.valueOf(scanner.next());

        }
    }

    public double averageData(){
        double avg = 0;
        for (int i = 0; i < numValues; i++) {
            avg += unsortedValues[i];
        }
        return avg/numValues;
    }

    public Double[] sortAscending(){
        BubbleSorter bs = new BubbleSorter();
        return bs.sort(unsortedValues);
    }

}
