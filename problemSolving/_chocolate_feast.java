public class _chocolate_feast {
    public static void main(String[] args) {
        int n =7,c=3,m=2;
        
        int eat=0, wrap=0;
        int initialBar = n/c;

  
        while (initialBar >0){          
            eat += initialBar;
            wrap +=initialBar;
            initialBar=wrap/m;
            wrap=wrap%m;
        }
        

        System.out.println(eat);
    }
}

// https://www.hackerrank.com/challenges/chocolate-feast/problem?isFullScreen=true