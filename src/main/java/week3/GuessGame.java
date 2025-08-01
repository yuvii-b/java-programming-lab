package week3;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    private static final Random random = new Random();
    public static final Scanner scanner = new Scanner(System.in);
    private int totalGuesses = 0;
    private int totalGames = 0;

    public void playGame(){
        totalGames++;
        int secretNumber = random.nextInt(100) + 1; // generate secret number (1 to 100)
        int remainingAttempts = 10;
        int validGuessesThisGame = 0;

        gameloop: // usage of labels
        while(remainingAttempts > 0){
            System.out.print("Guess a number between (1-100) or -1 to quit: ");
            int userGuess = scanner.nextInt();
            if(userGuess == -1){
                System.out.println("Exiting current game");
                break gameloop;
            }
            if(userGuess < 1 || userGuess > 100){
                System.out.println("Guess between (1-100), Attempts remaining: " + remainingAttempts);
                continue; // skips without counting attempt
            }
            validGuessesThisGame++;
            remainingAttempts--;
            if(userGuess == secretNumber){
                System.out.println("Congratulations, You have won the game");
                break;
            }
            else if(userGuess < secretNumber){
                System.out.println("You guess is too low, Attempts remaining: " + remainingAttempts);
            }
            else {
                System.out.println("Your guess is too high, Attempts remaining: " + remainingAttempts);
            }
        }
        totalGuesses += validGuessesThisGame;
    }

    public void viewStatus(){
        if(totalGames == 0){
            System.out.println("You have not played any games yet. Please play a game and view status");
        }
        else{
            System.out.println("Status of GuessGame: ");
            System.out.println("Total Games Played: " + totalGames);
            System.out.println("Total Guesses: " + totalGuesses);
            System.out.println("Average guesses per game " + (totalGuesses / totalGames));
        }

    }

    public static void main(String[] args) {
        System.out.println("Name: Yuvaraj B(2024503541) | Week3 | Question - Guessing Game\n");

        GuessGame guessGame = new GuessGame();
        System.out.println("Welcome to Guessing Game");
        char choice;
        int value;
        do{
            System.out.println("1) Play Game: ");
            System.out.println("2) View Status: ");
            System.out.println("3) Quit");
            System.out.print("Enter your choice: ");
            value = scanner.nextInt();
            switch (value){
                case 1 -> guessGame.playGame();
                case 2 -> guessGame.viewStatus();
                case 3 -> {
                    System.out.println("Quitting");
                    return;
                }
                default -> System.out.println("Invalid choice, Try again!");
            }
            System.out.print("Do you want to try again (y or n): ");
            choice = scanner.next().charAt(0);
        }while(choice != 'n');
    }
}