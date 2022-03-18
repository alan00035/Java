package hankerrank.medium;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;

import hankerrank.easy.arraylist;

public class dequeue {
    public static void main(String[] args) {
        int N =6;
        int M =3;

        int[] list = {5 ,3 ,5 ,2 ,3 ,2};
        int[] sub = new int[M];
        HashSet set = new HashSet<>();
        int max =0;

        Deque<Integer> deque = new ArrayDeque<>();

            for(int i: list){
                deque.add(i);
                set.add(i);
            }
           
            
            if (deque.size() == M) {
                if (set.size() > max) max = set.size();
                int first = deque.remove();
                if (!deque.contains(first)) set.remove(first);
            }

            System.out.println(set);
        }


    
}

// https://www.hackerrank.com/challenges/java-dequeue/problem?isFullScreen=true&h_r=next-challenge&h_v=zen