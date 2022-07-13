import java.util.ArrayList;
import java.util.List;

public class the_grid_search {
    public static void main(String[] args) {

        String ans ="No";

        String a = "1234567890";
        String b ="0987654321";
        String c ="1111111111";
        String d = "1111111111";
        String e ="2222222222";
        List<String> G = new ArrayList<>();
        G.add(a); G.add(b);G.add(c);G.add(d);G.add(e);
        

        String a1 ="876543";
        String b1="111111";
        String c1="111111";
        List<String> P = new ArrayList<>();
        P.add(a1); P.add(b1); P.add(c1);

        int i=0;

        int m,n;
        for(m =1; m<G.size(); m++){
            for(n=0; n<P.size(); n++){
                if(G.get(m).substring(2).contains(P.get(n))){
                   System.out.println(m);             
                }

            }
            
        }
   

    }
}

// https://www.hackerrank.com/challenges/the-grid-search/problem?isFullScreen=true