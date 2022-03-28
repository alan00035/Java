package hankerrank.medium;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class mdsHashing {
     

    public static void main(String[] args) {
    // BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    // String str = bf.readLine();

    String str="HelloWorld";
    MessageDigest md;
    try {
      md = MessageDigest.getInstance("MD5");
    } catch (NoSuchAlgorithmException e) {
        throw new IllegalArgumentException(e);
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


// https://www.hackerrank.com/challenges/java-md5/problem?isFullScreen=true&h_r=next-challenge&h_v=zen