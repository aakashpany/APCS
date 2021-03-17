import java.util.Scanner;

/**
   Aakash Pany 12/7/20
   This program runs the program: "Magpie4"
 */
public class MagpieRunner4 {
/*
      Create a Magpie, give it user input, and print its replies.
*/
   public static void main(String[] args)
   {
      Magpie4 maggie = new Magpie4();
   
      System.out.println (maggie.getGreeting());
      Scanner in = new Scanner (System.in);
      String statement = in.nextLine();
   
   // Output based on input, ends run if input "Bye"
              
      while (!statement.equals("Bye"))
      {
         System.out.println (maggie.getResponse(statement));
         statement = in.nextLine();
      }
              
      System.out.println(maggie.getGoodbye());
   }
}