import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class day_1_quartiles {
    public static void main(String[] args) {
        Integer[] arr1 ={5,7,1,3};

        List<Integer> arr = Arrays.asList(arr1);
        List<Integer> result = new ArrayList<>();
        
        Collections.sort(arr);
        int m, n;
        for(m=0; m<arr.size(); m+=2){
                if(arr.size()%2 ==0){
                   System.out.println(arr.get(m) + "...m");
                //  result.add((arr.get(m)+arr.get(n))/2);
                // System.out.println((arr.get(m)+arr.get(n))/2);
                }
          
        }

        System.out.println(result);
     
    }
}
