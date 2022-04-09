import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class breakingTheRecords {

    public static void main(String[] args) throws IOException {
        int highScore =0, lowScore=0;

        // BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        // int length = Integer.parseInt(bf.readLine().trim()));
        // List<Integer> scores =Stream.of(bf.readLine().replaceAll("\\s+$", "").split(" "))
        //                         .map(Integer::parseInt).collect(toList());

        int length = 10;
        List<Integer> score = new ArrayList<>();
        int[] arr = {3, 4 ,21 ,36 ,10 ,28 ,35 ,5 ,24, 42};

        for(int i:arr){
            score.add(i);
        }

        System.out.println(score);

    }
    
}


// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true