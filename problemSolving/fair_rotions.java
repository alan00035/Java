import java.util.Arrays;
import java.util.List;

public class fair_rotions {
    public static void main(String[] args) {
        Integer[] b = {1,2};
    
        List<Integer> B = Arrays.asList(b);

        int sum = B.stream().reduce(0, Integer::sum);

        String a =null;

        int count =0;
        if(sum %2 !=0){
           a ="NO";
        }
        else{
            for(int i =0; i<B.size()-1; i++){
                if(B.get(i)%2 != 0 ){
                    B.set(i, B.get(i)+1);
                    B.set(i+1, B.get(i+1)+1);
                    count+=2;
                }
            }
            a = String.valueOf(count);
        }

        

        System.out.println(a);

    }
}

// https://www.hackerrank.com/challenges/fair-rations/problem?isFullScreen=true