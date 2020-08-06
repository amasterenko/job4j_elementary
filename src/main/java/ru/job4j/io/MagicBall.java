package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        Scanner sc = new Scanner(System.in);
        String question = sc.nextLine();
        int answer = new Random().nextInt(3);
        System.out.println("Вопрос: " + question);
        System.out.print("Овет: ");
        if (answer == 0) {
            System.out.print("Да.");
        } else if (answer == 1) {
            System.out.print("Нет.");
        } else {
            System.out.print("Может быть.");
        }
    }
}
