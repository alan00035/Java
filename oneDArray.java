
import java.util.*;

import hankerrank.easy.reflection;
public class oneDArray {


    public static boolean canWin(int leap, int[] game) {
        int length = game.length;
        int lastOne = 0;
        int lastZero= 0;
        int gap = Math.abs(lastOne-lastZero);

        for(int i =0; i<length; i++){
            if(game[i] == 1){
                lastOne =i;
            }
            if(game[i]==0){
                lastZero=i;
            }
        }

        // for(int k =0; k<length; k++){
        //     for(int j=k+1; j<length; j++){
        //         if(game[k] == 0 && game[j] ==1 )
        //             lastZero =k;
        //             break;

        //     }  
        // }
            // System.out.println(lastOne);
            // System.out.println(lastZero);
        
        if(leap <= gap){
            return false;
        }
        if(leap > gap){
         for(int i =0; i<length; i++){
            if((i+leap) < length && game[i]==0 && game[i+leap]==0)
                return true;
            if((i+leap) >= length && game[i]==0 && game[i+leap-length]==0)             
                System.out.println(i + "========");
                return true; 
    
            // else 
            //     // System.out.println(i);
            //     return false;

            // if(game[i]==0 && (i+leap) >= length && game[i+leap-length+1] ==1) {return false;}
                // else
                    // System.out.println(i+"=========");
                    // System.out.println((i+leap-length) + "--------------");
                    // return false;

            }
        }
      
        
        // System.out.println(lastOne + "111111111111111");
        // System.out.println(lastZero + "00000000000000000");
    return false;
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // int q = scan.nextInt();
        // while (q-- > 0) {
        //     int n = scan.nextInt();
        //     int leap = scan.nextInt();
            
        //     int[] game = new int[n];
        //     for (int i = 0; i < n; i++) {
        //         game[i] = scan.nextInt();
        //     }
        int leap =5;
        int[] game ={0,0,0,1,1,1};
        // int[] game ={0 ,0 ,1 ,1 ,0 ,0 ,1 ,1 ,0, 0,};
            // System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
            System.out.println(canWin(leap, game));
        // }
        // scan.close();
    }
}

// https://www.hackerrank.com/challenges/java-1d-array/problem?isFullScreen=true

// https://github.com/egalli64/jexol/blob/master/src/main/java/hr/dataStructure/d1Array2/Solution.java