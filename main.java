
/**
 * Guess a number program
 *
 * Austin Tan Nguyen
 * Oct 8, 2017
 */

import java.util.Scanner;
import java.util.Random;

public class main
{
    public static void main(String [] args) 
    {
    while(true) {
    Random randomNumber = new Random();
    
    Scanner test = new Scanner(System.in);
    
    int computerChoice = randomNumber.nextInt(10);
    int numberOfTries = 0;
    int numberOfSuccesses = 0;
    int numberOfFailures =0;
    int guess;
    
    System.out.println("Guess a number between 1 and 10 ");
    guess = test.nextInt();
    numberOfTries++;
    
    if (guess != 1 && guess != 2 && guess != 3 && guess != 4 && guess != 5
     && guess != 6 && guess !=7 && guess !=8 && guess !=9 && guess !=  10 ) {
        System.out.println("Invalid input");
    }
        else if (guess == computerChoice) {
            System.out.println("Correct! The number of times you've played is: " +numberOfTries);
            System.out.println("The number was: " + computerChoice);
             numberOfSuccesses++;
             
            System.out.println("Failures: " + numberOfFailures);
            System.out.println("Successes: " + numberOfSuccesses);
            
        }
        else if ( guess > computerChoice) {
            System.out.println("Too high! The Number of times you've played is: " + numberOfTries);
            System.out.println("The number was: " + computerChoice);
            
            numberOfFailures++;
            
            System.out.println("Failures: " + numberOfFailures);
            System.out.println("Successes: " + numberOfSuccesses);
        }
        else if (guess < computerChoice) {
            System.out.println("Too low! The Number of times you've played is: " + numberOfTries);
            System.out.println("The number was: " + computerChoice);
            numberOfFailures++;
            
            System.out.println("Failures: " + numberOfFailures);
            System.out.println("Successes: " + numberOfSuccesses);
        }
    
    double winPercent = numberOfSuccesses *100 / numberOfTries ;
    System.out.println("Win percentage: " + winPercent);
    double losePercent = numberOfFailures *100 / numberOfTries;
    System.out.println("Lose percentage: " + losePercent);
    System.out.println("Do you want to play again? Enter 1 for Yes; 0 for No ");
    if(test.nextInt() !=1) break;
}
}
}
    

   
    

