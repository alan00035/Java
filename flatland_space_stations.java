import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class flatland_space_stations {
    public static void main(String[] args) {
        int n =100; //cites
        int[] c ={0};
        // int[] c= {68, 81, 46, 54, 30, 11, 19, 23, 22, 12, 38, 91, 48, 75, 26, 86, 29, 83, 62}; //cites has space station
        int m =c.length;
        int max = 0;

        Arrays.sort(c);

        // for(int i :c)
        //     System.out.print(i+" ");

        if(n !=m && m !=1) {
            for(int i=1; i<c.length; i++){
                int middle = (c[i-1]+c[i])/2;
                int distance = middle-c[i-1] > middle-c[i] ? middle-c[i-1] : middle-c[i];
                if(max < distance)
                    max = distance;
                if(max < n- c[c.length-1] || max < c[0])    
                    max = n-c[c.length-1]-1 > c[0]?n-c[c.length-1]-1  :c[0] ;
            }

        }
        if(m==n ){
            max =0;
        }
        if(m ==1 && n!=m){
            max = n-m;
        }
        System.out.println(max);

    }
}

// https://www.hackerrank.com/challenges/flatland-space-stations/problem?isFullScreen=true