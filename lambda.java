import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

interface functionLambda{
    boolean isOdd();
    boolean isPrime();
    boolean isPalindrome();
}

public class lambda {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());
        
        while(T-- >0){
            String str = bf.readLine();
            StringTokenizer token = new StringTokenizer(str," ");
            if(token.nextToken()!=null){
                int check = Integer.parseInt(token.nextToken());
                int num = Integer.parseInt(token.nextToken());
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