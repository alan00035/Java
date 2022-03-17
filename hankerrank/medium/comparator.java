package hankerrank.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Checker implements Comparator<Player>{
    public int compare(Player p1, Player p2){
        if(p2.score != p1.score){                 //descending by swipe players' order
         return p1.score - p2.score ;}
        else
         return p1.name.compareTo(p2.name);       //alphabeta is ascending hence p1 then p2
        
        
    }
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class comparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

// https://www.hackerrank.com/challenges/java-comparator/problem?isFullScreen=true