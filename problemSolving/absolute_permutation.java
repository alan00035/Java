import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class absolute_permutation {
    public static void main(String[] args) {
        int n =10, k =9;

        
        int[] a = new int[n];


        List<Integer> list = new ArrayList<>();

        list = Arrays.stream(a).boxed().collect(Collectors.toList());

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

// public static List<Integer> absolutePermutation(int n, int k) {
//     int ans[]=new int[n];
//     int no[]={-1};
//     int ok[]=new int[n];
//     for(int i=0;i<n;i++)ok[i]=i+1;
//     for(int i=0;i<n;i++)
//     {
//         int a=(i+1+k);
//         int b=(i+1-k);
//         if(b>=1 && b <=n && ok[b-1]!=-1)
//         {
//                 ans[i]=b;
//                 ok[b-1]=-1;                    
//         }
//         else if(a>=1 && a<=n && ok[a-1]!=-1)
//         {
//             ans[i]=a;
//             ok[a-1]=-1;
//         }
//         else return  Arrays.stream(no).boxed().collect(Collectors.toList());
//     }
//     return  Arrays.stream(ans).boxed().collect(Collectors.toList());

// }