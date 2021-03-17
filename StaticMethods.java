/*
   Aakash Pany
   October 19, 2020
   This program creates a certain pattern using static methods, escape sequences,
   and print statements.
*/
   
public class StaticMethods{

/* 
   The 4 lines in the main method combine all the other code consicely
   to create the shape.
*/
  
   public static void main(String[] args){
      firstQuarter();
      secondQuarter();
      thirdQuarter();
      fourthQuarter();
   }

// This method prints the 7 underscore charecters (repeated throughout).      
   
   public static void mainTop(){
      System.out.println("  _______  " );
   }
   
// This method prints the first layer of forward and backward slashes.  
   
   public static void sideFirstLayer(){
      System.out.println(" /       \\ ");
   }
   
// This method prints the second layer of forward and backward slashes(connected to first layer).
     
   public static void sideSecondLayer(){
      System.out.println("/         \\");
   }

// This method does the same as layer 2, but switches the positioning of the slashes.  
    
   public static void sideThirdLayer(){
      System.out.println("\\         /");
   }

// This method does the same as layer 1, but switches the positioning of the slashes.
   
   public static void sideFourthLayer(){
      System.out.println(" \\_______/");
   }

/* 
   this method creates the top half of the hexagon by combining 
   the underscore charecters, and the first 2 layers of slashes.
*/
   
   public static void createHexagonTopHalf(){
      mainTop();
      sideFirstLayer();
      sideSecondLayer();
   }

/* 
   This method combines the 3rd and 4th layers of slashes 
   to create the bottom half of the hexagon.
   
*/

   public static void createHexagonBottomHalf(){ 
      sideThirdLayer();
      sideFourthLayer();
   }

// This method created the pattern of quote marks and underscores.   
   
   public static void straightLinePattern(){
      System.out.println("-\"-'-\"-'-\"-");
   }

/* 
   This method created the first quarter of the object,
   combining the hexagon and the straight line pattern.
*/
 
   public static void firstQuarter(){
      createHexagonTopHalf();
      createHexagonBottomHalf();
      straightLinePattern();
   }

// This method does the same as firstQuater, but it makes up the second quarter of the object.   
   
   public static void secondQuarter(){
      createHexagonTopHalf();
      createHexagonBottomHalf();
      straightLinePattern();
   }
   
/*
   This method creates the third quarter of the object, 
   combines portions of the hexagon and straight line pattern.
*/
   
   public static void thirdQuarter(){
      createHexagonBottomHalf();
      createHexagonTopHalf();
      straightLinePattern();
   }

// This method creates the last quarter of the shape by making the bottom half of the hexagon.   
   
   public static void fourthQuarter(){
      createHexagonBottomHalf();
   }   
}
