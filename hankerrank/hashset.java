import java.util.HashSet;

public class hashset {
    

    public static void main(String[] args) {
        String[] pair_left = {"john","john","john","mary","mary"};
        String[] pair_right = {"tom","mary","tom","anna","anna"};
        int t= pair_left.length;

        HashSet set = new HashSet<>();
        
        for(int j=0; j<t; j++){
            String a = pair_left[j]+" "+pair_right[j];
            set.add(a);
            System.out.println(set.size());
        }
    }
    
}
