import java.util.ArrayList;
import java.util.List;

public class Semester1FinalMain {

    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>(
                List.of(1234, 56, 90, 324, 876, 237));
        List<Integer> Three = new ArrayList<>();

        boolean none = true;

        for(int i = 0; i < numbers.size(); i++){
            int ones = numbers.get(i) % 10;
            int tens = (numbers.get(i) % 100)/10;
            int hundreds = (numbers.get(i) % 1000)/ 100;

            if((hundreds<tens) && (tens<ones) && (numbers.get(i)<=999) && (numbers.get(i)>=100) ){
                Three.add(numbers.get(i));
                none = false;
            }
        }
        if (none == true){
            System.out.println("No Such Numbers");
        }
        else{
            for(int i = 0; i< Three.size(); i++){
                System.out.println(Three.get(i));

            }
        }

    }
}
