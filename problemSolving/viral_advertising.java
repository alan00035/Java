
public class viral_advertising {
    public static void main(String[] args) {
        int n = 5;
        int people =5;
        int sum =0;
        
        for(int i=0; i<n; i++){
            // people =(int) Math.floor(people/2);
            people = people/2;
            sum += people;
            people *=3;
        }
        
        System.out.println(sum);

    }
}


// https://www.hackerrank.com/challenges/strange-advertising/problem?isFullScreen=true&h_r=next-challenge&h_v=zen