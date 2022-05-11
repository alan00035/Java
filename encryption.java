import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class encryption {
    public static void main(String[] args) {
        String s ="if man was meant to stay on the ground god would have given us roots ";
        // String s="haveaniceday";
        String regex ="\\s+";

        String str = s.replaceAll(regex, "");

        double root = Math.sqrt(str.length());

        int down = (int)Math.floor(root); //7
        int up = (int)Math.ceil(root);    //8

        List<String> stringList = new ArrayList<>();
        List<String> newList = new ArrayList<>();
    

        // for(int i =0; i<str.length()-up; i+=up){
        //     stringList.add(str.substring(i, i+up));
            
        // }

        //     stringList.add(str.substring((down-1)*up, str.length()));
           
        // System.out.println(stringList);
            StringBuilder sb = new StringBuilder();

            for(int i =0; i<str.length(); i+=up){
           
                    sb.append(str.charAt(i)).toString();
            }
                    System.out.println(sb);
    
            // System.out.println(sb+" ");
       
        }
     
}
