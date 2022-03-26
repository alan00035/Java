import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

interface checkOdd{
    boolean isOdd(int i);
}

interface checkPrime{
    boolean isPrime(int i);
}

interface checkPalindrome{
    boolean isPalindrome(int i);
}

public class lambda {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        
        while(T --> 0){
            String str = bf.readLine();
            StringTokenizer token = new StringTokenizer(str);
                int check = Integer.parseInt(token.nextToken());
                int num = Integer.parseInt(token.nextToken());
            if(check ==1){
                checkOdd co =(int i) -> { i%2 !=0};
                System.out.println(co.isOdd( num) ? "ODD" : "EVEN");
                
            }else if(check ==2){
                checkPrime cp = (int i) -> {new BigInteger(String.valueOf(i)).isProbablePrime(1);
                System.out.println(cp.isPrime( num) ? "PRIME" : "COMPOSITE"); } 
            }else {
                
            }
            
        }
    
    
}

}

class method1 implements functionLambda{

    @Override
    public boolean isOdd() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isPrime() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isPalindrome() {
        // TODO Auto-generated method stub
        return false;
    }
    
}


// https://www.hackerrank.com/challenges/java-lambda-expressions/problem?isFullScreen=true&h_r=next-challenge&h_v=zen