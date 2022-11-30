public class strong_password {
    public static void main(String[] args) {
        String str = "ab1";
        int n = str.length();
        int gap = 6-n;
        int missing = checkPassword(str);
        
        if(gap>missing){
           System.out.println(gap);

        }
        else{
           System.out.println(missing);
        }
        
    }
    static int checkPassword(String str){
        int count=0, num=0,u=0,l=0,sp=0;
        for(char c : str.toCharArray()){
            if(Character.isDigit(c)){
                num++;
            }
            if(Character.isUpperCase(c)){
                u++;
            }
            if(Character.isLowerCase(c)){
                l++;
            }
            else{
                sp++;
            }
        }

        if(num==0)count+=1;
        if(u==0) count+=1;
        if(l==0) count+=1;
        if(sp==0) count+=1;
        return count;
    }

    
}


// https://www.hackerrank.com/challenges/strong-password/problem?isFullScreen=true