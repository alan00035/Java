public class halloween_sale {
    public static void main(String[] args) {
        // int s =70, p=20, d=3,m=6,count=0, flatCount=0, total=0;
        int s =180, p=100, d=19,m=1,count=0, flatCount=0, total=0;
        int sum = s-p;

        if(sum >= p){
            
            for(int n =sum; n>0 ; n-=p){
                for(int i =p; i-d>m; i-=d){
                    p -=d;
                    sum -=p;
                    count++;
                }
            }

            flatCount = (int)Math.floor(sum/m);

            total =count+1+flatCount;

        }

        if(sum<p){
            total =1;
        }
        if(sum<0)
        {
            total =0;
        }    
        
        System.out.println(total);

    }
}

// https://www.hackerrank.com/challenges/halloween-sale/problem?isFullScreen=true