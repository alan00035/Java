import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class circular_array_rotation {
    public static void main(String[] args) {
        int k=1;  //rotation numbers
        int[] queries={1,2};


        List<Integer> source = Arrays.asList(1,2,3);
        int length = source.size();

        List<Integer> list1 = source.subList(length-k, length);
        List<Integer> list2 = source.subList(0, k-1);
        List<Integer> rotaList = new ArrayList<>(list1);
        rotaList.addAll(list2);    



        if(k==1){
            for(int i : queries)
                System.out.println(source.get(i));
        }
        else{
            for(int i: rotaList)
                System.out.println(i);
            
        }
        


        
       
 
       

    }
       
}

// https://www.hackerrank.com/challenges/circular-array-rotation/problem?isFullScreen=true