package problemSolving;
public class sherlocks_and_squares {
    public static void main(String[] args) {
        int a =3;
        int b =9;

        int a1 = (int)Math.sqrt(a);
        int b1 = (int)Math.sqrt(b);

        if(a1*a1 ==a)
            System.out.println(b1-a1+1);
        else
            System.out.println(b1-a1);

        // (2)
        // int count =0;
        // for(int i =a; i<=b; i++){
        //     int temp = (int)Math.sqrt(i);
        //         if(temp*temp ==i){
        //             count++;
        //         }
        // }

        // System.out.println(count);

    

    }
}

// https://www.hackerrank.com/challenges/sherlock-and-squares/problem?isFullScreen=true