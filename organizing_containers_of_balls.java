import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import hankerrank.easy.list;

public class organizing_containers_of_balls {
    public static void main(String[] args) {
        Integer[] a1 ={1,3,1};
        Integer[] a2 = {2,1,2};
        Integer[] a3 ={3,3,3};

        
        List<Integer> b1 = Arrays.asList(a1);
        List<Integer> b2 = Arrays.asList(a2);
        List<Integer> b3 = Arrays.asList(a3);

        List<List<Integer>> container = new ArrayList<>();

        container.add(b1); container.add(b2); container.add(b3);
}

}
// https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem?isFullScreen=true