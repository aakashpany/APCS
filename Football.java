import java.util.Random;
import java.lang.Math;
import java.util.Arrays;


public class Football {
   public static void main(String[] args) {
   
      Random rd = new Random();
      
      int numbers[];   
      numbers = new int[10];
      
      for (int k = 0; k < numbers.length; k++) {
         numbers[k] = possession();
      }
      
      int numbers2[];   
      numbers2 = new int[10];
      
      for (int k = 0; k < numbers.length; k++) {
         numbers2[k] = possession();
      }
       
      System.out.println(Arrays.toString(numbers));
      System.out.println("Team 1 Score: " + sum(numbers));
      System.out.println(Arrays.toString(numbers2));
      System.out.println("Team 2 Score: " + sum(numbers2));
      System.out.println(winner(numbers,numbers2));
//      System.out.println(downs());
      
   }
      
   public static int drive() {
         
      int max = 7; 
        
      int min = 0;
      
      int range = max - min + 1;   
         
      int rand;
         
      rand = (int)(Math.random() * range);
            
      if ((rand == 1) || (rand == 4) || (rand == 5)) {
         rand = 0;
      }
      return rand;         
   }
   
   public static int sum(int[] numbers) {
        
      int sum = 0;       
      
      for(int k = 0; k < numbers.length ; k++){         
         sum += numbers[k];
      }
      return sum;
   }
   
   public static String winner(int[] numbers, int[] numbers2) {
      
      String winner = "";
      
      if (sum(numbers) > sum(numbers2)) {
         winner = "Team 1 Wins!";     
      }
      
      else if (sum(numbers) < sum(numbers2)) {
         winner = "Team 2 Wins!";     
      }
      
      else {
         winner = "It is a tie!";
      }
      return winner;
   } 
   
   public static int downs() {
      
      int yards[];   
      yards = new int[4];
      
      int max = 10; 
        
      int min = -10;
      
      int range = max - min + 1;   
         
      int rand;
      
      String outcome = "";
         
      rand = (int)(Math.random() * range) + min;
      
      int sumOfYards = 0;       
      
      for(int k = 0; k < yards.length ; k++){         
         yards[k] = rand;
         sumOfYards += yards[k];
         if (sumOfYards > 10) {
         return sumOfYards;
         }
      }
      
      if (sumOfYards < 10) {
         sumOfYards = 0;
      }
//       
//       else {
//          outcome = "Turnover on Downs";
//       }
      
      return sumOfYards;
   }
   
   public static int possession() {
      
      int totalYards = 0;
      int noOfYards = downs();
      
      while (noOfYards>10 || totalYards < 100) {
         totalYards += noOfYards;
         System.out.println(noOfYards);
         noOfYards=downs();   
      }
      
      if (totalYards > 100) {
         return 7;
      }
      
      else if (totalYards > 60 && totalYards < 100) {
         return 3;
      }
      
      else {
         return 0;
      }  
   }    
}

