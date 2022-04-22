package problemSolving;
import java.util.Scanner;

public class _utopian_tree {
    public static void main(String[] args) {
        //every 2 cycle : spring double in height; summer increases by 1m
        Scanner in = new Scanner(System.in);
        int numCases = in.nextInt();
        for (int i = 0; i < numCases; i++) {
            int n = in.nextInt();
            int answer = ((int) Math.pow(2, (n + 3) / 2)) + (((int) Math.pow(-1, n)) - 3) / 2;
            System.out.println(answer);
        }

    }
    }

// https://www.hackerrank.com/challenges/utopian-tree/problem?isFullScreen=true