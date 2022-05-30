import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class organizing_containers_of_balls {
    public static void main(String[] args) {
        Integer[] a1 ={1,3,1};
        Integer[] a2 = {2,1,2};
        Integer[] a3 ={3,3,3};

        int n = a1.length, sum =0;

        
        List<Integer> b1 = Arrays.asList(a1);
        List<Integer> b2 = Arrays.asList(a2);
        List<Integer> b3 = Arrays.asList(a3);

        List<List<Integer>> container = new ArrayList<>();

        container.add(b1); container.add(b2); container.add(b3);

        // int[][] arr = new int[n][];
        int[] type = new int[n];
        int[] con = new int[n];
        int i,j;
        for(i=0; i< n; i++){
            for (j=0; j< n; j++){
                type[i] += container.get(i).get(j);
                con[j] +=container.get(i).get(j);

            }
        }

       Arrays.sort(type); Arrays.sort(con);

       for(i=0; i< type.length; i++){
         if(type[i] != con[i])
            System.out.println("Impossible");
       }
       System.out.println("Possible"); 
}

}
// https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem?isFullScreen=true