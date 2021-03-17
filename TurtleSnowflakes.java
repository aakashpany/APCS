import java.util.*;
import java.awt.*;

public class TurtleSnowflakes {
  public static void main(String[] args) {
      World world = new World(300,300);
      Turtle yertle = new Turtle(world);
      yertle.setColor(Color.blue);

      // Use this variable in the loops
      int turnAmount = 30;

      // 1. Write a for loop that runs many times
      // 2. Change it to use turnAmount to figure out how many times to run
      for (int k = 1; k <= 360/ turnAmount; k++) {
            
      } 
         
        // 1. Add an if statement that changes the colors depending on the loop variables
         if (k % 3 == 0) {
            yertle.setColor(Color.blue);
         }
         
         else {
            yerle.setColor(Color.green);
         } 
         // 2 & 3. Write an inner loop that draws a triangle (3 sides, 120 degree turns)
         // 4. Then change it to be any polygon with a variable n
         for (int sides = 1; sides <=3; sides++) {
            yertle.forward();
            yertle.turn(120);         
         }  
         

         // turn turnAmount degrees before drawing the polygon again
         yertle.turn(turnAmount);
        
      world.show(true);
  }
}
