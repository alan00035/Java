package problemSolving;
public class jumping_on_the_clouds_revisited {
    public static void main(String[] args) {
        // int[] c={0 ,0 ,1 ,0, 0, 1, 1, 0};
        int [] c ={1, 1 ,1 ,0 ,1 ,1 ,0 ,0 ,0 ,0};
        // int[] c ={0,0,1,0};
        int k =2;
        int n = c.length;
        int e =100; //energy level
        
        for(int i =0; i<n; i+=k){
            // int jumpIndex = (i+k)%n;
            // int cloud = c[jumpIndex];
            e = e-1-2*c[i];
            // // System.out.println(cloud);
            // if(cloud ==0){
            //     e-=1;
            // }
            // if(cloud ==1){
            //     e-=3;
            // }
             
        }

        System.out.println(e);
    }
}


// https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem?isFullScreen=true