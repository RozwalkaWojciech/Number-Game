package com.javer.game;

import java.util.Scanner;

public class Game {

    private static final int RANDOM_NUMBER = (int) (Math.random() * 100) + 1;

    public static void play() {

        Scanner scanner = new Scanner(System.in);
        boolean win;

        for (int i = 10; i > 0; i--) {
            System.out.println("Try to guess this number! \nYou have: " + i + " chance!");
            win = checkNumber(scanner.nextInt());
            if (win) {
                System.out.println("AWESOME! You WIN! The number is " + RANDOM_NUMBER + ".");
                break;
            }
        }
        System.out.println("GAME OVER!!! \nThe number is: " + RANDOM_NUMBER + "!");
    }

    static boolean checkNumber(int guessNumber) {

        if (guessNumber < RANDOM_NUMBER) {
            System.out.println("Number is greater than " + guessNumber + "!");
            return false;
        } else if (guessNumber > RANDOM_NUMBER) {
            System.out.println("Number is less than " + guessNumber + "!");
            return false;
        } else {
            return true;
        }
    }
}
