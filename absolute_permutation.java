public class absolute_permutation {
    public static void main(String[] args) {
        int n =4, k =2;

        int[] a = new int[n+1];

        int i ;
        for(i=1; i<n+1; i++){
            if(Math.abs(a[i]-i) ==k){
                a[i] =k+i;
            }
        }

        for(int j:a){
            System.out.print(j+" ");
        }
        

       
    }
}

// https://www.hackerrank.com/challenges/absolute-permutation/problem?isFullScreen=true