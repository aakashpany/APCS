import java.util.Scanner;
import java.util.Random;

public class Sums {
   
   public static void main (String[] args) {
      
      Random rd = new Random();
      
      int numbers[];   
      numbers = new int[10];         
      
      for (int k = 0; k < numbers.length; k++) {
         numbers[k] = rd.nextInt(10);
      }
        
      System.out.println("sum: " + sum(numbers));
      
//       System.out.println("average: " + average(numbers));
//       
//       System.out.println("even number sum: " + sumEvenSlots(numbers));
//       
//       System.out.println("even Integer sum: " + sumConditionalIntegers(numbers,"EVEN"));
//       
//       System.out.println("odd Integer sum: " + sumConditionalIntegers(numbers,"ODD"));
   
   }  
    
           
   public static int sum(int[] numbers) {
        
      int sum = 0;       
      
      for(int k = 0; k < 10; k++){         
         sum += numbers[k];
      }
      return sum;
   }
   
   public static int sumEvenSlots(int[] numbers) {
      
      int sum = 0;       
      
      for(int k = 0; k < 100; k += 2){         
         sum += numbers[k];
      }
      return sum;
   
   }  
   
   public static int sumConditionalIntegers(int[] numbers, String value) {
      
      int sumEven = 0; 
      int sumOdd = 0;      
      
      
      
      
      for (int k = 0; k < 100; k ++){         
         
         if (value == "EVEN") {
            
            if (numbers[k] % 2 == 0) {
                sumEven += numbers[k];   
            }
      } 
          
         else if (numbers[k] % 2 !=0)  {
            
            if (value == "ODD") {
               sumOdd += numbers[k];
            }  
         } 
      }
         
         if (value == "EVEN") {
            return sumEven;
         }
         
         else {
            return sumOdd;
         }
   
   } 
   
   
   public static int average(int[] numbers) {
      
      
      int average = (sum(numbers)/100);
      
      return average;
   }
   
   
      
     
    
}
    
    

   
   
