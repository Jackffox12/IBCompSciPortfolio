package Project4;

import java.io.FileWriter;
import java.io.IOException;

public class Writter {
    private FileWriter writer;

    public Writter(String fileName) {
        try {
            writer = new FileWriter(fileName);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public void writeData(double data) throws IOException{
        writer.write(Double.toString(data));
        writer.close();
    }

    public void writeArrayData(Double[] data) throws IOException{
        for (int i = 0; i<data.length; i++) {
            writer.write(data[i].toString()+"\n");
        }
        writer.close();
    }

}
