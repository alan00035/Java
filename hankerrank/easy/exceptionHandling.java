import java.util.*;

public class exceptionHandling {
    public static void main(String[] args) {
        try {
            
            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            int y = input.nextInt();
    
               if( y !=0 | is32BitSignedInteger(x/y))
                  System.out.println(x/y);
                
            } catch (InputMismatchException e) {
    
                System.out.println(e.getClass().getName());
            }  
            catch (ArithmeticException e){
                System.out.println(e);
            }
        }
    
        static boolean is32BitSignedInteger(long a){
            return (a <= 2147483647) && (a >= -2147483648);
        }
}
