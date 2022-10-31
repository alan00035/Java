import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class correctness_and_the_loop_invariant {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // int a = scan.nextInt();
        // int[] arr = new int[a-1];
        // while (scan.hasNext()){
        //     arr[a-1] = scan.nextInt();    // because this is a sorting exer, doesnt matter the order to input data;
        //     a--;}

        int[] arr ={7 ,4 ,3 ,5 ,6, 2} ;
          Arrays.sort(arr);

          for (int c:arr)
          System.out.print(c+" ");
    }
}

// https://www.hackerrank.com/challenges/correctness-invariant/problem?isFullScreen=true