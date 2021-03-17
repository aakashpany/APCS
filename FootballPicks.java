import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;


public class FootballPicks {
   public static void main (String [] args) {
      readFile("players.data");
//      System.out.println(Arrays.toString(readFile("players.data").toArray()));
      List<String> players = readFile("players.data");
      
      for (int k = 0; k < players.size(); k++) {
         System.out.println(players.get(k));
   
      String[] players2 = players.get(k).split(" ");

      for (String p : players2)
         System.out.println(p);
      }
   }     
   
   private static List<String> readFile(String filename)
   
   {
      List<String> records = new ArrayList<String>();
      try
      {
         BufferedReader reader = new BufferedReader(new FileReader(filename));
         String line;
         while ((line = reader.readLine()) != null)
         {
            records.add(line);
         }
         reader.close();
         return records;
      }
      catch (Exception e)
      {
         System.err.format("Exception occurred trying to read '%s'.", filename);
         e.printStackTrace();
         return null;
      }
   }
 
}