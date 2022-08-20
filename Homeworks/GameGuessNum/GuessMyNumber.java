import java.util.Scanner;
import java.util.Random;

/**
 *Write a program that simulates the guess a number game. The program should generate a random number
 *  between 1 and N (N should be read from the input) and the user needs to guess it.
 *  If the user enters a number less than guessed, the program needs to output “Try Again! You guessed too high”.
 *  If the user enters a number greater than guessed - the program should output “Try Again! You guessed too small”.
 *  If the user guesses the number correctly - the program should output “That’s it!” and finish.
 */


public class GuessMyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input game limit: ");
        int n = sc.nextInt();
        System.out.println("Game started!\n");
        play(secretNum(n));
    }


    public static int secretNum(int num){
        //return random integer value from 1 to N
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(num) + 1;
    }


    public static void play(int randomNumber){
        //larger-smaller game code
        int number = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Input number: ");
            number = sc.nextInt();
            if (randomNumber == number){
                System.out.println("That’s it!");
            }else if(randomNumber < number){
                System.out.println("Try Again! You guessed too small");
            }else{
                System.out.println("Try Again! You guessed too high");
            }
            System.out.println();
        }   while (randomNumber!= number);
    }
}