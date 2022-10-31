import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class correctness_and_the_loop_invariant {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // int a = scan.nextInt();
        // int[] arr = new int[a-1];
        // for (int i=0; i<a; i++){
        //     arr[i] = int.nextInt();
        // }
        int[] arr ={7 ,4 ,3 ,5 ,6, 2} ;
          Arrays.sort(arr);

          for (int c:arr)
          System.out.print(c+" ");
    }
}

// https://www.hackerrank.com/challenges/correctness-invariant/problem?isFullScreen=true