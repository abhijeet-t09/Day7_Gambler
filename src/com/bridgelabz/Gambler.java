package com.bridgelabz;
import java.util.*;
public class Gambler {

    static int INITIAL_STAKE = 100;
    static int BET_AMOUNT = 1;
    static int win = 1;
    static int daysWon = 0;
    static int daysLost = 0;
    static int totalAmountWon = 0;
    static int totalAmountLost = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator\n");

        System.out.println("Initial Amount = $" + INITIAL_STAKE);
        System.out.println("Bet Amount = $" + BET_AMOUNT);

        for (int day = 1; day <= 20; day++) {
            while (INITIAL_STAKE < 150 && INITIAL_STAKE > 50) {
                int result = (int) (Math.random() * 10) % 2;

                if (result == win) {
                    System.out.println("You Won $" + BET_AMOUNT);
                    INITIAL_STAKE = INITIAL_STAKE + BET_AMOUNT;

                } else {
                    System.out.println("You Lost $" + BET_AMOUNT);
                    INITIAL_STAKE = INITIAL_STAKE - BET_AMOUNT;
                }
            }
            System.out.println();
            if (INITIAL_STAKE > 100) {
                totalAmountWon += 50;
                System.out.println("Won on day " + day + " is " + (INITIAL_STAKE - 100));
                daysWon++;
            }
            else {
                totalAmountLost -= 50;
                System.out.println("Loss on day " + day + " is " + (100 - INITIAL_STAKE));
                daysLost++;
            }
        }
        System.out.println();
        System.out.println("Total Amount Won: " + totalAmountWon);
        System.out.println("Total Amount Lost " + totalAmountLost);
        System.out.println("No. of Days Won: " + daysWon);
        System.out.println("No. of Days Lost: " + daysLost);
    }
}
