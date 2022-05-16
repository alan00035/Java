import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class lisas_workbook {
    public static void main(String[] args) {
        int n=5, k=3; //n is chapter, k is max prob per page;  
        
        //if its index (within a chapter) is the same as the page number where it's located
        Integer[] a = {4, 2, 6, 1, 10};
        List<Integer> arr = Arrays.asList(a);

        int page =1, count =0;
        for(int i :arr){
            for(int p =1; p<=i; p++){
                if(p==page)
                    count++;
                if(p%k==0 || p == i)
                    page++;    
            }

        }
                System.out.println(count);

    }
}

// https://www.hackerrank.com/challenges/lisa-workbook/problem?isFullScreen=true