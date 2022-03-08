import java.util.ArrayList;
import java.util.List;

public class subarray{

    public static void main(String[] args) {
       int[] arr = {1,-2,4,-5,1};
       int length = 5;

       int count =0 ;

       for (int i =0; i < length; i++){
         int sum =0;
          for(int k=i; k< length; k++){
              sum += arr[k];
            //   System.out.println(sum);
             if(sum<0)
                 count++ ;

          }
         
          
       }
       System.out.println(count);
    }
    
    }







// https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true
