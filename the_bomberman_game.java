import java.util.ArrayList;
import java.util.List;

public class the_bomberman_game {
    public static void main(String[] args) {
        int n =3; //seconds tp simiulate
        List<String> grid = new ArrayList<>();
        String a1=".......";String a2 = "...0...";String a3 ="....0.."; String a4 ="......."; String a5 ="00.....";String a6="00.....";

        grid.add(a1);grid.add(a2);grid.add(a3);grid.add(a4);grid.add(a5);grid.add(a6);
        // int[][] arr = new int[6][7];
        

        //  1)gird list is the initial stage with bomb 2)  sec one - do nothing
        //  3) sec two - plants bombs in all cells; 4) sec three - initial bomb explored
        //  then repeat 3 & 4

        int x,y;
        for(x=0; x< grid.size(); x++){
          for(y=0; y<grid.get(0).length(); y++){
            if(grid.get(x).charAt(y) == '0'){
                System.out.print(y);
            }
            
          }
          System.out.println();
        }
    ;

    }
}

// https://www.hackerrank.com/challenges/bomber-man/problem?isFullScreen=true