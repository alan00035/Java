import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class climbingTheLeaderboard {
    public static void main(String[] args) {
         Integer [] a ={100,90,90,80};
         Integer [] b ={70,80,105};

         List<Integer> ranked = Arrays.asList(a);
         List<Integer> player = Arrays.asList(b);

         HashSet<Integer> hs = new HashSet<>();
            
        for(int i: ranked){
            hs.add(i);
        }
              
         List<Integer> ranked_update = new ArrayList<>();
         for(int i: hs){
             ranked_update.add(i);
         }
         
         List<Integer> index = new ArrayList<>();

         for(int i : b){
            ranked_update.add(i);
            ranked_update.sort(Comparator.reverseOrder());
            int indexPlay = ranked_update.indexOf(i)+1;
            index.add(indexPlay);
         }

        //  index.sort(Comparator.reverseOrder());

         System.out.println(index);

 
         



    }   
}

// int results[] = new int[alice.length];
// int rank = 1;
// int rankScore = scores[0];

// for (int a = alice.length - 1, s = 0; a >= 0; a--) {
// 	if (alice[a] < rankScore) {
// 		for (; s < scores.length; s++) {
// 			if (scores[s] < rankScore) {
// 				rank++;
// 				rankScore = scores[s];
// 			}				
// 			if(alice[a] >= scores[s]) break;
// 		}
// 	}

// 	results[a] = s == scores.length ? rank + 1 : rank;
// }

// return results;