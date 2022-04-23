package problemSolving;
public class angry_professor {
    public static void main(String[] args) {

        int k =7;
        int [] a = {26, 94, -95, 34, 67, -97, 17, 52, 1, 86};

        int count =0;
        for(int i : a){
            if (i<=0)
                count++;
        }

    
        System.out.println(count>=k ? "NO":"YES");
    }
}


// https://www.hackerrank.com/challenges/angry-professor/problem?isFullScreen=true