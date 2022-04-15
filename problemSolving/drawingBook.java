package problemSolving;
public class drawingBook {
    public static void main(String[] args) {
        //page 1 is on the right, last page is on the left;

        int n = 37455; //book total pages
        int p = 29835; // page position


        
        int front =p/2;
        int back = n/2-p/2;
        System.out.println(front > back ? back: front);

        // if (p ==1 || p ==n )
        //     System.out.println(0);
        // else
        //     if(n%2 ==0){
        //         back = Math.abs((n-1-p)/2);
        //         System.out.println(front>back ? back:front);
        //     }
        //     else
        //         back = Math.abs((n-p)/2); 
        //         System.out.println(front>back ? back:front);

    }   
}


// https://www.hackerrank.com/challenges/drawing-book/problem?isFullScreen=true