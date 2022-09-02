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

        int length = arr.size();
        int n,m = length/2;
        if(length !=0)
             if(m%2 !=0)
                for(n=0; n<length-1; n++){
                    if(length%2 !=0 && length !=0){
                        result.add((arr.get(n)+arr.get(n+1))/2);
                    }
            if(length%2 ==0 )
                for(n=0; n<=m;n++){
                    result.add((arr.get(n)+arr.get(n+1))/2);
                }
                for(n=m+2; n<length-1;n++){
                    result.add((arr.get(n)+arr.get(n+1))/2);
                }
                result.add(arr.get(m+1));
        }

        // System.out.println(result);
        System.out.println(11/2+1);
    }
}
