public class _queens_attack_2 {
    public static void main(String[] args) {
        int n =8, k=0, rq =4, cq=4;  //n is the lenght of board; k is number of obstracles

        int left = rq -1;
        int right = n-rq;
        int top = cq -1;
        int down = n -cq;
        int dtl = Math.min(top, left);
        int dtr = Math.min(top, right);
        int dwl = Math.min(left, down);
        int dwr = Math.min(right, down);



        


    }
}

// https://www.hackerrank.com/challenges/queens-attack-2/problem?isFullScreen=true


// public final class Solution {
//     public static final void main(String[] args) {
//       int n, rq, cq;
//       Set<Long> o;
//       try (Scanner in = new Scanner(System.in)) {
//         n = in.nextInt();
//         int k = in.nextInt();
//         rq = in.nextInt();
//         cq = in.nextInt();
//         o = new HashSet<>(k);
//         while (k --> 0) {
//           int ro = in.nextInt(), co = in.nextInt();
//           o.add((long)ro << 32 | co);
//         }
//       }
//       int t = 0;
//       for (int d[] : new int[][] {{-1, -1}, {-1,  0}, {-1, +1},
//                                   { 0, -1},           { 0, +1},
//                                   {+1, -1}, {+1,  0}, {+1, +1}}) {
//         for (int r = rq + d[0], c = cq + d[1];
//              1 <= r && r <= n && 1 <= c && c <= n && !o.contains((long)r << 32 | c);
//              r += d[0], c += d[1]) {
//           t++;
//         }
//       }
//       System.out.println(t);
//     }
//   }