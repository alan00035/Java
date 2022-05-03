import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;



public class equalize_the_array {
    public static void main(String[] args) {
        Integer[] a ={96 ,96 ,45 ,52 ,73 ,44 ,51, 96};
        List<Integer> arr = Arrays.asList(a);

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0; i< arr.size(); i++){
            int key = arr.get(i);
            if(hm.containsKey(key))
                hm.put(key, hm.get(key)+1);
            else
                hm.put(key, 1);}
               
        List<Integer> list = new ArrayList<>();        
        for(Entry<Integer,Integer> entry : hm.entrySet()){
            list.add(entry.getValue());
        }
  
        Collections.sort(list, Comparator.reverseOrder());

        int sum = list.stream().collect(Collectors.summingInt(Integer::intValue));
        
        System.out.println(arr.size()-15);

        }
}

// https://www.hackerrank.com/challenges/equality-in-a-array/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

// public static int minDeletions(int[] a) {
//     int max = 1;
//     Map<Integer, Integer> nums = new HashMap<>();
//     for (int i : a)
//         if (!nums.containsKey(i))
//             nums.put(i, 1);
//         else {
//             nums.put(i, nums.get(i) + 1);
//             if (max < nums.get(i))
//                 max = nums.get(i);
//         }
//     return a.length - max;
// }