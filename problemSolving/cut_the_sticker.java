import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class cut_the_sticker {
    public static void main(String[] args) {
        Integer[] a ={5, 4, 4, 2, 2, 8};
        List<Integer> arr = Arrays.asList(a);
        int count =0;
           
        Integer sum = arr.stream().reduce(0,Integer:: sum);
            
        Collections.sort(arr);

        for(int i=1; i<arr.size(); i++){

            if(arr.get(i) != arr.get(i-1)){
                count=arr.size()-i;
            }
        }
        System.out.println(count);
            
    }

}


// https://www.hackerrank.com/challenges/cut-the-sticks/problem?isFullScreen=true

// import java.util.Scanner;
// import java.util.Arrays;

// public class Solution {
//     public static void main(String[] args) {
//         /* Save Input */
//         Scanner scan = new Scanner(System.in);
//         int numSticks = scan.nextInt();
//         int [] array = new int[numSticks];
//         for (int i = 0; i < numSticks; i++) {
//             array[i] = scan.nextInt();
//         }
//         scan.close();
        
//         Arrays.sort(array);
        
//         System.out.println(array.length);
//         for (int i = 1; i < array.length; i++) {
//             if (array[i] != array[i-1]) {
//                 System.out.println(array.length - i);
//             }
//         }
//     }
// }