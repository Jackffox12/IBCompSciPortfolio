package Project4;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File myfile = new File("C:\\Users\\jackf\\OneDrive\\Desktop\\GitHub\\IBCS Project 4 Files\\Input.csv");
        Parser parser = new Parser(myfile);
        Double[] sortedArray = parser.sortAscending();
        Writter writter = new Writter("C:\\Users\\jackf\\OneDrive\\Desktop\\GitHub\\IBCS Project 4 Files\\Output.csv");
        writter.writeArrayData(sortedArray);

    }

}
