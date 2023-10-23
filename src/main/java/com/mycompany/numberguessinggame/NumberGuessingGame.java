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

        System.out.println("🟢 1. Start Game ");
        System.out.println("🔴 2. Quit ");
        
        rounds = scanner.nextInt();
        
        while (rounds < 2) {
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
            System.out.println("🟢 1. Next Round ");
            System.out.println("🔴 2. Quit ");
            rounds = scanner.nextInt();
        };

    }
}
