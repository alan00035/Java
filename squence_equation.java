import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class squence_equation {
    public static void main(String[] args) {
        // Integer[]a ={4,3,5,1,2};
        Integer[] a ={2,3,1};
        // Integer[] a ={5,2,1,3,4};


        List<Integer> p = Arrays.asList(a);
        List<Integer> p1 = new ArrayList<>();


        for(int i =0; i< p.size(); i++){

           int j =p.indexOf(p.indexOf(i+1)+1)+1;
           
            p1.add(j);

        }
        
        for(int i : p1){
            System.out.println(i);
        }
    }
}


// https://www.hackerrank.com/challenges/permutation-equation/problem?isFullScreen=true