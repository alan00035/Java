
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;




public class elecronicsShop {
    public static void main(String[] args) {

        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // String[] bnm = scanner.nextLine().split(" ");
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        // int b = Integer.parseInt(bnm[0]);

        // int n = Integer.parseInt(bnm[1]);

        // int m = Integer.parseInt(bnm[2]);

        // int[] keyboards = new int[n];

        // String[] keyboardsItems = scanner.nextLine().split(" ");
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        // for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
        //     int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
        //     keyboards[keyboardsItr] = keyboardsItem;
        // }

        // int[] drives = new int[m];

        // String[] drivesItems = scanner.nextLine().split(" ");
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        // for (int drivesItr = 0; drivesItr < m; drivesItr++) {
        //     int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
        //     drives[drivesItr] = drivesItem;
        // }

        // /*
        //  * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        //  */

        // int moneySpent = getMoneySpent(keyboards, drives, b);

        // bufferedWriter.write(String.valueOf(moneySpent));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        // scanner.close();
        // Scanner input = new Scanner(System.in);

        // input.nextLine();

        int budget =5;
        int[] keyboards ={4};
        int[] drive ={5};
        int n = keyboards.length;
        int m = drive.length;

        // Arrays.sort(keyboards, Collections.reverseOrder());
        // Arrays.sort(drive);

        // Stack<Integer> stacks = new Stack<>();
        List<Integer> list = new ArrayList<>();

        for(int j=0; j< n; j++){
            for (int k =0; k< m; k++){
                list.add(keyboards[j]+drive[k]);
            }
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        List<Integer> newlist = new ArrayList<>();

        
        
        for(int i : list){
            if( i<=budget){
                newlist.add(i);
            }
        }

        Collections.sort(newlist,Collections.reverseOrder());
  
        if(!newlist.isEmpty())
            System.out.println(newlist.get(0));    
        else 
            System.out.println("-1");
           


        

    }
}
