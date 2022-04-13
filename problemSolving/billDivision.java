package problemSolving;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class billDivision {

    public static void main(String[] args) {

        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);

        
        
        int k = 1;
        int b = 12;

        int n =4;

        int payment = (bill.stream().mapToInt(Integer::intValue).sum() - bill.get(k))/2;

        // int payment = (Arrays.stream(bill).sum() - bill[k])/2;
   
        if(b == payment )
            System.out.println("Bon Appetit");
        else  
            System.out.println(Math.abs(payment-b));
    }
    
}


// https://www.hackerrank.com/challenges/bon-appetit/problem?isFullScreen=true