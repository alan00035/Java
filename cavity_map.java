import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cavity_map {
    public static void main(String[] args) {
        String[] g ={"1112","1912","1892","1234"};
        List<String> grid = Arrays.asList(g);
        int n = 4;
        String new_str= "";
        List<String> new_grid = new ArrayList<>();
            
        new_grid.add(grid.get(0));
        for(int i =1; i<n-1; i++){
            char[] ch = grid.get(i).toCharArray();
                if(ch[i] > ch[i-1] && ch[i] > ch[i+1] && i!=n-1 && i!=0){
                    new_str= grid.get(i).replace(ch[i], 'X');       
                        new_grid.add(new_str);}
                else{
                    new_grid.add(grid.get(i));
                }        
        }

        new_grid.add(grid.get(n-1));
            
        for(String s :new_grid){
            System.out.print(s+" ");
        }
    }
}

// https://www.hackerrank.com/challenges/cavity-map/problem?isFullScreen=true