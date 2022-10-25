import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Insertion_Sort_Part_2 {
    public static void main(String[] args) {
        Integer[] arrOriginal ={3,4,7,5,6,2,1};
        List<Integer> arr = Arrays.asList(arrOriginal);
        int n = arr.size();
        int a;

            for(a =1; a<n; a++){
                int temp = arr.get(a);
                int count = a-1;
                while(count >=0 && arr.get(count)>temp){
                    Collections.swap(arr, count+1, count);
                    count--; // dont forget this one
                } 
                System.out.println(arr);
                }
                

            }


}
