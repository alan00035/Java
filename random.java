import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import hankerrank.easy.list;

public class random {
    
    public static void main(String[] args) {
        String str = "1 4 4 4 5 3";
        
        String[] arr = str.split(" ");
        List<String> list = new ArrayList<>();
        
        for(String s:arr){
           list.add(s);
        }

        System.out.println(list);
    }
}
