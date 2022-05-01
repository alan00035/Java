import java.util.Arrays;
import java.util.List;
public class circular_array_rotation {
    public static void main(String[] args) {

        Integer[] a = {3,4,5};

        int k =2;

        List<Integer> arr = Arrays.asList(a);

        int[] array = new int[a.length];

        for(int i=0; i< arr.size(); i++){
            array[(i+k)%arr.size()] = arr.get(i);
        }

        System.out.println(array[2]);
        }
        
       
}

// https://www.hackerrank.com/challenges/circular-array-rotation/problem?isFullScreen=true
// 2)
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