public class Magpie2
{
   public String getGreeting()
   {
      return "Hello, let's talk.";
   }

   public String getResponse(String statement) {
      statement = statement.trim();
      String response = "";
   
   // If statement for family members      
      if (statement.indexOf("mother") >= 0
            || statement.indexOf("father") >= 0
            || statement.indexOf("sister") >= 0
            || statement.indexOf("brother") >= 0) {
         response = "Tell me more about your family.";
      }
      
      // If statement for pets      
      else if (statement.indexOf("cat") >= 0
            ||statement.indexOf("dog") >= 0
            ||statement.indexOf("bird") >= 0) {
         response = "Tell me more about your pets.";
      } 
      
      // If statement for "no"           
      else if (statement.indexOf("no") >= 0) {
         response = "Why so negative?";
      } 
      
      // If statement for nothing inputed      
      else if (statement.length() == 0) {
         response = "Say something, please.";
      } 
      
      // Random response If statement     
      else {
         response = getRandomResponse();
      }
      
      return response;
   }

// Random Response method, prints one of 4 outputs
   private String getRandomResponse() {
   
      final int NUMBER_OF_RESPONSES = 4;
      double r = Math.random();
      
      int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
      String response = "";
   
      if (whichResponse == 0) {
         response = "Interesting, tell me more.";
      } else if (whichResponse == 1) {
         response = "Hmmm.";
      } else if (whichResponse == 2) {
         response = "Do you really think so?";
      } else if (whichResponse == 3) {
         response = "You don't say.";
      }  
      return response;
   }
       /**
        * Search for one word in phrase. The search is not case
        * sensitive. This method will check that the given goal
        * is not a substring of a longer string (so, for
        * example, "I know" does not contain "no").
        *
        * @param statement
        *            the string to search
        * @param goal
        *            the string to search for
        * @param startPos
        *            the character of the string to begin the
        *            search at
        * @return the index of the first occurrence of goal in
        *         statement or -1 if it's not found
        */
  
// method that locates keyword in inputs  
   private int findKeyword(String statement, String goal, int startPos)
   {
      String phrase = statement.trim();
        // The only change to incorporate the startPos is in
        // the line below
      int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
   
      // Refinement--make sure the goal isn't part of a word
      while (psn >= 0)
      {
      // Find the string of length 1 before and after the word
         String before = " ", after = " ";
         if (psn > 0)
         {
            before = phrase.substring(psn - 1, psn).toLowerCase();
         }
         if (psn + goal.length() < phrase.length())
         {
            after = phrase.substring(psn + goal.length(), 
                                     psn + goal.length() + 1).toLowerCase();
         }
      
         /* determine the values of psn, before, and after at this point */
         System.out.println("position: " + psn);
         System.out.println("before: \"" + before + "\"");
         System.out.println("after: \"" + after + "\"");
         
         // If before and after aren't letters, we've
         // found the word
         if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) 
         // before is not a letter
         && ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
         {
            return psn;
         }
      
         // The last position didn't work, so let's find
         // the next, if there is one.
         psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
      
      }
   
      return -1;
   }
   
// Method to end conversation      
   public String getGoodbye() {
      return "It was fun talking to you. See ya later!";
   }
   
// Examples of inputs and outputs   
   public static void main(String[] args) {
      Magpie2 maggie = new Magpie2();     
      
      System.out.println(maggie.findKeyword("She's my sister", "sister", 0));
      System.out.println(maggie.findKeyword("Brother Tom is helpful", "brother", 0));
      System.out.println(maggie.findKeyword("I can't catch wild cats.", "cat", 0));
      System.out.println(maggie.findKeyword("I know nothing about snow plows.", "no", 0));
   
      System.out.println(maggie.getGreeting() + "\n");
      System.out.println("> My mother and I talked last night.");
      System.out.println(maggie.getResponse("My mother and I talked last night." + "\n"));
      System.out.println("> I said no.");
      System.out.println(maggie.getResponse("I said no!"));
      System.out.println("> The weather is nice.");
      System.out.println(maggie.getResponse("The weather is nice." + "\n"));
      System.out.println("> Do you know my brother?");
      System.out.println(maggie.getResponse("Do you know my brother?" + "\n"));
      System.out.println("> My dog's name is Hello");
      System.out.println(maggie.getResponse("My dog's name is Hello" + "\n"));
      System.out.println("          ");
      System.out.println(maggie.getResponse("            " + "\n"));
   }
}
