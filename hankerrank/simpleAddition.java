
public class simpleAddition {

    class Add{
        void add (int ... args){
            int sum =0;
            for(int i:args){
                sum +=i;
            }
        }
    }
    
}


// https://www.hackerrank.com/challenges/simple-addition-varargs/problem?isFullScreen=true