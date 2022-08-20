public class day0_weighted_mean {
    public static void main(String[] args) {

        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // int n = Integer.parseInt(bufferedReader.readLine().trim());

        // List<Integer> vals = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //     .map(Integer::parseInt)
        //     .collect(toList());

        // List<Integer> weights = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //     .map(Integer::parseInt)
        //     .collect(toList());

        // Result.weightedMean(vals, weights);

        // bufferedReader.close();

        int[] x ={1,2,3};
        int[] w ={5,6,7};
        int count =3;
        double total1 =0;
        double total2 =0;

        for(int i =0; i<count; i++){
           total2 += x[i]*w[i];
           total1 += w[i];
        }

        double result = total2/total1;
       System.out.printf("%.1f", result);
    }
}


// https://www.hackerrank.com/challenges/s10-weighted-mean/problem?isFullScreen=true