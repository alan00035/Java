import java.util.*;

public class list {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        List l = new ArrayList<>();
        
        for (int i =0; i<length; i++){    
            l.add(input.nextInt());
        }
        
        int request = input.nextInt();
        
        for(int i =0; i< request; i++){
            String s = input.next();
            if(s.equalsIgnoreCase("Insert")){
                int index = input.nextInt();
                int obj = input.nextInt();
                l.add(index,obj);
                // System.out.println(l);
            }
                
            else 
                l.remove(input.nextInt());
                // System.out.println(input.nextInt());
            
        }
        for (Object o: l)
        System.out.print(o+" ");
        
        input.close();
    }
    
}
