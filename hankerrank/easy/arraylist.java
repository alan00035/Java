package hankerrank.easy;
import java.util.*;


public class arraylist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrayListNum = input.nextInt();

        List<ArrayList<Integer>> list = new ArrayList<>();
   
        for(int i =0; i< arrayListNum; i++){
          ArrayList arr = new ArrayList<>();
          int count = input.nextInt();
          for(int k=0; k<count ; k++){
              arr.add(input.nextInt());
          }
          list.add(arr);
        }
        // System.out.println(list);
        int requestNum = input.nextInt();

        for(int i=0; i<requestNum; i++){
    
        try{
            int arrPosition = input.nextInt()-1;
            int index = input.nextInt()-1;
            
            // System.out.println(index + "============" +list.get(arrPosition));
            System.out.println(list.get(arrPosition).get(index));
            
            }
        catch(Exception e){
                System.out.println("ERROR!");
            }
        }


        input.close();

    }


        // int[][] arr= new int[arrayListNum][];

        // for(int a =1; a<arrayListNum; a++){
        //     int length = input.nextInt();
        //     for (int b=0; b< length; b++){
        //         arr[a][b] = input.nextInt();
        //     }
        // }

        // int arrayIndex = input.nextInt();
        // int position =input.nextInt();

        // int a = arr[arrayIndex][position];

        // if (a != 0)

        // System.out.println(a);

        // else
        //  System.out.println("error");

        

        

    }
    



// https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true