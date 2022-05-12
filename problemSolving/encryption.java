

public class encryption {
    public static void main(String[] args) {
        // String s ="if man was meant to stay on the ground god would have given us roots ";
        // String s="haveaniceday";
        String s ="clu hlt io";
        String regex ="\\s+";

        String str = s.replaceAll(regex, "");

        double root = Math.sqrt(str.length());

        int up =(int)Math.ceil(root);
        // int down =  (int)Math.floor(root)*up <str.length() ? up: (int)Math.floor(root);

        String sub = "";

        // System.out.println(str);

        for(int n =0; n< up ; n++){ 
            for(int i =n; i<str.length(); i+=up){
               char ch = str.charAt(i);
                sub +=ch;
                // continue;
            }    
            sub += " ";
            
        }
        System.out.println(sub);
        
    }
}

// https://www.hackerrank.com/challenges/encryption/problem?isFullScreen=true