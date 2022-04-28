import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class circular_array_rotation {
    public static void main(String[] args) {
        Integer[] arr = {3,4,5};

        List<Integer> a = Arrays.asList(arr);

        int n = a.size();
        int k=1; // rotation times
        int rotation = k%n;
        int q =2;

        int index=0;
        if(q>=rotation){
            index = q-rotation;
        }
        else
            index = q- rotation+n;

        
        System.out.println(a.get(index));

        }
        
       
}

// https://www.hackerrank.com/challenges/circular-array-rotation/problem?isFullScreen=true

// static int[] circularArrayRotation(int[] a, int k, int[] queries) {
//     k = k % a.length;
//     int[] result = new int[queries.length];
//     for (int i = 0; i < result.length; i++) {
//       result[i] = a[(queries[i] - k + a.length) % a.length];
//     }

//     return result;
//   }

// public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     int N = in.nextInt();
//     int K = in.nextInt();
//     int Q = in.nextInt();
//     int rot = K % N;
//     int[] arr = new int[N];
//     for (int i = 0; i < N; i++)
//         arr[i] = in.nextInt();
//     for (int i = 0; i < Q; i++) {
//         int idx = in.nextInt();
//         if (idx - rot >= 0)
//             System.out.println(arr[idx - rot]);
//         else
//             System.out.println(arr[idx - rot + arr.length]);
// 		}
// 	}