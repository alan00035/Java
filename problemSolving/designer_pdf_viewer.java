package problemSolving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class designer_pdf_viewer{
    public static void main(String[] args) {
        int[] heigh = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        // char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char[] alphabet ="abcdefghijklmnopqrstuvwxyz".toCharArray();

        HashMap<Character, Integer> hs = new HashMap<>();

        for(int i=0; i<26; i++){
            hs.put(alphabet[i], heigh[i]);
        }

        String word ="abc";
        char[] check = word.toCharArray();

        List<Integer> a = new ArrayList<>();

        for(char c: check){
            a.add(hs.get(c));
        }

        int totalHeight = Collections.max(a)*check.length;

        System.out.println(totalHeight);
    }

}


// https://www.hackerrank.com/challenges/designer-pdf-viewer/problem?isFullScreen=true