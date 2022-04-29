import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class library_fine {
    public static void main(String[] args) {
        int d1=14; int m1=7; int y1=2018;
        int d2=5; int m2=7; int y2=2018;

        if(d1>d2 && m1==m2 && y1==y2){
            System.out.println(15*(d1-d2));
        }
        if(m1>m2 && y1==y2){
            System.out.println( 500*(m1-m2));
        }
        if(y1>y2){
            System.out.println(10000);
        }


    }
}

// https://www.hackerrank.com/challenges/library-fine/problem?isFullScreen=true