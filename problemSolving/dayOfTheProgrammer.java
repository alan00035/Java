
public class dayOfTheProgrammer {
    public static void main(String[] args) {
        int year = 1984;
        // int numOfDays =256;
        // SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        // // String new_date= sdf.format(new Date());
        // String new_date=null;



        //Julian year
        if(year < 1918){
           System.out.println( year%4 ==0? "12.09." +year : "13.09."+year);
        }
        else if(year == 1918){
            System.out.println("26.09.1918");
        }
        // Gregorian calendar
        else{
            System.out.println( year%400 ==0 || (year%4==0 && year%100 !=0) ? "12.09."+year : "13.09."+ year);
        }

    
       
    }
  
    
}


// https://www.hackerrank.com/challenges/day-of-the-programmer/problem?isFullScreen=true