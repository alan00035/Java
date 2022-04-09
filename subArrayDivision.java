import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;

public class subArrayDivision {
    public static void main(String[] args) {
        // int[] arr ={1 ,2 ,1, 3, 2};
        int[] arr={4};
        int d =4;  //sum
        int m =1; //length
        int count =0;
        // int[] arr = list.stream().mapToInt(i->i).toArray();

        int[] subArray = new int[m-1];

        for(int i =0; i<arr.length; i++){
            subArray = Arrays.copyOfRange(arr, i, i+m);
            System.out.println(Arrays.toString(subArray));

            if(IntStream.of(subArray).sum() == d )
                count++;
            
        }

        System.out.println(count);

    }
    
}


// https://www.hackerrank.com/challenges/the-birthday-bar/problem?isFullScreen=true&h_r=next-challenge&h_v=zen