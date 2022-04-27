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
            
         for(int i=0; i< a.length; i++){
             int temp = ranked.get(i);
             hs.add(temp);
         }
              
         List<Integer> ranked_update = new ArrayList<>();
         for(int i: hs){
             ranked_update.add(i);
         }

         ranked_update.sort(Comparator.reverseOrder());
         
         int b1 = 70;

         for(int i = ranked_update.size()-1; i>=0; i--)
            if(b1<ranked_update.get(i)){
                System.out.println(ranked_update.get(i));
            }

 



    }   
}
