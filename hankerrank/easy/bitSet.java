import java.util.*;

public class bitSet {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int operations = input.nextInt();
        
        BitSet set1 = new BitSet(length);
        BitSet set2 = new BitSet(length);
        
        while(operations >0){
            String op = input.next();
            int setInt1 = input.nextInt();
            int setInt2 = input.nextInt();
            
            operations--; 
            switch (op){
                case "AND": if(setInt1==1) set1.and(set2); else set2.and(set1); break;
                case "OR": if(setInt1==1) set1.or(set2);else set2.or(set1); break;
                case "XOR": if(setInt1==1) set1.xor(set2);else set2.xor(set1); break;
                case "SET": if(setInt1 ==1) set1.set(setInt2, true); else set2.set(setInt2,true);break;
                case "FLIP": if (setInt1==1) set1.flip(setInt2); else set2.flip(setInt2);break;
            }
              
            System.out.println(set1.cardinality()+ " " +set2.cardinality());
        }
        input.close();
    }

    
    
}






// https://www.hackerrank.com/challenges/java-bitset/problem?isFullScreen=true