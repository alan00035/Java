import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class cavity_map {
    public static void main(String[] args) {

            Scanner in=new Scanner(System.in);
            int n=in.nextInt(),i,j;
            char c[][]=new char[n][];
            for(i=0;i<n;i++)
                {
                    c[i]=in.next().toCharArray();
                }
            for(i=1;i<n-1;i++)                
                {
                    for(j=1;j<n-1;j++)
                        {
                            if(c[i][j]>c[i][j-1] && c[i][j]>c[i][j+1] && c[i][j]>c[i-1][j] && c[i][j]>c[i+1][j])
                                c[i][j]='X';
                        }
                }
            for(i=0;i<n;i++)
                System.out.println(new String(c[i]));
        
}

        // String[] g ={"9"};
        // List<String> grid = Arrays.asList(g);
        // int n = 1;
        // String new_str= "";
        // List<String> new_grid = new ArrayList<>();
            
        // new_grid.add(grid.get(0));
        // for(int i =1; i<n-1; i++){
        //     char[] ch = grid.get(i).toCharArray();
        //         if(ch[i] > ch[i-1] && ch[i] > ch[i+1] && i!=n-1 && i!=0){
        //             new_str= grid.get(i).replace(ch[i], 'X');       
        //                 new_grid.add(new_str);}
        //         else{
        //             new_grid.add(grid.get(i));
        //         }        
        // }

        // new_grid.add(grid.get(n-1));
            
        // for(String s :new_grid){
        //     System.out.print(s+" ");
        // }
    }
}

// https://www.hackerrank.com/challenges/cavity-map/problem?isFullScreen=true