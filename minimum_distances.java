
import java.util.Arrays;
import java.util.List;

public class minimum_distances {
    public static void main(String[] args) {
        Integer[] arr ={7, 1, 3, 4, 1, 7};
        List<Integer> a = Arrays.asList(arr);

        // Collections.sort(a, Comparator.reverseOrder());
        // int[] count = new int[a.get(0)+1];

        int max =a.size();
         for(int i =0; i<a.size(); i++){
            for(int n =i+1; n<a.size()&& n!=i; n++){
                if(a.get(i) == a.get(n)){
                    int distances = Math.abs(i-n);
                    if(distances<max){
                       max = distances;
                    }
                }
            }
            if(max ==a.size())
                max =-1;
        }

       System.out.println(max);
    }
}

// https://www.hackerrank.com/challenges/minimum-distances/problem?isFullScreen=true