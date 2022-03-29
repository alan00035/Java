package hankerrank.medium;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class hashing_SHA_256 {

    public static void main(String[] args) {
        // BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // String str = bf.readLine();
        
        String str = "HelloWorld";
        
         MessageDigest md;

        try {
            md = MessageDigest.getInstance("SHA-256");
            
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException (e);
        }
            md.update(str.getBytes());
            byte[] bt = md.digest();

            StringBuilder sb = new StringBuilder();
            for(byte b: bt){
                sb.append(String.format("%02x", b));
            }
            System.out.println(sb.toString());
    }
}

// https://www.hackerrank.com/challenges/sha-256/problem?isFullScreen=true
// reference: https://mkyong.com/java/java-md5-hashing-example/