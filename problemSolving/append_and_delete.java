
import java.util.ArrayList;
import java.util.List;

public class append_and_delete {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcdert";

        int k =10;  //need EXACT steps, not less

        int gap = Math.abs(s.length()-t.length());

        int step =0;
        
        // List index = new ArrayList<>();

        if(k> s.length()+t.length()){
            System.out.println("yes");
        }
        else{
            int i =0;
            for( ; i<s.length() && i<t.length(); i++){
                if(s.charAt(i) !=t.charAt(i)){
                    break;
                }
            }

        step = (s.length()-i) + (t.length() -i) ;
        }
         
            
            // for(int i =0; i< (s.length()+t.length()-gap)/2; i++){
            //         if(s.charAt(i) != t.charAt(i))
            //                 index.add(i);
            //             }

            // if(!index.isEmpty())
            //     step = s.length()+t.length() - (int)index.get(0) *2;
            // else 
            
            //      if(gap<0){
            //         step = s.length()+t.length();
            //     }
                        

      

        System.out.println(step<=k && (k-step)%2 ==0 ? "Yes":"No");

    }
}

// https://www.hackerrank.com/challenges/append-and-delete/problem?isFullScreen=true

// public class Solution {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String s = scan.next();
//         String t = scan.next();
//         int k = scan.nextInt();
//         scan.close();
//         System.out.println(canConvert(s, t, k) ? "Yes" : "No");
//     }    

//     private static boolean canConvert(String s, String t, int k) {
//         /* Case 1 */
//         if (s.length() + t.length() <= k) {
//             return true;
//         }
        
//         /* Case 2 */
//         int i = 0; // represents index of 1st non-matching character
//         for (   ; i < s.length() && i < t.length(); i++) {
//             if (s.charAt(i) != t.charAt(i)) {
//                 break;
//             }
//         }
//         int minOperations = (s.length() - i) + (t.length() - i);
//         return k >= minOperations && (k - minOperations) % 2 == 0;
//     }
// }