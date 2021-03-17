/* 
   Aakash Pany
   January 15, 2021
   Nested Loops Program that Prints different figures
*/

public class ForLoops {   
   public static void main (String []args) {
   
      // print all 6 figures
   
      figure1();
      System.out.println();
      
      figure2(); 
      System.out.println();
         
      figure3();
      System.out.println();
      
      figure4();
      System.out.println();
      
      figure5();
      System.out.println();
      
      figure6();
   }
  
   // figure 1 method using nested loop
 
   public static void figure1() {
      
      int count = 1;
      
      // loop for rows
     
      for (int row = 0; row <= 5; row++) {
         
         // inner loop for columns
         
         for (int col = 0; col <= row; col++) {
            System.out.print(count);     
         }
         
         System.out.println();
         count++;
      }   
   }
   
   // figure 2 method using nested loop
   
   public static void figure2() {
      
      // loop to repeat inner loops
      
      for (int row = 0; row <= 6; row++) {
      	
         // loop to print spaces
        
         for (int col = 0; col <= row * -1 + 5; col++) {
            System.out.print(" ");
         }
      	
         // loop to print numbers 
         
         for (int num = 1; num <= row; num++) {
            System.out.print(row);
         }
      	
         System.out.println();
      
      }
   }
   
   // figure 3 method using nested loop
   
   public static void figure3() {
   
      int count = 0;
      
      // loop to print figure
      
      for (int row = 0; row < 6; row++) {
         
         // loop to print spaces
         
         for (int col = 0; col < row; col++) {    
            System.out.print(" ");
         }
         
         // loop to print numbers
         
         for (int col = row; col < 6; col++) {    
            System.out.print(count % 3);            
         }
         
         System.out.println();
         count++;      
      }
   }
   
   // figure 4 method using nested loop
   
   public static void figure4() {
      
      // loop to print figure
      
      for (int row = 6; row > 0 ;row--) {
         
         // loop to print "/"
         
         for (int col = 0; col < 6 - row; col++) {
            System.out.print("/");
         }
         
         // loop to print "*"
         
         for (int col = 0; col < (row * 2) - 1; col++) {
            System.out.print("*");
         }
      
         // loop to print "\"
      
         for (int col = 6; col > row; col--) { 
            System.out.print("\\"); 
         }
         
         System.out.println();
      } 
   }
   
   // figure 5 method using nested loop
   
   public static void figure5() {
       
      // loop to print figure
      
      for (int row = 1; row < 6 ;row++) {
         
         // loop to print spaces
         
         for (int col = 0; col < 6 - row; col++) {
            System.out.print(" ");
         }
         
         System.out.print("/");
         
         // loop to print ":"
         
         for (int col = 0; col < (row * 2) - 1; col++) {
            System.out.print(":");
         }
         
         System.out.println("\\");
      } 
   }
   
   // figure 6 method using triple nested loop
   
   public static void figure6() {
      
      // outer loop to repeat
      
      for (int k = 1; k <= 5; k++) {         
         
         // loop to format figure
         
         for (int a = k; a <= 5; a++) {      
            
            // loop to print numbers
            
            for (int b = 1; b <= a; b++) {  
               System.out.print(a);
            }
         } 
      
         System.out.println();
      }
   }
}
      
   

