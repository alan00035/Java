import java.util.Arrays;
import java.util.List;

public class jumping_on_the_cloud {
    public static void main(String[] args) {
        // Integer[] a ={0, 0, 1, 0, 0, 1, 0};
        Integer[] a={0,1,0,0,0,1,0};

        List<Integer> c = Arrays.asList(a);
        int count =0;
        int i=0;
        for(; i<c.size()-1; i++){
            if(c.get(i)==0) i++;
                count++;

        }

        System.out.println(count);

    }    
}

// https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?isFullScreen=true