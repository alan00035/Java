public class flatland_space_stations {
    public static void main(String[] args) {
        int n =3; //cites
        int[] c= {1}; //cites has space station

        int max = 0;
        for(int j=1; j<c.length; j++){
            for(int i =0; i<n; i++){
                int distance = Math.abs(Math.max(c[j-1]-i, c[j]-i)) ;
                if(distance>max)
                    max = distance;
            }

        }
        System.out.println(max);
    }
}

// https://www.hackerrank.com/challenges/flatland-space-stations/problem?isFullScreen=true