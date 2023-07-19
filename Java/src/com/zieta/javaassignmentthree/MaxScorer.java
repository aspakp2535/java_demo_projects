package com.zieta.javaassignmentthree;
import java.util.*;

public class MaxScorer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
        int n = sc.nextInt();
        
        Map<String, Integer> playerScores = new HashMap<>();
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the details of the player " + i + ":");
            System.out.print("Name: ");
            String playerName = sc.next();
            System.out.print("Runs: ");
            int runs = sc.nextInt();
            playerScores.put(playerName, runs);
        }
        
        String maxScorer = "";
        long maxRuns = 0;
        
        for (Map.Entry<String, Integer> entry : playerScores.entrySet()) {
            if (entry.getValue() > maxRuns) {
                maxRuns = entry.getValue();
                maxScorer = entry.getKey();
            }
        }
        
        System.out.println("The player who has scored the maximum runs is: " + maxScorer);
    }
}
