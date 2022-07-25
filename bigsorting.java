import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class bigsorting {
    public static void main(String[] args) {
        // String[] unsorted ={"1","150","31415926535897932384626433832795","3","200"};
        String[] unsorted ={"234","3","3","45"};
        
        List<String> unsortedList = Arrays.asList(unsorted);
        
        // Collections.sort(unsortedList);
        // System.out.println(unsortedList);

        // Comparator<String> compare = new Comparator<String>() {

        //     @Override
        //     public int compare(String o1, String o2) {
        //         if(o1.length()>o2.length())
        //             return 1;
        //         if(o1.length()<o2.length())
        //             return -1;
        //         else{
        //             if(o1.length() ==o2.length()){
                        
        //             }
        //         }   
        //     }
            
        // };

        // Collections.sort(unsortedList, compare);

        // System.out.println(unsortedList);
    
}


    
}

// https://www.hackerrank.com/challenges/big-sorting/problem?isFullScreen=true