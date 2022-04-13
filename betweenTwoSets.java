import java.util.ArrayList;
import java.util.List;

public class betweenTwoSets {
    public static void main(String[] args) {
        int[] a ={2,6};
        int[] b ={24,36};

        int cnt =0;
        for(int i=1; i<=100;i++){
            boolean ok =true;
            for(int j=0; j<a.length && ok ; j++){
                if(i%a[j] !=0)
                    ok =false;
            }
            for(int j=0; j<b.length &&ok; j++){
                if(b[j]%i !=0) 
                    ok =false;
            }
            if(ok) cnt ++;
        }
            System.out.println(cnt);

    }
    
}

// https://www.hackerrank.com/challenges/between-two-sets/problem?isFullScreen=true