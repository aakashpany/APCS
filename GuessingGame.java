
import java.util.Scanner;

public class GuessingGame {
   public static void main(String[] args) {
      
      // Create a scanner object
         Scanner scan = new Scanner(System.in);
     
   // Choose a random number from 0-1000 
      int rand = (int) (Math.random() * 1001);
   
      // Ask the user to guess a number from 0 to 1000 
      System.out.println("Guess a number between 0 and 1000: ");
      
   // Get the first guess using scan.nextInt();
      int guess = scan.nextInt();
      
      int numberOfGuesses = 1;
   
   // Loop while the guess does not equal the random number.
      while (guess != rand) {   
       
      // If user guess > 1000, tell them directions again.
         while (guess > 1000) {
            System.out.println("Guess a number between 0 and 1000.");
            guess = scan.nextInt();
            numberOfGuesses += 1;
         }
       
      // If user guess < 0, tell them directions again.
         while (guess < 0) {
            System.out.println("Guess a number between 0 and 1000.");
            guess = scan.nextInt();
            numberOfGuesses += 1;
         }
         
      // If the guess is less than the random number
         if (guess < rand) {
            System.out.println("Your guess is too low.");
         }
         
      // If the guess is greater than the random number
         if (guess > rand) {
            System.out.println("Your guess is too high.");
         }
         
      // Print "try again"
         System.out.println("try again.");            
         
      // Get a new guess         
         guess = scan.nextInt();
      
      // add 1 to int variable number of guesses.
         numberOfGuesses += 1;
      }
   
      // After Loop Message
      System.out.println("You got it!");
   
      // How many guesses it took
      System.out.println("The number of guesses it took you is " + numberOfGuesses + "!");
   }
}