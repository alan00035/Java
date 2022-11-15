public class strong_password {
    public static void main(String[] args) {
        String password ="ab1";
        int n = password.length();

        if(!checkLength(n) ){
            System.out.println(6-n);
        }
        

    }

    public static boolean checkLength(int n ){
        if(n<6)
            return false;
        else
            return true;

    }
}

// https://www.hackerrank.com/challenges/strong-password/problem?isFullScreen=true