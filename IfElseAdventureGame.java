/* Aakash Pany
   11/17/2020
   
   If-else adventure game code along
*/

import java.util.Scanner;

public class IfElseAdventureGame {
   public static void main(String[] args) {
   // create a scanner object
      Scanner scan = new Scanner(System.in);
      
   // print initial input and user prompt
      System.out.println("You are on an island surrounded by water.");
      System.out.println("There is a path to the woods to the north, the sea to the south"); 
      System.out.println("There is a beach shack to the east."); 
      System.out.println("Which way do you want to go (n,e,s,w)?");
     
     // get user input
      String command = scan.nextLine();
      
      String adventure = "";
     
    // Add else-ifs for each direction
      if (command.equals("n")) {
         adventure = goNorth();
      }
      else if (command.equals("e")) {
         adventure = goEast();
      }
      else if (command.equals("s")) {
         adventure = goSouth();
      }
      else if (command.equals("w")) {
         adventure = goWest();
      }
      // Add else-ifs for s, e, and an else for any other input. Be creative!
      
      System.out.print(adventure);

      System.out.println("\n\nThat was a great adventure!");
      scan.close();
   }
   
      // print each message   
   public static String goNorth() {
      String north = "You enter the forest and hear some rustling.";
      north += "\nThere may be tigers here or maybe it's just monkeys.";
      return north;
   }
   
   public static String goEast() {
      String east = "You walk toward the beach shack.";
      return east;
   }
   
   public static String goSouth() {
      String south = "You walk to the ocean.";
      return south;
   }
   
   public static String goWest() {
      String west = "You walk toward a mountain.";
      return west;
   }
   
   
}