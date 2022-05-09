import java.util.Arrays;
import java.util.List;

public class beautiful_triplets {
    public static void main(String[] args) {
        Integer[] a={1, 2, 4, 5, 7, 8, 10};

        List<Integer> arr = Arrays.asList(a);

        int[] triplets= new int[3];

        int n=7, d =3;

        int count =0;

        // 1)
        // for(int i =0; i<n; i++){
        //     for(int j=i+1; j<n & j!=i; j++){
        //        int temp = (arr.get(i) + arr.get(j));
        //        if( temp%2 ==0 && arr.contains(temp/2) && Math.abs(arr.get(i)-temp/2)==d){
        //         count++;

        //        }
        //     }
            
        // }

        // 2)
        for(int i: arr){
            int temp1 = i+d;
        if(arr.contains(temp1) && arr.contains(temp1+d))
            count++;
         }
        System.out.println(count);
        

        
    }
}

// https://www.hackerrank.com/challenges/beautiful-triplets/problem?isFullScreen=true