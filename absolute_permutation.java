public class absolute_permutation {
    public static void main(String[] args) {
        int n =4, k =2;

        int[] a = new int[n];

        if(k>0 && n%(2*k) !=0){
            a=null;
        }

        for(int i =1; i<=n; i++){
            a[i-1] = i+k;
            // if(k>0 && i%k ==1){
            //     k *=-1;
            // }
        }

        for(int m : a){
            System.out.print(m+" ");
        }
        

       
    }
}

// https://www.hackerrank.com/challenges/absolute-permutation/problem?isFullScreen=true