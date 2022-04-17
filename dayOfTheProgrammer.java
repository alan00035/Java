import java.sql.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.text.DateFormatter;

public class dayOfTheProgrammer {
    public static void main(String[] args) {
        int year = 2017;
   
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        String new_date= sdf.format(new Date());

        System.out.println(new_date);
        if(year >= 1919){
            // Gregorian calendar
        }
        else{
            if(year%4 ==0){
                
            }
            // Julian calendar
    
        }

       
    }
  
    
}


// https://www.hackerrank.com/challenges/day-of-the-programmer/problem?isFullScreen=true