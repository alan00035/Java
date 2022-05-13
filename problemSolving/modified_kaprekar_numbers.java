import java.util.ArrayList;
import java.util.List;

public class modified_kaprekar_numbers {
    public static void main(String[] args) {
        int p =1, q=99999;

        System.out.println(validate(77778));


        // List<Integer> list = new ArrayList<>();

        
        // for(int i =p; i<q+1; i++){
        //     if(validate(i) ==true)
        //         list.add(i);
        // }

        // if(list.size() ==0) System.out.println("INVALID RANGE");
        // else list.stream().forEach(i -> System.out.print(i+" "));

    }    
     
    
    private static boolean validate(int i){

        String square = String.valueOf((long)i * (long)i);

        int d = square.length();
        int a = 0, b=0;

        if( i==1 ){
            return true;
        }
        if(i!=1 && d ==1){
            return false;
        }

       else{ 
        a=Integer.parseInt(square.substring(0, d/2));   
        b = Integer.parseInt(square.substring(d/2,d));

        return (a+b) ==i? true :false;
      
    }

}
}

// https://www.hackerrank.com/challenges/kaprekar-numbers/problem?isFullScreen=true