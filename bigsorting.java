import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class bigsorting {
    public static void main(String[] args) {
        String[] unsorted ={"1","150","31415926535897932384626433832795","3","200"};
        // String[] unsorted ={"234","3","3","45"};
        
        List<String> unsortedList = Arrays.asList(unsorted);
        

        // Collections.sort(unsortedList);
        // System.out.println(unsortedList);

        Comparator<String> compare = new Comparator<String>() {
            int ans = 0;
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length())
                    ans= 1;
                if(o1.length()<o2.length())
                    ans= -1;
                else{
                    if(o1.length() ==o2.length()){
                        ans= Long.parseLong(o2) < Long.parseLong(o1) ? 1:-1;
                    }
                }
                return ans;   
            }
            
        };

        Collections.sort(unsortedList, compare);

        System.out.println(unsortedList);

// this is better syntax
// Collections.sort(unsorted, (x, y) -> x.length() == y.length() ? x.compareTo(y) : Integer.compare(x.length(), y.length()));
// return unsorted;
}


    
}

// https://www.hackerrank.com/challenges/big-sorting/problem?isFullScreen=true


