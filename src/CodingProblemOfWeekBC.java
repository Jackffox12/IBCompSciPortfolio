import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.List;

public class CodingProblemOfWeekBC {
    public static void main(String[] args){
        //B
        List<Integer> passengers = Arrays.asList(100, 150, 700, 20, 50, 80, 70, 100, 200);
        int[]p_array = new int[passengers.size()];
        for(int i = 0;i<passengers.size(); i++){
            p_array[i] = passengers.get(i);
        }
        for(int i : p_array){
            System.out.print(i+ ", ");
        }
        System.out.println();


        //C
        int daysPerWeek = 0;
        if(passengers.size()>=7){
            daysPerWeek = 7;
        }
        else{
            daysPerWeek = passengers.size();
        }
        int[] totalPerDay = new int[daysPerWeek];
        int average = 1;
        for(int i = 0; i < p_array.length; i++){
            if (i!=0 && i%7==0){
                average+=1;
            }
            totalPerDay[i%daysPerWeek] += (p_array[i]);
            totalPerDay[i%daysPerWeek] = totalPerDay[i%daysPerWeek]/average;
        }

        for(int i : totalPerDay){
            System.out.print(i+ ", ");
        }
        System.out.println();

        int max = totalPerDay[0];
        int indexPos = 0;
        for(int i = 0; i<7; i++){
            if (max<totalPerDay[i]){
                max = totalPerDay[i];
                indexPos = i;
            }
        }

        //String largestDay = Converter.convert(indexPos);
        System.out.println(DayOfWeek.of(indexPos+1).toString());


    }

}
