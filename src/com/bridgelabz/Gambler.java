package com.bridgelabz;
import java.util.*;
public class Gambler {

    static int INITIAL_STAKE=100;
    static int BET_AMOUNT=1;
    static int win = 1;


    public static void main(String[] args) {
        System.out.println("Welcome to Gambling Simulator\n");

        System.out.println("Initial Amount = $"+INITIAL_STAKE);
        System.out.println("Bet Amount = $"+BET_AMOUNT);


        while(INITIAL_STAKE <150 && INITIAL_STAKE >50){
            int result = (int)(Math.random()*10)%2;

            if (result == win){
                System.out.println("You Won $"+BET_AMOUNT);
                INITIAL_STAKE = INITIAL_STAKE + BET_AMOUNT;
            }
            else{
                System.out.println("You Lost $"+BET_AMOUNT);
                INITIAL_STAKE = INITIAL_STAKE - BET_AMOUNT;
            }
        }
        System.out.println("You have $"+INITIAL_STAKE+" left");

    }
}
