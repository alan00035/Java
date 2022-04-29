
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class beautiful_days_at_the_movie {
    public static void main(String[] args) {

        int k=6;
        int i =20;
        int j =23;
        int count =0;

        for(int a=i; a<=j; a++){
           if( Math.abs(a- reverseNumber(a))%k==0){
            count++;
           }
              
        }
        System.out.println(count);
        }
        

        private static int reverseNumber(int i){

            String str = String.valueOf(i);


            List<Character> list = new ArrayList<>();
            for(char c: str.toCharArray())
                list.add(c);

            Collections.reverse(list);
            
            StringBuilder sb = new StringBuilder();
            String reversedStr =null;

            for(char c: list)
              reversedStr= sb.append(c).toString();


            int reversed =Integer.parseInt(reversedStr);

           return reversed;
        }
            
}


// https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

// public static void main(String[] args) {
//     /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//     Scanner in = new Scanner(System.in);
//     int i = in.nextInt();
//     int j = in.nextInt();
//     int k = in.nextInt();
//     int count = 0;
    
//     for (int a=i;j>a; a++){
//         StringBuilder temp = new StringBuilder();
//         temp.append(a);
//         temp=temp.reverse();
//         String temp1 = temp.toString();
//         int aRev = Integer.parseInt(temp1);
//         if(Math.abs((a-aRev)%k)==0){
//             count++;
//         }
//     }
    
//     System.out.println(count);
// }
// }