package hankerrank.medium;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import hankerrank.easy.arraylist;

public class dequeue {
    public static void main(String[] args) {
        int n =6;
        int m =3;

        // int[] list = {1091273, 1136162, 2824530 ,2734729 ,2323177, 3137151 ,8629406 ,6883839 ,7885320 ,2044883 ,4341515, 586875 ,8264254 ,1665363, 1341588 ,7133211 ,4279436 ,6467828 ,3039965 ,4913413,8109197 ,7446288 ,933620 ,1805313, 1714701, 7657821 ,5377047, 4016784 ,4026002, 4249989 ,4906039 ,5186008, 8422951, 4582608, 955808, 5694815 ,3404880, 4015801 ,5742285 ,7341183, 2820457, 9011890, 7683817, 7844258, 9748563,3093105,3562574 ,3749679, 5188118, 2141802 ,769140 ,5228806 ,17974 ,2784429, 1876068 ,8789679, 8975251, 3177120, 5085263 ,2229733, 9294901 ,8985096 ,9255638 ,1159554 ,670064 ,2954968, 2965436, 9230520, 3698479, 8245908 ,9366888, 3320158, 7199936, 3420401, 2136981, 261436, 9298127 ,2590299, 4415993, 4359652, 853882, 9373379, 915520, 7476938, 3048377, 6706061, 8771123, 1377384, 1210133 ,4440721 ,7401339, 3051752, 6750680 ,528148, 2284879 ,9291371, 9455156 ,5318000 ,5120825, 584357};
        int[] list ={5,3, 5 ,2 ,3, 2};
        HashSet set = new HashSet<>();
        int max =Integer.MIN_VALUE;


        Deque<Integer> deque = new ArrayDeque<>();

            for(int i: list){
                deque.add(i);
                set.add(i);
            // if(set.size() >= m) {
            //     System.out.println(m);
            // }
            // else if(set.size() <m ){
            //     System.out.println(set.size());
            // }

        
  
            if (deque.size() == m) {
                if (set.size() > max) 
                    max = set.size();
                int first = deque.remove();
                if (!deque.contains(first)) 
                    set.remove(first);
            }
        }
            // System.out.println(deque);
            // System.out.println(set);
        }


    
}

// https://www.hackerrank.com/challenges/java-dequeue/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
// https://programs.programmingoneonone.com/2021/02/hackerrank-java-dequeue-solution.html
