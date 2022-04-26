package problemSolving;
import java.io.Console;

public class find_digitial {
    public static void main(String[] args) {
        int n =1012;
        char[] ch = String.valueOf(n).toCharArray();


        int count=0;
        

        for(Character c: ch){
            int a = Integer.parseInt(String.valueOf(c));
            
        try {
            if((n%a)==0) 
                count++;
            
        } catch (Exception e) {
            //TODO: handle exception
        }    
            
    }
       
        System.out.println(count);        
    }           
}

// https://www.hackerrank.com/challenges/find-digits/problem?isFullScreen=true