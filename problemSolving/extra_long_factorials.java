
import java.math.BigDecimal;
import java.math.BigInteger;

public class extra_long_factorials {
    public static void main(String[] args) {
        int i=25;
        BigInteger val = new BigInteger(String.valueOf(1)) ;
        for(; i>0 ; i--){
            BigInteger a = new BigInteger(String.valueOf(i));
            //  val *= i; 
            val= val.multiply(a);
        }
      
        System.out.println(val);
    }
}

// https://www.hackerrank.com/challenges/extra-long-factorials/problem?isFullScreen=true