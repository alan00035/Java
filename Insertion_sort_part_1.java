import java.util.Arrays;
import java.util.List;

public class Insertion_sort_part_1 {
    public static void main(String[] args) {
        Integer[] arrOrigin ={2, 3, 4, 5, 6, 7, 8, 9, 10, 1};
        int count = arrOrigin.length-2;
        List<Integer> arr = Arrays.asList(arrOrigin);

        int temp = arr.get(count+1);
        int i;
        for(i=count; i>=0; i--){
            if(temp < arr.get(i)){
                arr.set(i+1, arr.get(i));
                for(int c:arr){
                    System.out.print(c +" ");
                }
                // continue;
            }
            if(temp >=arr.get(i)){
                arr.set(i+1, temp);
            for(int c:arr){
                    System.out.print(c +" ");
                }
                break;
            }
            System.out.println();

            
        }
    }
        
}

// https://www.hackerrank.com/challenges/insertionsort1/problem?isFullScreen=true
// public static void print(List<Integer> arr){
//     for(int x: arr){
//         System.out.print(x+" ");
//     }
//     System.out.println();
// }
// public static void insertionSort1(int n, List<Integer> arr) {
//     int key = arr.get(arr.size()-1);
//     int j = arr.size()-2;
    
//     while(j>=0 && arr.get(j)>key){
//         arr.set(j+1, arr.get(j));
//         j--;
//         print(arr);
//     }
    
//     arr.set(j+1, key);
//     print(arr);
// }