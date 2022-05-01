import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class repeated_string {
    public static void main(String[] args) {
        String s ="abcac";
        long n =10;

        long count =0;
        long extra =0;

        for(char a : s.toCharArray())
            if(a=='a')
                count++;

        long repeat = n%(s.length());
        
        for(char a: s.substring(0,(int)repeat).toCharArray())
            if(a=='a')
                extra++;
      
        long total = count*(n/s.length())+extra;

        System.out.println(total);
    }
}

// https://www.hackerrank.com/challenges/repeated-string/problem?isFullScreen=true