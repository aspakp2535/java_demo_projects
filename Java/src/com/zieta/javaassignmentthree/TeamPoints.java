package com.zieta.javaassignmentthree;

import java.util.ArrayList;

import java.util.Scanner;

public class TeamPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<Integer>();
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            int score = scanner.nextInt();
            scores.add(score);
        }
        
        int totalPoints = 0;
        for (int score : scores) {
            totalPoints += score;
        }
        System.out.println("Total points: " + totalPoints);
        
        float averagePoints = (float) totalPoints / n;
        System.out.println("Average points: " + averagePoints);
        
        scanner.close();
    }
}
