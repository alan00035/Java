import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cavity_map {
    public static void main(String[] args) {
        String[] g ={"988","191","111"};
        List<String> grid = Arrays.asList(g);
        int n = 3;
        String new_str= "";
        List<String> new_grid = new ArrayList<>();
            
        for(int i =0; i<n; i++){
            char[] ch = grid.get(i).toCharArray();
                if(ch[i] == '9' && i!=n-1 && i!=0){
                    new_str= grid.get(i).replace('9', 'X');       
                        new_grid.add(new_str);}
                else{
                    new_grid.add(grid.get(i));
                }        
        }
            
        // for(String s :grid){
        //     System.out.print(s+" ");
        // }
    }
}

// https://www.hackerrank.com/challenges/cavity-map/problem?isFullScreen=true