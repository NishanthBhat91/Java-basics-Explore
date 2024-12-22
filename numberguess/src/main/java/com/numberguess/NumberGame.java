package com.numberguess;

import java.util.Scanner;

/**
 * Number Guessing Game
 * This program generates a random number between 0 and 99, and the user must guess it.
 * The program provides feedback if the guess is too high or too low.
 * The game continues until the user guesses correctly.
 */
public class NumberGame {
    public void run(){
        int input = 0;
        int guess = (int) (Math.random() * 100); // Generates a random number between 0 and 99
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number (between 0 and 99).");

        do{
            System.out.print("Enter your guess: ");
            input = sc.nextInt();

            if(input > guess){
                System.out.println("You guessed bigger number! Try Again.");
            }
            else if(input < guess){
                System.out.println("You guessed smaller number! Try Again.");
            }
            else{
                System.out.println("Congratulation!! It was a correct Guess.");
            }
        }while(input != guess);

        sc.close();
    }
}
