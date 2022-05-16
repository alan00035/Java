import java.sql.Time;

public class the_times_in_words {
    private static final String[] TIME= {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine" };
    public static void main(String[] args) {

        int h = 7, m =15;
        if(m ==0){
            System.out.println(TIME[h] + " o' clock");
        }
        if(m ==30){
            System.out.println("half past " + TIME[h]);
        }

        if(m >30){
            h = h+1;
            m = 60-m;
            if(m==15){
                System.out.println(TIME[m]+ " to "+TIME[h]);
            }
            else
            System.out.println(TIME[m] + " minutes to "+TIME[h]);
        }
        else if(m<30 && m !=0){
            if(m ==15){
                System.out.println(TIME[m]+ " past " +TIME[h]);
            }
            if(m ==1){
                System.out.println(TIME[m]+ " minute past "+ TIME[h]);
            }
            else if(m!=15 && m!=1)
            System.out.println(TIME[m]+ " minutes past "+ TIME[h]);
            
        }

    }    
}


// https://www.hackerrank.com/challenges/the-time-in-words/problem?isFullScreen=true