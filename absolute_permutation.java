public class absolute_permutation {
    public static void main(String[] args) {
        int n =4, k =2;

        int[] a = new int[n+1];

        int i,j ;
        for(i =1; i<=n; i++){
                a[i] = i;
            //    if(Math.abs(a[i]-i) == k );
            //     a[i] = k+i;
            if(a[i]-i ==k); a[i] = k+i;
            if(a[i]-i == -k); a[i] = i-k;
                System.out.print(a[i]+" ");
        }
        
        // for(int m : a){
        //     System.out.print(m+" ");
        // }
        

       
    }
}

// https://www.hackerrank.com/challenges/absolute-permutation/problem?isFullScreen=true