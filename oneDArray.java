public class oneDArray {
    public static void main(String[] args) {

        int[] arr1 = {0 ,0 ,0, 0, 0};  //5 3
        int[] arr2 = {0 ,0 ,0, 1,1,1}; // 6 5
        int[] arr3 = {0 ,0 ,1,1,1, 0};   // 6 3
        int[] arr4 = {0 ,1 ,0}; // 3 1

        game g = new game();
       System.out.println(g.playGame(arr2, 6, 5));

     }
}

class game{
    boolean playGame(int[] arr, int gameSize, int leap){
        int index =0;

        
        for(int i =0; i<gameSize; i++){
            if(i+leap < gameSize && arr[i]==0 && arr[i+leap]==0)
                return true;
            if(i+leap >= gameSize)    
                if(arr[i] ==0) 
                    if (arr[ Math.abs(i+leap-gameSize)] ==0 )
                        return true;
            else    
                return false;
        }
        
        return true;
    }
}

