import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class encryption {
    public static void main(String[] args) {
        String s ="if man was meant to stay on the ground god would have given us roots ";
        // String s="haveaniceday";
        // String s ="clu hlt io";s
        String regex ="\\s+";

        String str = s.replaceAll(regex, "");

        double root = Math.sqrt(str.length());

        int up =(int)Math.ceil(root);
        int down =  (int)Math.floor(root)*up <str.length() ? up: (int)Math.floor(root);

        // System.out.println(down+"  "+up);

        List<String> stringList = new ArrayList<>();
        List<String> newList = new ArrayList<>();
    
        StringBuilder sb = new StringBuilder();

        int gap = Math.abs(up*down-str.length());

        for(int n =0; n< up || n<gap; n++){
            for(int i =0; i<str.length(); i+=up){
                    sb.append(str.charAt(i+n)).toString();
                    System.out.println(sb);
            }

           
                   
        }

            // System.out.println(sb);
       
        }
     
}
