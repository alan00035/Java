import java.util.Arrays;
import java.util.List;

public class Insertion_Sort_Part_2 {
    public static void main(String[] args) {
        Integer[] arrOriginal ={3,4,7,5,6,2,1};
        List<Integer> arr = Arrays.asList(arrOriginal);
        int n = arr.size();
        int i =0, temp =0;

         while( i<n ){
            //  temp = arr.get(i);
            //  arr.set(i, arr.get(i+1));
            //  arr.set(i+1, temp);
            // System.out.println(arr.get(i) +"_" +arr.get(i+1));
            System.out.println(i);
             i++;
            

            //  System.out.print(temp);
             
         }
    }
}
