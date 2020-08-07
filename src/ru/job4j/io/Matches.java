package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int matches = 11;
        boolean player = true;
        System.out.println("----------------The Matches----------------");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(matches + " left on the table.");
            System.out.println("Player-" + (player ? 1 : 2) + ", take 1-3 matches from the table:");
            int turn = Integer.valueOf(sc.nextLine());
            if (turn >= 1 && turn <= 3) {
                matches -= turn;
                player = !player;
                System.out.println("----------------------------------------");
            }
        } while (matches > 0);
        System.out.println("Player-" + (!player ? 1 : 2) + " wins!");
    }
}
