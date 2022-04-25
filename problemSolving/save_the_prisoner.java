package problemSolving;
public class save_the_prisoner {
    public static void main(String[] args) {
        int n =654809340   ; //prisoners
        int m =204894365     ; // candy
        int s =472730208; // distribution from chair 2 //22815232

        int sum = s+m-1;

        if(sum<=n){
            System.out.println(sum);
        }
        else{
            while(sum >n)
               sum = sum-n;
            System.out.println(sum);   
        }
        
        // int last = ((M - 1) + (S - 1)) % N + 1
    }
}

// hackerrank.com/challenges/save-the-prisoner/problem?isFullScreen=true&h_r=next-challenge&h_v=zen