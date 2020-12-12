package com.javer.menu;

import com.javer.game.Game;

public class Menu {

    public static void start() {
        System.out.println("Welcome in Number Game!");
        showMenu();
    }

    static void showMenu() {
        System.out.println("You must guess random number between 1 and 100.");
        System.out.println("You have 10 chance!");
        Game.play();
    }
}
