package hankerrank.medium;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.System.in;

class checker{

    void check (int ... i ){
    

        for (int a : i)
            if(a>=2 && squareCheck(a)){
            // if(squareCheck(a)){
                System.out.print(a + " ");
        }
        System.out.println();
    }

    boolean squareCheck(int a){
        for(int i =2; i <= Math.sqrt(a); i++)
            if(a%i ==0)
             return false; // is perfectly divided, is not primry number
        return true;
    }
}

public class primeChecker{
    public static void main(String[] args) {
        // BufferedReader br = new BufferedReader(new InputStreamReader(in));

        checker ch = new checker();

        // int[] a ={2,9,45,7,6};
        // ch.check(a);    

        System.out.println(ch.squareCheck(1));
        
    }
}

// https://www.hackerrank.com/challenges/prime-checker/problem?isFullScreen=true