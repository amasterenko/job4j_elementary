package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int matches = 11;
        byte player = 1;
        System.out.println("----------The Matches-------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("There are " + matches + " matches on the table.");
        while (true) {
            System.out.println("Player-" + player + ", take 1-3 matches from the table:");
            int turn = Integer.valueOf(sc.nextLine());
            if (turn >= 1 && turn <= 3) {
                matches -= turn;
                if (matches <= 0) {
                    System.out.println("Player-" + player + " wins!");
                    break;
                } else {
                    System.out.println(matches + " matches left.");
                    player = player == 1 ? ++player : --player;
                }
                System.out.println("-------------------------------");
            }
        }
    }
}
