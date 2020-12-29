package Project4;

public class BubbleSorter implements Sorter {
    @Override
    public Double[] sort(Double[] values) {

        for (int i = 0; i < values.length-1; i++) {
            for (int j = 0; j < values.length-i-1; j++) {
                if(values[j] > values[j+1]){
                    double num = values[j];
                    values[j] = values[j+1];
                    values[j+1] = num;
                }

            }


        }
        return values;
    }
}
