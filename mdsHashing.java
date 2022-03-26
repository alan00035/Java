import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class mdsHashing {
     

    public static void main(String[] args) throws NoSuchAlgorithmException {
    // BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    // String str = bf.readLine();

    String str="HelloWorld";

    MessageDigest md = MessageDigest.getInstance("MDS");
        md.update(str.getBytes());
        byte[] bt = md.digest();
        // String hashString= 

    }    
    
    
}


// https://www.hackerrank.com/challenges/java-md5/problem?isFullScreen=true&h_r=next-challenge&h_v=zen