
public class simpleAddition {

    class Add{
        void add (int ... args){
            int sum =0;
            String sb="";
            for(int i:args){
                sum +=i;
                
                // System.out.println(""+i);
                System.out.print(sb+i);
                sb = "+";
            }
            
            System.out.println("=" + sum);
        }
    }
    
}


// https://www.hackerrank.com/challenges/simple-addition-varargs/problem?isFullScreen=true