/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.numberguessinggame;

import java.util.Random;

/**
 *
 * @author hirashahzad
 */
public class Game {

    private int rendomNumber;
    private int points;

    public Game() {
        rendomNumber = 0;
        points = 0;
    }

    public Game(int rendomNumber, int points) {
        this.rendomNumber = rendomNumber;
        this.points = points;
    }

    public void setRendomNumber(int rendomNumber) {
        this.rendomNumber = rendomNumber;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getRendomNumber() {
        return rendomNumber;
    }

    public int getPoints() {
        return points;
    }

    public static int rendomNumbers(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public void matchNumbers(int guessNo, int userNumber, int count) {
        if (userNumber > guessNo) {
            System.out.println("❌ Aww!! You'r Number is Greater");
            
            if (count == 3 && points > 0) {
                points = points - (5 - (count - 1));
            }
        } 
        
        else if (userNumber < guessNo) {
            System.out.println("❌ Aww!! You'r Number is Lower");
            
            if (count == 3 && points > 0) {
                points = points - (5 - (count - 1));
            }
        } 
        
        else if (userNumber == guessNo) {
            System.out.println("✅ Yahh!! Number Marched");
            
            if (count == 1) {
                points = points + 5;

            } 
            else if (count > 1) {
                points = points + (5 - (count - 1));
            }
        }
    }
}
