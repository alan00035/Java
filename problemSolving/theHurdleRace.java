import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class theHurdleRace {
    public static void main(String[] args) {
        
        List<Integer> height= new ArrayList<>();
        height.add(1);
        height.add(6);
        height.add(3);
        height.add(5);
        height.add(2);
        int k =4; //the heights the character can jump naturally

        Collections.sort(height, Collections.reverseOrder());
        
        if(k>= height.get(0))
            System.out.println(0);
        else    
            System.out.println(height.get(0)-k);
    }
}

// https://www.hackerrank.com/challenges/the-hurdle-race/problem?isFullScreen=true