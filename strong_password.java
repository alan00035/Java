import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class strong_password {
    public static void main(String[] args) {
        String password ="ab1";
        int n = password.length();

        if(!checkLength(n) ){
            System.out.println(6-n);
        }
        

    }
    public static int checkString(String str){
        int i =0;
        

        for(char ch : str.toCharArray()){
            if(!Character.isDigit(ch)){
                i++;
            }
            else if(!Character.isUpperCase(ch)){
                i++;
            }
            else if(!Character.isLowerCase(ch)){
                i++;
            }
            else if(!checkSpecialChar(str)){
                i++;
            }
        }

        return i;
    }

    public static boolean checkSpecialChar(String s){
        Pattern p = Pattern.compile("[a-z0-9]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(s);
        if(m.find())
            return true; //only digital and letters
        else
            return false; //contains special char    
    }
    public static boolean checkLength(int n ){
        if(n<6)
            return false;
        else
            return true;

    }
}

// https://www.hackerrank.com/challenges/strong-password/problem?isFullScreen=true