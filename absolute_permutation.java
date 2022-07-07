import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class absolute_permutation {
    public static void main(String[] args) {
        int n =10, k =9;

        
        int[] a = new int[n];


        List<Integer> list = new ArrayList<>();

        if(k>0 && n%(2*k) !=0){
            list.add(-1);

        }

        for(int i =1; i<=n; i++){
            a[i-1] = i+k;
            if(k>0 && i%k ==0){
                k *=-1;
            }
        }

        for(int m : a){
            System.out.print(m+" ");
        }
        

       
    }
}

// https://www.hackerrank.com/challenges/absolute-permutation/problem?isFullScreen=true