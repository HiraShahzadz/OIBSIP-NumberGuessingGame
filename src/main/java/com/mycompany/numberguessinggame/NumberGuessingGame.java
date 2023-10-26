/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.numberguessinggame;

import java.util.Scanner;

/**
 *
 * @author hirashahzad
 */
public class NumberGuessingGame {

    public static void main(String[] args) {

        Game game = new Game();

        Scanner scanner = new Scanner(System.in);

        int rounds = 0;
        try {
            do {
                System.out.println("🟢 1. Start Game ");
                System.out.println("🔴 2. Quit ");
                rounds = scanner.nextInt();
                if (rounds == 1) {
                    game.setRendomNumber(game.rendomNumbers(1, 100));

                    int count = 1;
                    System.out.print("😁 Hi!");
                    while (count <= 3) {
                        System.out.print(" Guess the Number: ");
                        int number = scanner.nextInt();
                        game.matchNumbers(game.getRendomNumber(), number, count);

                        if (number == game.getRendomNumber()) {
                            count = 4;
                        } else {
                            count++;
                        }
                    };

                    System.out.println("  ");
                    System.out.println("============================ ");
                    System.out.println("✅ Number is: " + game.getRendomNumber());
                    System.out.println("💰 Points: " + game.getPoints());
                    System.out.println("============================ ");
                    System.out.println("  ");
                } else if (rounds != 2) {
                    System.out.println("🚫 Invalid choice. Please enter 1 to Start Game or 2 to Quit.");
                }
            } while (rounds != 2);
            System.out.println("🤩 Thanks for playing Number guessing game 🤩");

        } catch (Exception e) {
            System.out.println("🚫 Error: You Can't Enter a String");
        }
    }
}
