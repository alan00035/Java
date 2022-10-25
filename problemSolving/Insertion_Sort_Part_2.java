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
                int position = a;
            
                while(temp<arr.get(position-1)){
                    Collections.swap(arr, position, position-1);
                    continue;
                }
                
                System.out.println(arr);
            }
        

                // System.out.println(arr);
            }        


}
