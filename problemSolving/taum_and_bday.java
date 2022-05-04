import java.math.BigInteger;

public class taum_and_bday {
    public static void main(String[] args) {
        long b=27984, w=1402,bc=619246,wc=615589, z=247954;

        // long b2 = Long.valueOf(b1);
        long j = b*bc+w*wc;
        long k =wc*w+b*(wc+z);
        long q =bc*b+w*(bc+z);

        
        long result =  Math.min(Math.min(k, q),j);
        // System.out.println(j+"  "+k+"  "+q);
        System.out.println(result);
    
}
}


// https://www.hackerrank.com/challenges/taum-and-bday/problem?isFullScreen=true