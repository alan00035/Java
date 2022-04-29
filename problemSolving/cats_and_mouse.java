import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cats_and_mouse {
    public static void main(String[] args) {
        int q =2;

        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        while(q --> 0){
            String [] arr = input.nextLine().trim().split(" ");
            

            int xCatA =Integer.parseInt(arr[0]);
            int yCatB =Integer.parseInt(arr[1]);
            int MouseC =Integer.parseInt(arr[2]);

            int distanceAtoC =Math.abs(xCatA-MouseC);
            int distanceBtoC = Math.abs(yCatB-MouseC);
            if( distanceAtoC == distanceBtoC){
                System.out.println("Mouse C");
            }
            else 
                System.out.println((distanceAtoC < distanceBtoC) ? "Cat A" : "Cat B");
        }
        
        
        

    }
}
// https://www.hackerrank.com/challenges/cats-and-a-mouse/problem?isFullScreen=true