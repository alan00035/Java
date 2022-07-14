import java.util.ArrayList;
import java.util.List;

public class the_grid_search {
    public static void main(String[] args) {

        String ans ="NO";

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

        for(int i=0;i<=(G.size()-P.size());i++)
        {
            for(int j=0;j<=(G.get(0).length()-P.get(0).length());j++)
            {
                int x=i;
                int count=0;
                if(G.get(i).substring(j,j+P.get(0).length()).equals(P.get(0)))
                {
                    count++;
                    for(int k=1;k<P.size();k++)
                    {
                        i++;   
                        if(G.get(i).substring(j,j+P.get(0).length()).equals(P.get(k)))count++;
                        else break;
                         
                    }
                    if(count==P.size())ans= "YES";
                }
                i=x;
            }
        }


            System.out.println(ans);
    }
    
}
