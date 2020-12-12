package com.javer.game;

import java.util.Scanner;

public class Game {

    private int randomNumber = (int) (Math.random() * 100) + 1;
    private boolean win;

    public static void play() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            System.out.println("Try to guess this number! \nYou have: " + i + " chance!");
            int guess = scanner.nextInt();
        }
    }

}
