import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class manasa_and_stones {
    public static void main(String[] args) {
        int n =4, a =10 , b =100;

        List<Integer> list = new ArrayList<>();

        int i;
        for(i=0; i<n; i++){
            list.add(a*i+b*((n-1)-i));
        }
  

        Collections.sort(list);

        for(int m: list){
            System.out.println(m);
        }
        
    }
}

// https://www.hackerrank.com/challenges/manasa-and-stones/problem?isFullScreen=true